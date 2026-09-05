/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum3;

/**
 *
 * @author LOQ
 */
public class PraktikumPBO_3 {

    public static void main(String[] args) {
        /*
        hewan kucing = new hewan("Mimi",3);
        kucing.info();
        kucing.suara();
        System.out.println();
        
        hewan anjing = new hewan("Herdi",5);
        anjing.info();
        anjing.suara();
        anjing.berlari();
        */
        //Ini konstruktor
        //hewan kucing = new hewan("Mimi",3);
        //kucing.bunyi();
        
        
        mobil mobil1 = new mobil("Toyota","Avanza",2022,"Hitam");
        mobil1.info();
        mobil1.startEngine();
        mobil1.setWarna("Merah");
        mobil1.info();
        
        mobil mobil2 = new mobil ("Honda","Brio",2023,"Merah");
        mobil2.info();
        mobil2.startEngine();
        mobil2.setWarna("Kuning");
        mobil2.info();
    }
}
