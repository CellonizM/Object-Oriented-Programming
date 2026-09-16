/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author LOQ
 */
public class hewan {
    private String nama;
    private String jenis;
    
    public hewan(String nama, String jenis){
        this.nama=nama;
        this.jenis=jenis;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getJenis(){
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis=jenis;
    }
    public void tampilInfo(){
        System.out.println("Nama hewan: "+getNama());
        System.out.println("Jenis hewan: "+getJenis());
        
    }
}
