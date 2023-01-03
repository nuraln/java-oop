/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException;
/**
 *
 * @author ACER
 */
public class input {
    public static void main (String[] args) {
        BufferedReader InputData = new BufferedReader (new InputStreamReader
        (System.in));
        String nama= " ";
        System.out.print ("Masukkan nama anda : " );
        try {
            nama = InputData.readLine();
        }
        catch (IOException e ){
            System.out.println("Error");
        }
        System.out.println("Halo nama saya " +nama);
    }
}

