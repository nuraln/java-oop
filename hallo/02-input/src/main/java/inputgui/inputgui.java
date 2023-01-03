/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputgui;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class inputgui {
    public static void main (String[] args) {
        String nama= " ";
        nama=JOptionPane.showInputDialog("Silahkan masukkan nama anda"); 
        String psn= "Halo saya " +nama; 
        JOptionPane.showMessageDialog(null,psn);
    }
}
