package net.codejava;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Produk {
	private Integer id;
	private String nama_barang;
	private String kode_barang;
	private Integer jumlah_barang;
	private String tanggal;

	public Produk() {
	}

	public Produk(Integer id, String nama_barang, String kode_barang, Integer jumlah_barang, String tanggal) {
		this.id = id;
		this.nama_barang = nama_barang;
		this.kode_barang = kode_barang;
		this.jumlah_barang = jumlah_barang;
		this.tanggal = tanggal;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNama_barang() {
		return nama_barang;
	}

	public void setNama_barang(String nama_barang) {
		this.nama_barang = nama_barang;
	}

	public String getKode_barang() {
		return kode_barang;
	}

	public void setKode_barang(String kode_barang) {
		this.kode_barang = kode_barang;
	}

	public Integer getJumlah_barang() {
		return jumlah_barang;
	}

	public void setJumlah_barang(Integer jumlah_barang) {
		this.jumlah_barang = jumlah_barang;
	}

	public String getTanggal() {
		return tanggal;
	}

	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}

}
