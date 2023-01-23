/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class soal_latihan_c {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String kode_Buku;
        int tglpinjam;
        int tglkembali;
        int denda;

        System.out.print("Kode Buku : " );
        kode_Buku=input.nextLine();
        System.out.print("Tanggal Pinjam : ");
        tglpinjam=input.nextInt();
        System.out.print("Tanggal Kembali: ");
        tglkembali=input.nextInt();

        denda=(tglkembali-tglpinjam-3)*1000;

        if(tglkembali<=tglpinjam+3){
            System.out.println("Kode Buku \t\t: "+kode_Buku);
            System.out.println("Tanggal Pinjam \t\t: "+tglpinjam+" Septmber 2010");
            System.out.println("Tanggal Kembali \t: "+tglkembali+" Oktober 2010");
            System.out.println("Denda \t\t\t: Tidak Ada Denda");
        } else {
            System.out.println("Kode Buku \t\t: "+kode_Buku);
            System.out.println("Tanggal Pinjam \t\t: "+tglpinjam+" Septmber 2010");
            System.out.println("Tanggal Kembali \t: "+tglkembali+" Oktober 2010");
            System.out.println("Denda \t\t\t: Rp. "+denda);
        }
    }

}