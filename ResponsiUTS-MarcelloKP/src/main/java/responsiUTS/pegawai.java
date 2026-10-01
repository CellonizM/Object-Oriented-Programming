/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author LOQ
 */
public class pegawai {
    private String namaPegawai;
    private double gaji;
    
    public pegawai( String namaPegawai, double gaji){
        this.namaPegawai=namaPegawai;
        this.gaji=gaji;
    }
  
    public  String getNamaPegawai(){
        return namaPegawai;
    }
    public void setNamaPegawai(String namaPegawai){
        this.namaPegawai=namaPegawai;
    }
    public double getGaji(){
        return gaji;
    }
    public void setGaji(double harga){
        this.gaji=gaji;
    }
    
    public void tampilkanInfo(){  
        System.out.println("Nama pegawai "+getNamaPegawai());
        System.out.println("gaji pegawai "+getGaji());
            
    }
    public void tampilkanGaji(double gaji){
        System.out.println("Gaji dari "+getNamaPegawai()+" adalah "+gaji);
    }
    public void tampilkanGaji(double gaji, double tunjangan){
        System.out.println("Gaji dari "+getNamaPegawai()+" adalah "+gaji
        +" ditambah tunjangan "+tunjangan+" \n");
    }
    
}
