package br.ulbra.DAO;

import br.ulbra.Model.Medico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO extends AbstractDAO {

    // SALVAR
    public void salvar(Medico medico) {
        String sql = "INSERT INTO medicos (nome, especialidade, crm, telefone, email) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getEspecialidade());
            stmt.setString(3, medico.getCrm());
            stmt.setString(4, medico.getTelefone());
            stmt.setString(5, medico.getEmail());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao salvar médico: " + e.getMessage());
        }
    }

    // EDITAR
    public void editar(Medico medico) {
        String sql = "UPDATE medicos SET nome=?, especialidade=?, crm=?, telefone=?, email=? WHERE medico_id=?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getEspecialidade());
            stmt.setString(3, medico.getCrm());
            stmt.setString(4, medico.getTelefone());
            stmt.setString(5, medico.getEmail());
            stmt.setInt(6, medico.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao editar médico: " + e.getMessage());
        }
    }

    // EXCLUIR
    public void excluir(int id) {
        String sql = "DELETE FROM medicos WHERE medico_id=?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao excluir médico: " + e.getMessage());
        }
    }

    // LISTAR
    public List<Medico> listar() {
        List<Medico> lista = new ArrayList<>();
        String sql = "SELECT * FROM medicos";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Medico m = new Medico();
                m.setId(rs.getInt("medico_id"));
                m.setNome(rs.getString("nome"));
                m.setEspecialidade(rs.getString("especialidade"));
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

    // BUSCAR POR ID
    public Medico buscarPorId(int id) {
        Medico m = null;
        String sql = "SELECT * FROM medicos WHERE medico_id=?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                m = new Medico();
                m.setId(rs.getInt("medico_id"));
                m.setNome(rs.getString("nome"));
                m.setEspecialidade(rs.getString("especialidade"));
                m.setCrm(rs.getString("crm"));
                m.setTelefone(rs.getString("telefone"));
                m.setEmail(rs.getString("email"));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar médico por ID: " + e.getMessage());
        }
        return m;
    }

    // BUSCAR POR CRM
    public Medico buscarPorCrm(String crm) {
        Medico m = null;
        String sql = "SELECT * FROM medicos WHERE crm=?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, crm);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                m = new Medico();
                m.setId(rs.getInt("medico_id"));
                m.setNome(rs.getString("nome"));
                m.setEspecialidade(rs.getString("especialidade"));
                m.setCrm(rs.getString("crm"));
                m.setTelefone(rs.getString("telefone"));
                m.setEmail(rs.getString("email"));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar médico por CRM: " + e.getMessage());
        }
        return m;
    }

    // BUSCAR POR EMAIL
    public Medico buscarPorEmail(String email) {
        Medico m = null;
        String sql = "SELECT * FROM medicos WHERE email=?";
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                m = new Medico();
                m.setId(rs.getInt("medico_id"));
                m.setNome(rs.getString("nome"));
                m.setEspecialidade(rs.getString("especialidade"));
                m.setCrm(rs.getString("crm"));
                m.setTelefone(rs.getString("telefone"));
                m.setEmail(rs.getString("email"));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar médico por email: " + e.getMessage());
        }
        return m;
    }
}
