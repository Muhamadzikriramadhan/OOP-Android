package com.example.oopandroid;

public class Siswa {
    private String nama;
    private double uts;
    private double uas;
    private double tugas;

    public Siswa() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getTugas() {
        return tugas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public double getNA(){
        double NA = (0.3 * uts) + (0.3 * uas) * (0.4 * tugas);
        return NA;
    }
}
