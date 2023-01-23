/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class soal_latihan_b {
    public static void main(String[] args)  { 
        int i,j,n,s; 
        System.out.print ("Masukan jumlah baris : "); 
        Scanner sc = new Scanner(System.in); 
        n = (int) sc.nextInt(); 
        
        for (i = 1; i <= n; i++){ 
            s = n - i; 
            for (j = 1; j <= s; j++){
                System.out.println(" ");
            } 
            
            for (j = 1; j <= i; j++) { 
                System.out.print("*"); 
            } 
            System.out.println(); 
        } 
    } 
}

