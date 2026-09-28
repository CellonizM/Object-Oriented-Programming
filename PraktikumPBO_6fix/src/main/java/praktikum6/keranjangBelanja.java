/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author LOQ
 */
// bagian 1
import java.util.ArrayList;
import java.util.List;
//bagian 2
public class keranjangBelanja {
    private List<produk> daftarProduk;
    //bagian 3
    public keranjangBelanja(){
        daftarProduk= new ArrayList<>();
    }
    //bagian 4
    public void tambahBarang(produk produk){
        daftarProduk.add(produk);
    }
    //bagian 5
    public double hitungTotalSetelahDiskon(){
        double totalSemua=0;
        
        for (produk p : daftarProduk){
            p.hitungDiskon();
            totalSemua += p.harga;
        }
        return totalSemua;
    }
}
