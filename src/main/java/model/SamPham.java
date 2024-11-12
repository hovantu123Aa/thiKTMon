/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class SamPham {

    private int MaSP;
    private String TenSP;
    private Double DonGia;
    private String Hinh;
    private int MaLoai;
    private Date NgayCapNhat;

    public SamPham() {
    }

    public SamPham(int MaSP, String TenSP, Double DonGia, String Hinh, int MaLoai, Date NgayCapNhat) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.DonGia = DonGia;
        this.Hinh = Hinh;
        this.MaLoai = MaLoai;
        this.NgayCapNhat = NgayCapNhat;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public int getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(int MaLoai) {
        this.MaLoai = MaLoai;
    }

    public Date getNgayCapNhat() {
        return NgayCapNhat;
    }

    public void setNgayCapNhat(Date NgayCapNhat) {
        this.NgayCapNhat = NgayCapNhat;
    }

    @Override
    public String toString() {
        return "SamPham{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", DonGia=" + DonGia + ", Hinh=" + Hinh + ", MaLoai=" + MaLoai + ", NgayCapNhat=" + NgayCapNhat + '}';
    }
    
}
