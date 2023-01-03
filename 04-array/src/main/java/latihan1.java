/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
// ARRAY MULTIDIMENSI
//Budi adalah anak dari Bapak Yanto
//Joko adalah anak dari Bapak Yudi
//Ibu Rina adalah Istri dari Bapak Yanto
//Ibu Lina adalah Istri dari Bapak Yudi

public class latihan1 {
    public static void main(String[] args){
    String myArray[][] = {{"Budi ","Joko "},{"Yanto","Yudi"}, {"Ibu Rina", "Ibu Lina"}}; 
    
    System.out.println(myArray[0][0]+"adalah anak dari bapak "+myArray[1][0]); 
    System.out.println(myArray[0][1]+"adalah anak dari bapak "+myArray[1][1]); 
    
    System.out.println(myArray[2][0]+" adalah Istri Bapak "+myArray[1][0]); 
    System.out.println(myArray[2][1]+" adalah Istri Bapak "+myArray[1][1]); 
}
}
