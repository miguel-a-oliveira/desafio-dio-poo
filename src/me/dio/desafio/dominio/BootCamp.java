package me.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

    private String nome;
    private String descricao;
    private final LocalDate data_inicio = LocalDate.now();
    private final LocalDate data_fim = data_inicio.plusDays(45);
    private Set<Dev> devs_incritos = new HashSet<>(); // grupo de devs inscritos que fazem parte deste bootcamp. A ordem eh irrelevante
    private Set<Conteudo> conteudos = new LinkedHashSet<>(); // cursos e mentorias que fazem parte deste bootcamp

    //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(nome, bootCamp.nome) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(data_inicio, bootCamp.data_inicio) && Objects.equals(data_fim, bootCamp.data_fim) && Objects.equals(devs_incritos, bootCamp.devs_incritos) && Objects.equals(conteudos, bootCamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, data_inicio, data_fim, devs_incritos, conteudos);
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public LocalDate getData_fim() {
        return data_fim;
    }

    public Set<Dev> getDevs_incritos() {
        return devs_incritos;
    }

    public void setDevs_incritos(Set<Dev> devs_incritos) {
        this.devs_incritos = devs_incritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
}
