package br.ulbra.Controller;

import br.ulbra.DAO.RotinaDAO;
import br.ulbra.Model.Rotina;
import java.util.List;

public class RotinaController {

    private RotinaDAO dao;

    public RotinaController() {
        dao = new RotinaDAO();
    }

    public List<Rotina> listarPorUsuario(int usuarioId) {
        return dao.listarPorUsuario(usuarioId);
    }

    public void excluir(int idMedicamento) {
        RotinaDAO dao = new RotinaDAO();
        dao.excluir(idMedicamento);
    }
}
