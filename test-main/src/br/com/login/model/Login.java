package br.com.login.model;

import java.time.LocalDateTime;

public class Login {
    
    private String nome;
    private String email;
    private String senha;
    private LocalDateTime dataCriacao;

    // Construtor para login existente
    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
        this.dataCriacao = LocalDateTime.now(); // Inicializa com a data e hora atuais
    }
    
    // Método para cadastrar um novo usuário
    public void cadastrar(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha; 
        this.dataCriacao = LocalDateTime.now(); // Define a data e hora atuais
    }

    // Getters e Setters
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

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
