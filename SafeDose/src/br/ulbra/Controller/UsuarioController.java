package br.ulbra.controller;

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

    public void atualizar(Usuario u) throws SQLException {
        dao.atualizar(u);
    }

    public void remover(int id) throws SQLException {
        dao.remover(id);
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
