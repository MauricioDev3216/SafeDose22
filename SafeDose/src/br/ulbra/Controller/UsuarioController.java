package br.ulbra.Controller;

import br.ulbra.DAO.UsuarioDAO;
import br.ulbra.Model.Usuario;
import java.sql.SQLException;
import java.util.List;

public class UsuarioController {

    private UsuarioDAO dao = new UsuarioDAO();

    public void salvar(Usuario u) throws SQLException {
        dao.salvar(u);
    }

    public Usuario buscar(int id) throws SQLException {
        return dao.buscarPorId(id);
    }

    public List<Usuario> listar() throws SQLException {
        return dao.listar();
    }

    public List<Usuario> listarPacientes() throws SQLException {
        return dao.listarPorTipo("paciente");
    }

    public List<Usuario> listarCuidadores() throws SQLException {
        return dao.listarPorTipo("cuidador");
    }

    public void atualizar(Usuario u) throws SQLException {
        dao.atualizar(u);
    }

    public void remover(int id) throws SQLException {
        dao.remover(id);
    }
    
    public void removerPaciente(int id) throws SQLException {
        dao.removerPaciente(id);
    }

    // 🔹 Novo: buscar usuário por e-mail (ex: para evitar duplicado)
    public Usuario buscarPorEmail(String email) throws SQLException {
        return dao.buscarPorEmail(email);
    }

    // 🔹 Novo: autenticação (login)
    public Usuario autenticar(String email, String senha) throws SQLException {
        return dao.autenticar(email, senha);
    }
}
