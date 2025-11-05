package br.ulbra.Model;

import java.sql.Date;

public class Usuario {

    private int usuarioId;
    private String nome;
    private String email;
    private String senha;
    private String tipo; // "PACIENTE" OU "CUIDADOR"
    private Date dataNascimento;
    private String telefone;
    private String endereco;
    private java.sql.Timestamp criadoEm;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public java.sql.Timestamp getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(java.sql.Timestamp criadoEm) {
        this.criadoEm = criadoEm;
    }

    // 🔹 Funções auxiliares para verificar o tipo
    public boolean isCuidador() {
        return tipo != null && tipo.equalsIgnoreCase("CUIDADOR");
    }

    public boolean isPaciente() {
        return tipo != null && tipo.equalsIgnoreCase("PACIENTE");
    }

    @Override
    public String toString() {
        return nome + " (" + tipo + ")";
    }
}
