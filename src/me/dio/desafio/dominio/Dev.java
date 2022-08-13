package me.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudo_inscrito = new LinkedHashSet<>(); // os conteudos inscritos seram armazenadas na mesma ordem em que foram inscritos
    private Set<Conteudo> conteudo_concluido = new LinkedHashSet<>(); // os conteudos concluidos seram armazenadas na mesma ordem em que foram concluidos

    public void inscrever_bootcamp(BootCamp bootcamp) {
        //ao se inscrever num bootcamp um dev tera todos os conteudos inscritos do bootcamp
        this.conteudo_inscrito.addAll(bootcamp.getConteudos());
        //adiciona devs
        bootcamp.getDevs_incritos().add(this); // adiciona o dev no bootcamp
    }

    public void progredir() {
        //ao progredir num bootcamp leva o set de conteudos inscritos e adiciona no set de
        // conteudos concluidos em ordem
        Optional<Conteudo> conteudo = this.conteudo_inscrito.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudo_concluido.add(conteudo.get());
            this.conteudo_inscrito.remove(conteudo.get());
        } else {
            // caso a lista de conteudos esteja vazia
            System.err.println("Nao esta inscrito em nenhum conteudo!");
        }
    }

    public double calcular_total_xp() {
        //pega cada conteudo do set conteudo concluido e o seu respectivo XP e soma
        return this.conteudo_concluido.stream().mapToDouble(Conteudo::calcular_xp).sum();
    }

    //metodos equals e hashCode para realizar comparacoes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudo_inscrito, dev.conteudo_inscrito) && Objects.equals(conteudo_concluido, dev.conteudo_concluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudo_inscrito, conteudo_concluido);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudo_inscrito() {
        return conteudo_inscrito;
    }

    public void setConteudo_inscrito(Set<Conteudo> conteudo_inscrito) {
        this.conteudo_inscrito = conteudo_inscrito;
    }

    public Set<Conteudo> getConteudo_concluido() {
        return conteudo_concluido;
    }

    public void setConteudo_concluido(Set<Conteudo> conteudo_concluido) {
        this.conteudo_concluido = conteudo_concluido;
    }
}
