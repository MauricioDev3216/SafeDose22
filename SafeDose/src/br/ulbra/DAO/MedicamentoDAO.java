package br.ulbra.DAO;

import br.ulbra.Model.Medicamento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MedicamentoDAO extends AbstractDAO {

    public void salvar(Medicamento m) {
        String sql = "INSERT INTO medicamentos (medico_id, usuario_id, nome, observacoes) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, m.getMedicoId());
            stmt.setInt(2, m.getUsuarioId());
            stmt.setString(3, m.getNome());
            stmt.setString(4, m.getObservacoes());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Medicamento salvo com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar medicamento: " + e.getMessage());
        }
    }

    public void editar(Medicamento m) {
        String sql = "UPDATE medicamentos SET medico_id=?, usuario_id=?, nome=?, observacoes=? WHERE medicamento_id=?";
        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, m.getMedicoId());
            stmt.setInt(2, m.getUsuarioId());
            stmt.setString(3, m.getNome());
            stmt.setString(4, m.getObservacoes());
            stmt.setInt(5, m.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar medicamento: " + e.getMessage());
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM medicamentos WHERE medicamento_id = ?";
        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Medicamento excluído com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir medicamento: " + e.getMessage());
        }
    }

    public List<Medicamento> listar() {
        List<Medicamento> lista = new ArrayList<>();
        String sql = "SELECT * FROM medicamentos";

        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Medicamento m = new Medicamento();
                m.setId(rs.getInt("medicamento_id"));
                m.setMedicoId(rs.getInt("medico_id"));
                m.setUsuarioId(rs.getInt("usuario_id"));
                m.setNome(rs.getString("nome"));
                m.setObservacoes(rs.getString("observacoes"));
                lista.add(m);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar medicamentos: " + e.getMessage());
        }

        return lista;
    }

    public List<Medicamento> listarComNomes() {
        List<Medicamento> lista = new ArrayList<>();

        String sql = "SELECT m.medicamento_id, m.medico_id, m.usuario_id, "
                + "m.nome AS nome_medicamento, m.observacoes, "
                + "IFNULL(med.nome, '') AS nome_medico, "
                + "IFNULL(u.nome, '') AS nome_paciente "
                + "FROM medicamentos m "
                + "LEFT JOIN medicos med ON m.medico_id = med.medico_id "
                + "LEFT JOIN usuarios u ON m.usuario_id = u.usuario_id "
                + "ORDER BY m.medicamento_id DESC";

        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Medicamento m = new Medicamento();
                m.setId(rs.getInt("medicamento_id"));
                m.setMedicoId(rs.getInt("medico_id"));
                m.setUsuarioId(rs.getInt("usuario_id"));
                m.setNome(rs.getString("nome_medicamento"));
                m.setObservacoes(rs.getString("observacoes"));

                String nomeMed = rs.getString("nome_medico");
                String nomePac = rs.getString("nome_paciente");

                // debug no console — importante para ver o que está chegando
                System.out.println("DEBUG listarComNomes -> medId=" + m.getMedicoId()
                        + " medNome=[" + nomeMed + "] usrId=" + m.getUsuarioId()
                        + " usrNome=[" + nomePac + "]");

                m.setNomeMedico(nomeMed);
                m.setNomePaciente(nomePac);
                lista.add(m);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao listar medicamentos detalhados: " + e.getMessage());
        }

        return lista;
    }

}
