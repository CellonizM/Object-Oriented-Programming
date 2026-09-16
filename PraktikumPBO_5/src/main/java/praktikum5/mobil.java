/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LOQ
 */
public class mobil extends kendaraanDarat{
    public int jumPintu;
    
    public mobil(String nama, int kecepatan, int jumRoda, int jumPintu){
        super(nama, kecepatan, jumRoda);
        this.jumPintu=jumPintu;
    }
    public int getJumPintu(){
        return jumPintu;
    }
    public void setJumPintu(int jumPintu){
        this.jumPintu=jumPintu;
    }
    
    void tampilInfoMobil(){
        System.out.println("Nama Kendaraan: "+getNama());
        System.out.println("Kecepatan Kendaraan maks: "+getKecepatan());
        System.out.println("Jumlah pintu Kendaraan: "+getJumPintu());
        
    }
    @Override
    public void tampilInfo(){
      super.tampilInfo();
      System.out.println("Jumlah roda kendaraan darat ini: "+jumRoda);
      System.out.println("Mobil ini dalam kondisi menyala");
           
    }
}
