package com.smk.cashier.model;

public class Barang extends Model{
    private String kodeBarang;
    private String namaBarang;
    private int hargaBarang;

    @Override
    public String toString() {
        return "Barang{" +
                "kodeBarang='" + kodeBarang + '\'' +
                ", namaBarang='" + namaBarang + '\'' +
                ", hargaBarang=" + hargaBarang +
                ", dateCreated=" + dateCreated +
                ", lastModified=" + lastModified +
                ", createdBy='" + createdBy + '\'' +
                ", undatedBy='" + undatedBy + '\'' +
                '}';
    }
}
