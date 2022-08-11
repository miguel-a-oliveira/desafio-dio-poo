import me.dio.desafio.dominio.BootCamp;
import me.dio.desafio.dominio.Curso;
import me.dio.desafio.dominio.Dev;
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

//        System.out.println(curso);
//        System.out.println(mentoria);

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Dev Java");
        bootcamp.setDescricao("Decsricao do BootCamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscrever_bootcamp(bootcamp);
        System.out.println("Conteudo Inscrito Joao" + devJoao.getConteudo_inscrito());

        System.out.println("-------------Progresso Joao--------------");
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudo Inscrito Joao: " + devJoao.getConteudo_inscrito());
        System.out.println("Conteudo Concluido Joao: " + devJoao.getConteudo_concluido());
        System.out.println("XP: " + devJoao.calcular_total_xp());

        System.out.println("\n");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscrever_bootcamp(bootcamp);
        System.out.println("Conteudo Inscrito Maria: " + devMaria.getConteudo_inscrito());

        System.out.println("---------------Progresso Maria------------------");
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("Conteudo Inscrito Maria: " + devMaria.getConteudo_inscrito());
        System.out.println("Conteudo Concluido Maria: " + devMaria.getConteudo_concluido());
        System.out.println("XP: " + devMaria.calcular_total_xp());
    }
}
