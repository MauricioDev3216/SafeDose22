package br.ulbra.Model;

public class Medicamento {
    private int id;
    private int medicoId;
    private int usuarioId;
    private String nome;
    private String observacoes;

    public Medicamento() {
    }

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
}
