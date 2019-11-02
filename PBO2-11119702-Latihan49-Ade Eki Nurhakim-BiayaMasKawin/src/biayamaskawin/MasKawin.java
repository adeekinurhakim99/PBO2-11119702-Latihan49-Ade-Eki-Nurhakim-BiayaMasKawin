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
public class MasKawin {
    private String nama;
    private double emas;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getEmas() {
        return emas;
    }

    public void setEmas(double emas) {
        this.emas = emas;
    }
    public double jumlah(){
        return emas*570000;
    }

    void setEmas(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  }

