
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class soal_latihan_a {
    public static void main (String[] args){
        BufferedReader InputData = new BufferedReader (new InputStreamReader(System.in));
        String angkaInput= null;
        System.out.print ("1- Minggu \n "
                        + "2- Senin \n"
                        + "3- Selasa \n"
                        + "4- Rabu \n"
                        + "5- Kamis \n"
                        + "6- Jum'at \n" 
                        + "7- Sabtu \n"
                        + "Masukkan kode hari [1...7] : \n");
                        
        try {
            angkaInput = InputData.readLine();
        }
        catch (IOException e ){ 
            System.out.println("Error");
        }
        
        int Hari=Integer.valueOf(angkaInput).intValue();
        switch (Hari){
            case 1:System.out.println("Hari Minggu adalah hari libur"); 
                break;
                
            case 2:System.out.println("Hari Senin adalah hari kerja"); 
                break; 
                
            case 3:System.out.println("Hari Selasa adalah hari kerja"); 
                break; 
                
            case 4:System.out.println("Hari Rabu adalah hari kerja"); 
                break; 
                
            case 5:System.out.println("Hari Kamis adalah hari kerja"); 
                break; 
                
            case 6:System.out.println("Hari Jum'at adalah hari kerja"); 
                break; 
                
            case 7:System.out.println("Sabtu adalah hari libur"); 
                break;
                
            default :System.out.println("Kode hari yang anda masukkan salah"); 
        }
    } 

}
