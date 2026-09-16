/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LOQ
 */
public class anjing extends hewan{
    private int umur;
    
   public anjing(String nama, String jenis, int umur){
        super(nama, jenis);
        this.umur=umur;
    }
    public void suara(){
        System.out.println("Hewan ini bersuara guk guk");
    }
    @Override
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("Umur "+getNama()+" "+umur+" Tahun");
        
    }
}
