package br.ulbra.Controller;

import br.ulbra.DAO.MedicoDAO;
import br.ulbra.Model.Medico;
import java.sql.SQLException;
import java.util.List;

public class MedicoController {

    private final MedicoDAO dao = new MedicoDAO();

    // 🔹 Salvar novo médico
    public void salvar(Medico m) throws SQLException {
        dao.salvar(m);
    }

    // 🔹 Buscar médico por ID
    public Medico buscar(int id) throws SQLException {
        return dao.buscarPorId(id);
    }

    // 🔹 Listar todos os médicos
    public List<Medico> listar() throws SQLException {
        return dao.listar();
    }

    // 🔹 Atualizar dados de um médico existente
    public void atualizar(Medico m) throws SQLException {
        dao.editar(m);
    }

    // 🔹 Remover médico pelo ID
    public void remover(int id) throws SQLException {
        dao.excluir(id);
    }

    // 🔹 (Opcional) Buscar médico pelo CRM — útil para evitar duplicados
    public Medico buscarPorCrm(String crm) throws SQLException {
        return dao.buscarPorCrm(crm);
    }

    // 🔹 (Opcional) Buscar médico pelo e-mail — se houver login
    public Medico buscarPorEmail(String email) throws SQLException {
        return dao.buscarPorEmail(email);
    }
}
