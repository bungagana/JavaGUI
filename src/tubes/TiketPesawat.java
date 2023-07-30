/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes;

import java.util.Date;

/**
 *
 * @author bunga
 */
public class TiketPesawat {
    private String NIK;
    private String nama;
    private String kotaAsal;
    private String tujuan;
    private Date tanggalBerangkat;
    private int harga;

    // Constructor
    public TiketPesawat(String NIK, String nama, String kotaAsal, String tujuan, Date tanggalBerangkat, int harga) {
        this.NIK = NIK;
        this.nama = nama;
        this.kotaAsal = kotaAsal;
        this.tujuan = tujuan;
        this.tanggalBerangkat = tanggalBerangkat;
        this.harga = harga;
    }

    // Getter and Setter methods

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public Date getTanggalBerangkat() {
        return tanggalBerangkat;
    }

    public void setTanggalBerangkat(Date tanggalBerangkat) {
        this.tanggalBerangkat = tanggalBerangkat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}

