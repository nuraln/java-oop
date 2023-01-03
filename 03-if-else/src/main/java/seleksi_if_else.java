/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class seleksi_if_else {
    public static void main (String[] args) {
        int totalbelanja = 100000; 
        int jmlh_brg_dibeli = 2; 
        double diskon = 0.25;
        double hrg_brg_stlh_diskon;
        
        if (totalbelanja>50000 && jmlh_brg_dibeli>1) {
            hrg_brg_stlh_diskon = totalbelanja-(totalbelanja*diskon); 
            System.out.println ("Harga barang setelah diskon :"+hrg_brg_stlh_diskon);
        }
        else { 
            System.out.println( "Maaf anda belum dapat diskon"); 
        }
    }   
}
