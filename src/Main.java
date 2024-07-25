package br.com.dio.desafio

import java.time.LocalDate;

        public class Main {

            public static void main(String[] args) {

                Curso curso1 = new Curso();
                curso1.setTitulo("Curso java");
                curso1.setDescricao("descrição curso java");
                curso1.setCargaHoraria(8);

                Curso curso2 = new Curso();
                curso2.setTitulo("Curso js");
                curso2.setDescricao("descrição curso js");
                curso2.setCargaHoraria(4);


                Mentoria mentoria = new Mentoria();
                mentoria.setTitulo("mentoria de java");
                mentoria.setDescricao("descrição mentoria java");
                mentoria.setData(LocalDate.now());

      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

                Bootcamp bootcamp = new Bootcamp();
                bootcamp.setNome("Bootcamp Java Developer");
                bootcamp.setDescricao("Descrição Bootcamp Java Developer");
                bootcamp.getConteudos().add(curso1);
                bootcamp.getConteudos().add(curso2);
                bootcamp.getConteudos().add(mentoria);

                Dev devCamila = new Dev();
                devCamila.setNome("Carla");
                devCamila.inscreverBootcamp(bootcamp);
                System.out.println("Conteúdos Inscritos Carla:" + devCamila.getConteudosInscritos());

                devCamila.progredir();
                devCamila.progredir();

                System.out.println("-");
                System.out.println("Conteúdos Inscritos Carla:" + devCamila.getConteudosInscritos());
                System.out.println("Conteúdos Concluídos Carla:" + devCamila.getConteudosConcluidos());
                System.out.println("XP:" + devCamila.calcularTotalXp());

                System.out.println("--------------");

                Dev devJoao = new Dev();
                devJoao.setNome("Alan");
                devJoao.inscreverBootcamp(bootcamp);
                System.out.println("Conteúdos Inscritos Alan:" + devJoao.getConteudosInscritos());
                devJoao.progredir();
                devJoao.progredir();
                devJoao.progredir();

                System.out.println("-");
                System.out.println("Conteúdos Inscritos Alan:" + devJoao.getConteudosInscritos());
                System.out.println("Conteúdos Concluídos Alan:" + devJoao.getConteudosConcluidos());
                System.out.println("XP:" + devJoao.calcularTotalXp());

            }
        }