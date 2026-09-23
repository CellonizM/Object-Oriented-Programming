/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author LOQ
 */

public class buku extends produk{
        public int jumlah;
       
        
        public buku(String nama, double harga, int jumlah){
            super(nama,harga);
            this.jumlah = jumlah;
        }
        @Override
        public void hitungDiskon(){
            harga= harga*jumlah;
            if (harga * jumlah > 200000)
                    harga= harga - harga*0.2;
                System.out.println(harga);
        }
        
    }    