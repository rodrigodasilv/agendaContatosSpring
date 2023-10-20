package com.agendaContatos.agendaContatos;

import lombok.AllArgsConstructor;

import java.beans.ConstructorProperties;

public class Contato {
    public String nome;
    public Integer telefone;
    public String email;

    public Contato(String nome, Integer telefone, String email) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
}
