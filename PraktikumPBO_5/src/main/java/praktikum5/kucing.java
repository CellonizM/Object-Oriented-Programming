/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LOQ
 */
public class kucing extends hewan {
   private String ras;
    
   public kucing(String nama, String jenis, String ras){
       super(nama, jenis);
       this.ras=ras;
   }
   public void suara(){
        System.out.println("Hewan ini bersuara meong meong");
    }
    
   @Override
   public void tampilInfo(){
       super.tampilInfo();
       System.out.println("Ras Kucing: "+ras);
       suara();
   }
}
