package br.ulbra.DAO;

import br.ulbra.Model.Medicamento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MedicamentoDAO extends AbstractDAO {

    public void salvar(Medicamento m) {
        String sql = "INSERT INTO medicamentos (medicamento_id, usuario_id, nome, observacoes) VALUES (?, ?, ?, ?)";
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
        String sql = "UPDATE medicamentos SET medicamento_id=?, usuario_id=?, nome=?, observacoes=? WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, m.getMedicoId());
            stmt.setInt(2, m.getUsuarioId());
            stmt.setString(3, m.getNome());
            stmt.setString(4, m.getObservacoes());
            stmt.setInt(5, m.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Medicamento atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar medicamento: " + e.getMessage());
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM medicamentos WHERE id=?";
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
                m.setId(rs.getInt("id"));
                m.setMedicoId(rs.getInt("medicamento_id"));
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
}
