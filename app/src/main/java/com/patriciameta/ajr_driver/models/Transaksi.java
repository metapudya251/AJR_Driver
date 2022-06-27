package com.patriciameta.ajr_driver.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Transaksi {
    private Long id;
    private String no_transaksi, tgl_transaksi, tgl_waktu_mulai_sewa, tgl_waktu_selesai_sewa, metode_pembayaran,
            tgl_pengembalian, jenis_transaksi, status_pembayaran, status_transaksi;
    private Float ekstensi_biaya, total_biaya_sewa, subTot, disc;
    private Integer rating_driver, customer_id, driver_id, pegawai_id, aset_id;

    @SerializedName("nama_mobil")
    private String nama_aset;

    @SerializedName("tipe_mobil")
    private String tipe_aset;

    @SerializedName("nama")
    private String nama_cust;

    @SerializedName("nama_driver")
    private String nama_driver;

    @SerializedName("jumlah_peminjaman")
    private Integer jumlah;

    @SerializedName("pendapatan")
    private Integer pendapatan;

    public Transaksi(Long id, String no_transaksi, String tgl_transaksi, String tgl_waktu_mulai_sewa,
                     String tgl_waktu_selesai_sewa, String metode_pembayaran, String tgl_pengembalian,
                     String jenis_transaksi, String status_pembayaran, String status_transaksi,
                     Float ekstensi_biaya, Float total_biaya_sewa, Float subTot, Float disc,
                     Integer rating_driver, Integer customer_id, Integer driver_id, Integer pegawai_id,
                     Integer aset_id,String nama_aset,Integer jumlah, Integer pendapatan,String tipe_aset,
                     String nama_cust, String nama_driver) {
        this.id = id;
        this.no_transaksi = no_transaksi;
        this.tgl_transaksi = tgl_transaksi;
        this.tgl_waktu_mulai_sewa = tgl_waktu_mulai_sewa;
        this.tgl_waktu_selesai_sewa = tgl_waktu_selesai_sewa;
        this.metode_pembayaran = metode_pembayaran;
        this.tgl_pengembalian = tgl_pengembalian;
        this.jenis_transaksi = jenis_transaksi;
        this.status_pembayaran = status_pembayaran;
        this.status_transaksi = status_transaksi;
        this.ekstensi_biaya = ekstensi_biaya;
        this.total_biaya_sewa = total_biaya_sewa;
        this.subTot = subTot;
        this.disc = disc;
        this.rating_driver = rating_driver;
        this.customer_id = customer_id;
        this.driver_id = driver_id;
        this.pegawai_id = pegawai_id;
        this.aset_id = aset_id;
        this.nama_aset = nama_aset;
        this.jumlah = jumlah;
        this.pendapatan = pendapatan;
        this.tipe_aset = tipe_aset;
        this.nama_cust = nama_cust;
        this.nama_driver = nama_driver;

    }
    public String getNama_cust() {
        return nama_cust;
    }

    public void setNama_cust(String nama_cust) {
        this.nama_cust = nama_cust;
    }

    public String getNama_driver() {
        return nama_driver;
    }

    public void setNama_driver(String nama_driver) {
        this.nama_driver = nama_driver;
    }
    public String getTipe_aset() {
        return tipe_aset;
    }

    public void setTipe_aset(String tipe_aset) {
        this.tipe_aset = tipe_aset;
    }

    public Integer getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(Integer pendapatan) {
        this.pendapatan = pendapatan;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public String getNama_aset() {
        return nama_aset;
    }

    public void setNama_aset(String nama_aset) {
        this.nama_aset = nama_aset;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNo_transaksi() {
        return no_transaksi;
    }

    public void setNo_transaksi(String no_transaksi) {
        this.no_transaksi = no_transaksi;
    }

    public String getTgl_transaksi() {
        return tgl_transaksi;
    }

    public void setTgl_transaksi(String tgl_transaksi) {
        this.tgl_transaksi = tgl_transaksi;
    }

    public String getTgl_waktu_mulai_sewa() {
        return tgl_waktu_mulai_sewa;
    }

    public void setTgl_waktu_mulai_sewa(String tgl_waktu_mulai_sewa) {
        this.tgl_waktu_mulai_sewa = tgl_waktu_mulai_sewa;
    }

    public String getTgl_waktu_selesai_sewa() {
        return tgl_waktu_selesai_sewa;
    }

    public void setTgl_waktu_selesai_sewa(String tgl_waktu_selesai_sewa) {
        this.tgl_waktu_selesai_sewa = tgl_waktu_selesai_sewa;
    }

    public String getMetode_pembayaran() {
        return metode_pembayaran;
    }

    public void setMetode_pembayaran(String metode_pembayaran) {
        this.metode_pembayaran = metode_pembayaran;
    }

    public String getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    public void setTgl_pengembalian(String tgl_pengembalian) {
        this.tgl_pengembalian = tgl_pengembalian;
    }

    public String getJenis_transaksi() {
        return jenis_transaksi;
    }

    public void setJenis_transaksi(String jenis_transaksi) {
        this.jenis_transaksi = jenis_transaksi;
    }

    public String getStatus_pembayaran() {
        return status_pembayaran;
    }

    public void setStatus_pembayaran(String status_pembayaran) {
        this.status_pembayaran = status_pembayaran;
    }

    public String getStatus_transaksi() {
        return status_transaksi;
    }

    public void setStatus_transaksi(String status_transaksi) {
        this.status_transaksi = status_transaksi;
    }

    public Float getEkstensi_biaya() {
        return ekstensi_biaya;
    }

    public void setEkstensi_biaya(Float ekstensi_biaya) {
        this.ekstensi_biaya = ekstensi_biaya;
    }

    public Float getTotal_biaya_sewa() {
        return total_biaya_sewa;
    }

    public void setTotal_biaya_sewa(Float total_biaya_sewa) {
        this.total_biaya_sewa = total_biaya_sewa;
    }

    public Float getSubTot() {
        return subTot;
    }

    public void setSubTot(Float subTot) {
        this.subTot = subTot;
    }

    public Float getDisc() {
        return disc;
    }

    public void setDisc(Float disc) {
        this.disc = disc;
    }

    public Integer getRating_driver() {
        return rating_driver;
    }

    public void setRating_driver(Integer rating_driver) {
        this.rating_driver = rating_driver;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(Integer driver_id) {
        this.driver_id = driver_id;
    }

    public Integer getPegawai_id() {
        return pegawai_id;
    }

    public void setPegawai_id(Integer pegawai_id) {
        this.pegawai_id = pegawai_id;
    }

    public Integer getAset_id() {
        return aset_id;
    }

    public void setAset_id(Integer aset_id) {
        this.aset_id = aset_id;
    }
}
