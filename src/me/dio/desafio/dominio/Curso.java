package me.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int carga_horaria;

    public Curso() {
    }

    @Override
    public double calcular_xp() {
        //XP PADRAO sera multiplicado pela carga horaria ao concluir um curso
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

    //Getters & Setters
    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
}
