/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class seleksi_if_bersarang {
    public static void main (String[] args) {
        int nilai_angka = 75;
        if (nilai_angka>=85 && nilai_angka <=100) { 
            System.out.println ("Nilai Huruf A"); 
        } else if (nilai_angka >=70 && nilai_angka <85) { 
            System.out.println ("Nilai Huruf B"); 
        } else if (nilai_angka >=55 && nilai_angka <70) { 
            System.out.println ("Nilai Huruf C"); 
        } else if (nilai_angka ==50 && nilai_angka <55) { 
            System.out.println ("Nilai Huruf D"); 
        } else {
        System.out.println("Nilai Huruf E"); }
    }
}
