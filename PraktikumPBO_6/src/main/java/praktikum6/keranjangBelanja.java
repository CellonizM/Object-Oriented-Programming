/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author LOQ
 */
import java.util.ArrayList;
import java.util.List;

public class keranjangBelanja {
    private List<produk> daftarProduk;
    
    public keranjangBelanja(){
        daftarProduk= new ArrayList<>();
    }
    
    public void tambahBarang(produk produk){
        daftarProduk.add(produk);
    }
    
    public double hitungTotalSetelahDiskon(){
        double totalSemua=0;
        
        for (produk p : daftarProduk){
            p.hitungDiskon();
            totalSemua += p.harga;
        }
        return totalSemua;
    }
}
