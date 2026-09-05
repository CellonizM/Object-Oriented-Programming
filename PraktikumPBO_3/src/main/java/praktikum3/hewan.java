/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author LOQ
 */
public class hewan {
    
     String nama;
     int umur;
    
    public hewan (String nama, int umur){
        System.out.println("Nama: "+nama);
        System.out.println("Umur: "+umur);
        
    }
    /*
    public hewan (String nama, int umur){
        this.nama = nama;
        this.umur = umur;          
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama= nama;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur){
        this.umur= umur;
    }
    void suara(){
        System.out.println("Hewan ini bersuara");
    }
    void berlari(){
        System.out.println("hewan ini berlari");
    }
    void info(){
        System.out.println("Nama: "+getNama() + ", Umur: "+getUmur());
    }
    */
   
    void bunyi(){
        System.out.println("hewan ini bersuara");
    }
}
