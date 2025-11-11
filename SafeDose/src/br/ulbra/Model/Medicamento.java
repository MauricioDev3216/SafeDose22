package br.ulbra.Model;

public class Medicamento {
    private int id;                 // ID do medicamento
    private int medicoId;           // FK para tabela de médicos
    private int usuarioId;          // FK para tabela de usuários (pacientes)
    private String nome;            // Nome do medicamento
    private String observacoes;     // Observações do médico
    private String nomeMedico;      // Nome do médico (usado para exibição)
    private String nomePaciente;    // Nome do paciente (usado para exibição)

    // Construtor vazio (obrigatório para DAO e frameworks)
    public Medicamento() {}

    // Construtor sem ID (para inserir novo medicamento)
    public Medicamento(int medicoId, int usuarioId, String nome, String observacoes) {
        this.medicoId = medicoId;
        this.usuarioId = usuarioId;
        this.nome = nome;
        this.observacoes = observacoes;
    }

    // Construtor completo (para listar ou editar)
    public Medicamento(int id, int medicoId, int usuarioId, String nome, String observacoes) {
        this.id = id;
        this.medicoId = medicoId;
        this.usuarioId = usuarioId;
        this.nome = nome;
        this.observacoes = observacoes;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getMedicoId() {
        return medicoId;
    }
    public void setMedicoId(int medicoId) {
        this.medicoId = medicoId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }
    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
}
