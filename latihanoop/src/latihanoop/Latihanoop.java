/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanoop;


class siswa{

}
/**
 *
 * @author LAB TIK PC- 2
 */
public class Latihanoop {
    
    public static void main (String[] args){
//        menggabungkan namavariabel dan masukkannya ke dalam method main
        siswa siswa1 = new siswa();   // object pertama
        siswa siswa2 = new siswa();   // object kedua
        siswa siswa3 = new siswa(); 
        
//        menambahkan titik koma di setiap akirbaris
        System.out.println (siswa1);
        System.out.println (siswa2);
        System.out.println (siswa3); 
        
//        membandingkanduaobjek
        System.out.println(siswa1==siswa2); // false: dua object berbeda
    }
    
}
