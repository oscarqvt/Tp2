package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        discriminant();
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        int xo = -1 * b / (2 * a);
        int x1 = (int) (-1 * b + Math.sqrt(delta) / (2 * a));
        int x2 = (int) (-1 * b - Math.sqrt(delta) / (2 * a));
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
            System.out.println("On a deux racines complexes :");
            System.out.println(-b + "-i" +Math.sqrt(delta) / (2*a));
            System.out.println(-b + "+i" +Math.sqrt(delta) / (2*a));

        } else if (delta == 0) {
            System.out.println("Ce polynome a une de racine double");
            System.out.print(xo);
        } else if (delta > 0) {
            System.out.println("Ce polynome a deux racines :");
            System.out.println(x1); System.out.println(x2);
        }
    }
}
