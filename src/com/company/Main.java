package com.company;

public class Main {

    public static void main(String[] args) {
        funcaoSoma(2,2);
        funcaoSubtrair(5,2);
    }
    public static void funcaoSubtrair(double x, double y){
        double z = x - y;

    }
    public static void funcaoSoma(int x, int y){
        int z = x+y;
        System.out.println("A soma de " + x + "+" + y + " é igual a :"+z);
    }
}
