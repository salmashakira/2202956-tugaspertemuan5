/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soallatihan1;

import java.util.Scanner;
/**
 *
 * @author A S U S
 */
public class SoalLatihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        int n = input.nextInt();
        
        cetakTulisan(n);
        
        input.close();
    }
    
    public static void cetakTulisan(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
    }
}
