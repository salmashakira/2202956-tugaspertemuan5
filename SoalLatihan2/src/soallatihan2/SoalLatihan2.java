/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soallatihan2;

import java.util.Scanner;
/**
 *
 * @author A S U S
 */
public class SoalLatihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Batas Awal: ");
        int batasAwal = input.nextInt();
        System.out.println("Masukkan Batas Akhir: ");
        int batasAkhir = input.nextInt();
        
        int jumlahDeretGenap = hitungJumlahGenap(batasAwal, batasAkhir);
        
        System.out.println("Jumlah deret bilangan genap dari " + batasAwal + " sampai " + batasAkhir + " adalah: " + jumlahDeretGenap);
        
        input.close();
    }

    public static int hitungJumlahGenap(int batasAwal, int batasAkhir) {
        if (batasAwal % 2 != 0) {
            batasAwal++;
        }

        int jumlahDeretGenap = 0;

        for (int i = batasAwal; i <= batasAkhir; i += 2) {
            jumlahDeretGenap += i;
        }

        return jumlahDeretGenap;
    }
}