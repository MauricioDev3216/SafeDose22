package br.ulbra.Controller;

import br.ulbra.DAO.MedicamentoDAO;
import br.ulbra.Model.Medicamento;
import java.util.List;

public class MedicamentoController {
    private MedicamentoDAO dao;

    public MedicamentoController() {
        dao = new MedicamentoDAO();
    }

    public void salvar(Medicamento m) {
        dao.salvar(m);
    }

    public void editar(Medicamento m) {
        dao.editar(m);
    }

    public void excluir(int id) {
        dao.excluir(id);
    }

    public List<Medicamento> listar() {
        return dao.listar();
    }

    public List<Medicamento> listarComNomes() {
        return dao.listarComNomes();
    }
}
