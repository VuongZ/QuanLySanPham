package com.example.quanlysanpham.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="bh_sanpham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="Id")
    private Integer id;
    @Column(name = "LoaiSanPham_Id")
    private Integer loaiSanPham;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(Integer loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public Integer getSlTon() {
        return slTon;
    }




    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Column(name = "MaSP")
    private String maSanPham;

    @Column(name = "TenSP")
    private String tenSanPham;

    @Column(name = "DonVi")
    private String donVi;

    @Column(name = "GiaBan")
    private Double giaBan;

    @Column(name = "SoLuongTon")
    private Integer slTon;

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public void setSlTon(Integer slTon) {
        this.slTon = slTon;
    }

    @Column(name = "TrangThai")
    private Integer trangThai;

    @Column(name = "CreatedAt", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    @OneToMany(mappedBy="SanPham_id")
    private List<SanPhamHinhAnh> hinhanhsanpham=new ArrayList<>();
    @Column(name = "UpdatedAt")
    @UpdateTimestamp
    private LocalDateTime updatedAt;



}
