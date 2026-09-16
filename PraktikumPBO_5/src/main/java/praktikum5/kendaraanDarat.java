/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LOQ
 */
public class kendaraanDarat extends kendaraan2 {
    public int jumRoda;
    
    public kendaraanDarat(String nama, int kecepatan, int jumRoda){
        super(nama, kecepatan);
        this.jumRoda=jumRoda;
    }
}
