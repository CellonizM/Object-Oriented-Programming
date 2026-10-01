/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author LOQ
 */
public class elektronik extends produk{
    
    int garansi;
    
    public elektronik(String namaProduk, double harga, int garansi){
        super(namaProduk, harga);
        this.garansi=garansi;
    }
    @Override
    public void tampilkanInfo(){
        System.out.println("Nama produk elektronik "+ getNamaProduk());
        System.out.println("Harga produk elektronik "+ getHarga());
        System.out.println("garansi produk elektronik "+ getNamaProduk()+" = "+garansi+" tahun\n");
        
    }
}
