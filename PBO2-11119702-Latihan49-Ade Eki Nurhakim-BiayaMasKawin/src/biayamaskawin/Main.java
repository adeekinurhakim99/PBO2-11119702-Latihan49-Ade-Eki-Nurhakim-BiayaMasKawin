/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biayamaskawin;

/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
        MasKawin mk = new MasKawin();
        mk.setNama("Hendi");
        mk.setEmas(15,7);
        System.out.println(mk.getNama()+" "+"Akan Membeli Emas Seberat "+mk.getEmas());
        System.out.println("Harga 1 Gram = Rp.570.000");
        System.out.println("Total Yang Harus Dibayar = "+mk.jumlah());
    }
}
