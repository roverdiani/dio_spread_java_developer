import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricão Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Rodrigo: " + devRodrigo.getConteudosConcluidos());
        System.out.println("XP Rodrigo: " + devRodrigo.calcularTotalXp());

        System.out.println("---------------");

        Dev devCesar = new Dev();
        devCesar.setNome("Cesar");
        devCesar.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Cesar: " + devCesar.getConteudosInscritos());
        devCesar.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Cesar: " + devCesar.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Cesar: " + devCesar.getConteudosConcluidos());
        System.out.println("XP Cesar: " + devCesar.calcularTotalXp());
    }
}
