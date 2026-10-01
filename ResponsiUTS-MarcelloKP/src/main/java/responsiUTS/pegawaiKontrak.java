/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author LOQ
 */
public class pegawaiKontrak extends pegawai {
     int lamaKontrak;
    
    public pegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak){
        super(namaPegawai, gaji);
        this.lamaKontrak=lamaKontrak;
    }
    @Override
    public void tampilkanInfo(){
        System.out.println("Nama pegawai kontrak : "+getNamaPegawai());
        System.out.println("Gaji pegawai kontrak : "+getGaji());
        System.out.println("lama kontrak pegawai kontrak : "+lamaKontrak+" bulan\n");
        
        
    }
}
