package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
// funcaoSoma(2,2);
// funcaoSubtrair(5,2);
// List<String> x = nomesDeAlunos("Paulo", "Felipe");
// for (String s: x){
// System.out.println(s);
// }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String s = scanner.nextLine();
        System.out.println("Que ano você nasceu?");
        int ano = Integer.parseInt(scanner.nextLine());
        int idade = 2022-ano;
        System.out.println("Nome:" + s);
        System.out.println("Idade:" + idade);

    }
    public static List<String> nomesDeAlunos(String s, String str){
        List<String> ListString = new ArrayList<>();
        ListString.add(s);
        ListString.add(str);
        return ListString;


    }
    public static void funcaoSubtrair (double x, double y){
        double z = x - y;
    }
    public static void funcaoSoma(int x,int y){
        int z = x+y;
        System.out.println("a soma de "+ x + " mais "+ y+ " é igual a " + z);
    }
}
