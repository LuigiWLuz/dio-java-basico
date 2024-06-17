package desafio_POO;

import java.time.LocalDate;


public class mains {

    public static void main(String[] args) {
        Cursos curso1 = new Cursos();
        curso1.setTitulo("Admistração");
        curso1.setDescricao("Você administra -u-");
        curso1.setCargaHoraria(5);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("Enfermagem");
        curso2.setDescricao("Você cuida dos outros -u-");
        curso2.setCargaHoraria(6);


        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Como vender curso");
        mentoria.setDescricao("Faça os outros de besta");
        mentoria.setDataMentoria(LocalDate.now());




        bootcamp Bootcamp = new bootcamp();
        Bootcamp.setNome("Bootcamp Java");
        Bootcamp.setDescricao("Bootcamp na linguagem java para iniciantes");
        Bootcamp.getConteudos().add(curso1);
        Bootcamp.getConteudos().add(curso2);
        Bootcamp.getConteudos().add(mentoria);




        Devs dev = new Devs();
        dev.setNome("Marcelinho de Caçapava");
        dev.inscreverBootcamp(Bootcamp);


        
        Devs dev2 = new Devs();
        dev2.setNome("Juninho Ruindade Pura");
        dev.inscreverBootcamp(Bootcamp);
        dev2.progredirBootcamp();
        dev2.calcularTotalXp();

    
    }
}
