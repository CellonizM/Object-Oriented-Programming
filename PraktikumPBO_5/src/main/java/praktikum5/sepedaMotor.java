/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LOQ
 */
public class sepedaMotor extends kendaraan2 {
    public String jenisMesin;
    
    public sepedaMotor(String nama, int kecepatan, String jenisMesin){
        super(nama,kecepatan);
        this.jenisMesin=jenisMesin;
    }
   
    
    @Override
    public void tampilInfo(){
      System.out.println("Motor ini dalam kondisi menyala");
          
    }
}
