package br.ulbra.DAO;

import br.ulbra.Model.Rotina;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RotinaDAO extends AbstractDAO {

    public List<Rotina> listarPorUsuario(int usuarioId) {
        List<Rotina> lista = new ArrayList<>();

        String sql = "SELECT m.medicamento_id AS medicamento_id, m.nome AS nome_medicamento, med.nome AS nome_medico, m.observacoes "
                + "FROM medicamentos m "
                + "JOIN medicos med ON m.medico_id = med.medico_id "
                + "WHERE m.usuario_id = ?";

        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, usuarioId);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Rotina r = new Rotina();
                r.setIdMedicamento(rs.getInt("medicamento_id"));
                r.setNomeMedicamento(rs.getString("nome_medicamento"));
                r.setNomeMedico(rs.getString("nome_medico"));
                r.setObservacoes(rs.getString("observacoes"));
                lista.add(r);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar rotinas: " + e.getMessage());
        }

        return lista;
    }

    public void excluir(int idMedicamento) {
        String sql = "DELETE FROM medicamentos WHERE medicamento_id = ?";
        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idMedicamento);
            stmt.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir medicamento: " + e.getMessage());
        }
    }

}
