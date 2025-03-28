package main;

import java.util.Scanner;
import modelos.Aluno;

public class Principal {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       Aluno al = new Aluno();

       int option;

       do{
           System.out.println("1 - CADASTRAR ALUNO");
           System.out.println("2 - INFORMAR DADOS DE UM ALUNO");
           System.out.println("3 - SAIR");

           System.out.println("--> Qual operacao deseja realizar?");
           option = Integer.parseInt(sc.nextLine());


           switch (option){
               case 1:
                   System.out.println("\nAluno");
                   System.out.println("Nome: ");
                   al.setNome(sc.nextLine());
                   System.out.println("RA: ");
                   al.setRa(sc.nextLine());
                   System.out.println("Curso: ");
                   al.setCurso(sc.nextLine());
                   break;


               case 2:
                   System.out.println("RA do aluno: ");
                   String ra = sc.nextLine();

                   if (al.buscarAluno(ra)){
                       System.out.println(al.toString());
                   }else{
                       System.out.println("RA nao cadastrado!");
                   }
                   break;
           }
       }while (option != 3);
       System.out.println("Finalizando programa...");
    }
}