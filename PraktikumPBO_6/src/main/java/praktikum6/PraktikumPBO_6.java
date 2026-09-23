/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author LOQ
 */
public class PraktikumPBO_6 {

    public static void main(String[] args) {
    /*
    // Overloading
    hewan kucing = new hewan();
    kucing.bersuara();
    System.out.println();
    kucing.makan("ikan");
    kucing.makan("ikan",2);
    // Override
    kucing kucing1 = new kucing();
    kucing1.bersuara();
    kucing1.makan("Ikan",2);
    
    anjing anjing1 = new anjing();
    anjing1.bersuara();
    anjing1.makan("dog food",3);
    
    */
    
    //Buat objek keranjang dari class keranjangBelanja
    keranjangBelanja keranjang = new keranjangBelanja();
   
    //Buat objek dari masing-masing class buku, elektronik, dan pakaian
    produk buku= new buku("seni makan miayam",80000,4);
    produk elektronik = new elektronik("Mobo MSI",3750000,1);
    produk pakaian = new pakaian("kaos",35000,11);
   
    //Masukkan objek barang-barang ke objek keranjang
    keranjang.tambahBarang(buku);
    keranjang.tambahBarang(elektronik);
    keranjang.tambahBarang(pakaian);
    
    //Panggil fungsi hitung total harga setelah diskon
    //Buat sebagai variabel baru
    double totalSemua = keranjang.hitungTotalSetelahDiskon();
    
    //Panggil hasilnya 
    System.out.println("Total harga semua barang = "+totalSemua);
    
    }
}
