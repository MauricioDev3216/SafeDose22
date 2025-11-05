package br.ulbra.DAO;


import br.ulbra.Model.Medico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {

    public void salvar(Medico medico) {
        String sql = "INSERT INTO medico (especialidade, nome, crm, telefone, email) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = AbstractDAO.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, medico.getEspecialidade());
            stmt.setString(2, medico.getNome());
            stmt.setString(3, medico.getCrm());
            stmt.setString(4, medico.getTelefone());
            stmt.setString(5, medico.getEmail());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao salvar médico: " + e.getMessage());
        }
    }

    public void editar(Medico medico) {
        String sql = "UPDATE medico SET especialidade=?, nome=?, crm=?, telefone=?, email=? WHERE id=?";
        try (Connection con = AbstractDAO.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, medico.getEspecialidade());
            stmt.setString(2, medico.getNome());
            stmt.setString(3, medico.getCrm());
            stmt.setString(4, medico.getTelefone());
            stmt.setString(5, medico.getEmail());
            stmt.setInt(6, medico.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao editar médico: " + e.getMessage());
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM medico WHERE id=?";
        try (Connection con = AbstractDAO.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao excluir médico: " + e.getMessage());
        }
    }

    public List<Medico> listar() {
        List<Medico> lista = new ArrayList<>();
        String sql = "SELECT * FROM medico";
        try (Connection con = AbstractDAO.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Medico m = new Medico();
                m.setId(rs.getInt("id"));
                m.setEspecialidade(rs.getString("especialidade"));
                m.setNome(rs.getString("nome"));
                m.setCrm(rs.getString("crm"));
                m.setTelefone(rs.getString("telefone"));
                m.setEmail(rs.getString("email"));
                lista.add(m);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar médicos: " + e.getMessage());
        }
        return lista;
    }

}