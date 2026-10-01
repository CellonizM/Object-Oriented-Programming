/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author LOQ
 */
public class makanan extends produk{
    
    int tanggalKadaluarsa;
    
    public makanan(String namaProduk, double harga, int tanggalKadaluarsa){
        super(namaProduk, harga);
        this.tanggalKadaluarsa=tanggalKadaluarsa;
    }
    @Override
    public void tampilkanInfo(){
        System.out.println("Nama makanan "+ getNamaProduk());
        System.out.println("Harga makanan "+ getHarga());
        System.out.println("Tanggal kadaluarsa "+ getNamaProduk()+" = "+tanggalKadaluarsa+"\n");
        
    }
}
