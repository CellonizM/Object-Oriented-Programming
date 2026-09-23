/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author LOQ
 */
public class elektronik extends produk{
        public int jumlah;
        
        
        public elektronik(String nama, double harga, int jumlah){
            super(nama,harga);
            this.jumlah=jumlah;
        }
        @Override
        public void hitungDiskon(){
            harga = harga* jumlah;
            if (harga > 2500000)
                    harga-= harga*0.35;
            System.out.println(harga);
                    
        }
    }
