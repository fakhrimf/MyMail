package com.pwpb.recyclerkelompok;

public class Mails {
    private String namaSingkat, nama, subject, isi, waktu;

    public Mails(String namaSingkat, String nama, String subject, String isi, String waktu) {
        this.namaSingkat = namaSingkat;
        this.nama = nama;
        this.subject = subject;
        this.isi = isi;
        this.waktu = waktu;
    }

    public String getNamaSingkat() {
        return namaSingkat;
    }

    public void setNamaSingkat(String namaSingkat) {
        this.namaSingkat = namaSingkat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
}
