/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package responsiUTS;

/**
 *
 * @author LOQ
 */
public class ResponsiUTSMarcelloKP {

    public static void main(String[] args) {
    elektronik mobo = new elektronik("Mobo ROG",3000000,2);
    mobo.tampilkanInfo();
    
    makanan makan = new makanan("Ramen", 75000,15);
    makan.tampilkanInfo();
    
    pegawaiTetap tetap = new pegawaiTetap("Budi",3500000,2500000);
    tetap.tampilkanInfo();
    
    tetap.tampilkanGaji(3500000);
    tetap.tampilkanGaji(3500000,1500000);
    
    pegawaiKontrak kontrak = new pegawaiKontrak("Siti",3750000, 12);
    kontrak.tampilkanInfo();
    
    }
}
