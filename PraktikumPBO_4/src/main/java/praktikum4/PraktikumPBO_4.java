/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author LOQ
 */
public class PraktikumPBO_4 {

    public static void main(String[] args) {
        /*
        kendaraan mobil = new kendaraan("Toyota","Avanza",2020);
        
        //menampilkan data
        System.out.println("Merek : "+ mobil.getMerk());
        System.out.println("Model : "+ mobil.getModel());
        System.out.println("Tahun : "+ mobil.getTahun()
        );
        */
    pekerja karyawan = new pekerja("Anton", 25, "livesteamer", 12000000);
    System.out.println(karyawan);
    karyawan.setNama("Reza");
    System.out.println(karyawan);
    System.out.println(karyawan.nama);
    System.out.println(karyawan.usia);
    System.out.println(karyawan.gaji);
    
    
    }
}
