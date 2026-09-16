/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LOQ
 */
public class kendaraan2 {
 public String nama;
 public int kecepatan;
    
    public kendaraan2 (String nama, int kecepatan){
        this.nama=nama;
        this.kecepatan=kecepatan;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public int getKecepatan(){
        return kecepatan;
    }
    public void setKecepatan(int kecepatan){
        this.kecepatan=kecepatan;
    }
    
    void tampilInfo(){
        System.out.println("Nama kendaraan: "+getNama());
        System.out.println("Kecepatan kendaraan: "+getKecepatan());
    }   
}
