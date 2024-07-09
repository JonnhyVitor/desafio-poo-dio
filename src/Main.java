import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Curso curso1= new Curso();
      curso1.setTitulo("java");
      curso1.setDescricao("curso de java avancado");
      curso1.setCargaHoraria(8);

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("Mentoria java");
      mentoria.setDescricao("descricao Mentoria  java");
      mentoria.setData(LocalDate.now());

        //System.out.println();
       // System.out.println();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java Dio");
        bootcamp.setDescricao("bootcamp sobre Java avancado");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos Joao:" + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("XP:"+ devJoao.calcularTotalXp());



         System.out.println("========");



        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootcamp(bootcamp);
         System.out.println("Conteudos inscritos Vitor: " + devVitor.getConteudosInscritos());
         devVitor.progredir();
         System.out.println("-");
         System.out.println("Conteudos concluidos Vitor:" + devJoao.getConteudosConcluidos());
         System.out.println("Conteudos inscritos Vitor: " + devVitor.getConteudosInscritos());
         System.out.println("XP:"+ devVitor.calcularTotalXp());




    }
}