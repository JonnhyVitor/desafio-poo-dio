package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public abstract class Conteudo {
    protected final double XP_PADRAO = 10d;

    private String Titulo;
    private String Descricao;

    public abstract double CaucularXp();


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }


    public double calcularXp() {
        return CaucularXp();
    }
}
