/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hallo;
/**
 *
 * @author ACER
 */
//public class hallo {
//    public static void main(String[] args) {
//        // TODO code application logic here
//        System.out.println("nisa");
//        System.out.println(4+5);
//        System.out.println("nisah");
//    }
//}


// CODING 01 ===> halo
//class hallo {
//public static void main (String[] args) {
//    System.out.println("Halo Indonesia"); }
//}

// CODING 02 ===> variabel
// -----public class variabel {
//public class hallo {
//public static void main (String[] args) {
//char var1='Z'; int var2=10; double var3=0.8;
//boolean var4=true;
//    System.out.println("Isi variabel var1 : " +var1); 
//    System.out.println("Isi variabel var2 : " +var2); 
//    System.out.println("Isi variabel var3 : " +var3); 
//    System.out.println("Isi variabel var4 : " +var4);}
//}


// CODING 03 ===> operator aritmatik
// ----public class operatoraritmatik {

//public class hallo {
//    public static void main (String[] args) {
//        int a = 10; 
//        int b = 20; 
//        int c;
//        
//        System.out.println("OPERATOR ARITMATIKA"); 
//        
//        System.out.println("Nilai a :" +a);         
//        System.out.println("Nilai b :" +b); 
//        
//        System.out.println("Penambahan : "); c = a+b;
//        System.out.println("Hasil dari a + b =" +c); 
//        
//        System.out.println("Pengurangan : "); c = b-a;
//        System.out.println("Hasil dari a - b =" +c); 
//        
//        System.out.println("Perkalian : "); c = a*b;
//        System.out.println("Hasil dari a * b =" +c); 
//        
//        System.out.println("Pembagian : "); c = b/a;
//        System.out.println("Hasil dari b / a =" +c); 
//        
//        System.out.println("Sisa Hasil Bagi : "); c = b%a;
//        System.out.println("Hasil dari b % a =" +c);
//    }
//}


// CODING 04 ===>  Operator increment dan decrement
// --- public class operatorincdec {

//public class hallo {
//    public static void main (String[] args) {
//    int a=10;
//    System.out.println("Penambahan satu : ");
//    a++;
//    System.out.println("Isi a:" +a); System.out.println("Pengurangan satu : "); a--;
//    System.out.println("Isi a:" +a);
//    }
//}


// CODING 05 ===> operatorrelasi
// --- public class operatorrelasi {

//public class hallo {
//    public static void main (String[] args) {
//        int x=10;
//        int y=30;
//        System.out.println("x > y adalah " + (x>y)); 
//        System.out.println("x >= y adalah " + (x>=y)); 
//        System.out.println("x < y adalah " + (x<y)); 
//        System.out.println("x <= y adalah " + (x<=y)); 
//        System.out.println("x = y adalah " + (x==y));
//        System.out.println("x != y adalah " + (x!=y));
//    }
//}


// CODING 06 === > operator logika
// --- public class operatorlogika {
   
//public class hallo {
//    public static void main(String[] args){
//        boolean tes1;
//        boolean tes2;
//        int y=40;
//        int z=80;
//        tes1=(y>40) && (z<100); 
//        System.out.println("Hasil tes1 : " +tes1); 
//        
//        tes2=(y>40) || (z<100);
//        System.out.println("Hasil tes1 : " +tes2);
//    }
//}


// LATIHAN 01 (a)
//public class hallo {
//    public static void main(String[] args) {
//        // TODO code application logic here
//        System.out.println("Halo Nura, Selamat Datang di Dunia Java !");
//    }
//}


// LATIHAN 01 (b)

// ------- tipe data double
//public class hallo {
//    public static void main(String[] args) {
//        double harga_awal = 10.000;
//        int diskon = 10;
//        
//        double persen_diskon = Double.valueOf(diskon) / 100 * harga_awal;
//        double harga_akhir = harga_awal-persen_diskon;
//
//        System.out.println("Harga barang sebelum diskon : Rp." +harga_awal);
//        System.out.println("Diskon : " + diskon +"%");        
//        System.out.println("Harga barang setelah diskon : Rp. " +harga_akhir);
//    }
//}

// ------- tipe data integer
public class hallo {
    public static void main(String[] args) {
        int harga_awal = 10000;
        int diskon = 10;
        
        int persen_diskon = harga_awal * diskon / 100;
        int harga_akhir = harga_awal-persen_diskon;

        System.out.println("Harga barang sebelum diskon : Rp." +harga_awal);
        System.out.println("Diskon : " + diskon +"%");        
        System.out.println("Persentase diskon : " +persen_diskon);
        System.out.println("Harga barang setelah diskon : Rp. " +harga_akhir);
    }
}