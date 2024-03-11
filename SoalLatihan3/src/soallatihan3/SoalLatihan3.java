/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soallatihan3;

import java.util.Scanner;
/**
 *
 * @author A S U S
 */
public class SoalLatihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan a: ");
        int a = input.nextInt();
        System.out.println("Masukkan bilangan b: ");
        int b = input.nextInt();

        int fpb = hitungFPB(a, b);

        System.out.println("Pembagi Bersama Terbesar dari " + a + " dan " + b + " adalah: " + fpb);

        input.close();
    }

    public static int hitungFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}