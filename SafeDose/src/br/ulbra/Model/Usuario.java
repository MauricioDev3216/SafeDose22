package br.ulbra.Model;

import java.sql.Date;
import java.sql.Timestamp;

public class Usuario {

    private int usuarioId;
    private String nome;
    private String email;
    private String senha;
    private String tipo; // "PACIENTE" OU "CUIDADOR"
    private String dataNascimento;
    private String telefone;
    private String endereco;
    private java.sql.Timestamp criadoEm;

    public int getUsuarioId() {
        return usuarioId;
    }

    public Usuario(int usuarioId, String nome, String email, String senha, String tipo, String dataNascimento, String telefone, String endereco, Timestamp criadoEm) {
        this.usuarioId = usuarioId;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.criadoEm = criadoEm;
    }

    public Usuario(int usuarioId, String nome, String email, String senha, String tipo,
            String dataNascimento, String telefone, String endereco) {
        this.usuarioId = usuarioId;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    

    public Usuario() {
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
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
