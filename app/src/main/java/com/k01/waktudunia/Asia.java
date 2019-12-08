package com.k01.waktudunia;

import java.io.Serializable;

public class Asia implements Serializable {
    private String nomor;
    private String negara;
    private String kota;
    private String waktu;
    private String peta;

    public Asia() {
    }

    public Asia(String nomor, String negara, String kota, String waktu, String peta) {
        this.nomor = nomor;
        this.negara = negara;
        this.kota = kota;
        this.waktu = waktu;
        this.peta = peta;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getPeta() {
        return peta;
    }

    public void setPeta(String peta) {
        this.peta = peta;
    }

}
