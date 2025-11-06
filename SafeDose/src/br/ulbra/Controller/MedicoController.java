package br.ulbra.Controller;

import br.ulbra.DAO.MedicoDAO;
import br.ulbra.Model.Medico;
import java.util.List;

public class MedicoController {

    private final MedicoDAO medicoDAO;

    public MedicoController() {
        medicoDAO = new MedicoDAO();
    }

    public boolean salvarMedico(String nome, String especialidade, String crm, String telefone, String email) {
        if (nome.isEmpty() || crm.isEmpty()) {
            System.out.println("Nome e CRM são obrigatórios!");
            return false;
        }

        Medico m = new Medico();
        m.setNome(nome);
        m.setEspecialidade(especialidade);
        m.setCrm(crm);
        m.setTelefone(telefone);
        m.setEmail(email);

        medicoDAO.salvar(m);
        return true;
    }

    public boolean editarMedico(int id, String nome, String especialidade, String crm, String telefone, String email) {
        if (id <= 0) {
            System.out.println("ID inválido!");
            return false;
        }

        Medico m = new Medico();
        m.setId(id);
        m.setNome(nome);
        m.setEspecialidade(especialidade);
        m.setCrm(crm);
        m.setTelefone(telefone);
        m.setEmail(email);

        medicoDAO.editar(m);
        return true;
    }

    public boolean excluirMedico(int id) {
        if (id <= 0) {
            System.out.println("ID inválido!");
            return false;
        }

        medicoDAO.excluir(id);
        return true;
    }

    public List<Medico> listarMedicos() {
        return medicoDAO.listar();
    }
}
