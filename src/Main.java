import me.dio.desafio.dominio.Curso;
import me.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("POO");
        curso.setCarga_horaria(150);
        curso.setDescricao("Neste curso ira adquirir conhecimentos do paradigma orientado a objectos na ling Java");

        mentoria.setTitulo("Como ter sucesso neste curso");
        mentoria.setDescricao("Podera expor as suas duvidas em relacao ao curso");
        mentoria.setData(LocalDate.ofYearDay(2022,20));

        System.out.println(curso);
        System.out.println(mentoria);
    }
}
