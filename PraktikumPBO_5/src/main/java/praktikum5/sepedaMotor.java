/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LOQ
 */
public class sepedaMotor extends kendaraanDarat {
    public String jenisMesin;
    
    public sepedaMotor(String nama, int kecepatan, int jumRoda, String jenisMesin){
        super(nama,kecepatan, jumRoda);
        this.jenisMesin=jenisMesin;
    }
   
    
    @Override
    public void tampilInfo(){
      super.tampilInfo();
      System.out.println("Jumlah roda kendaraan: "+jumRoda);
      System.out.println("Jenis mesin kendaraan: "+jenisMesin);
      System.out.println("Motor ini dalam kondisi menyala");
          
    }
}
