/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author LOQ
 */
public class pegawaiTetap extends pegawai {
    
    double tunjangan;
    
    public pegawaiTetap(String namaPegawai, double gaji, double tunjangan){
        super(namaPegawai, gaji);
        this.tunjangan=tunjangan;
    }
    @Override
    public void tampilkanInfo(){
        System.out.println("Nama pegawai tetap: "+getNamaPegawai());
        System.out.println("Gaji pegawai tetap : "+getGaji());
        System.out.println("Tunjangan pegawai tetap : "+tunjangan);
        System.out.println("Total gaji pegawai tetap : "+(getGaji()+tunjangan)+" \n");     
    }
    
}

