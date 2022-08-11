package me.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int carga_horaria;

    public Curso() {
    }

    @Override
    public double calcular_xp() {
        return XP_PADRAO * carga_horaria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", carga_horaria=" + carga_horaria +
                '}';
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
}
