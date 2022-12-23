package com.example.northwind.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "oyuncular")
public class Oyun {

	@Id
	@GeneratedValue
	@Column(name = "oyuncu_id")
	private int oyuncuId;
	@Column(name = "oyuncu_adi")
	private String oyuncuAdi;
	@Column(name = "oyuncu_hareketi")
	private int oyuncuHareketi;

	public Oyun() {

	}

	public Oyun(int oyuncuId, int oyuncuHareketi, String oyuncuAdi) {
		super();
		this.oyuncuId = oyuncuId;
		this.oyuncuAdi = oyuncuAdi;
		this.oyuncuHareketi = oyuncuHareketi;
	}

	public int getOyuncuId() {
		return oyuncuId;
	}

	public void setOyuncuId(int oyuncuId) {
		this.oyuncuId = oyuncuId;
	}

	public String getOyuncuAdi() {
		return oyuncuAdi;
	}

	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}

	public int getOyuncuHareketi() {
		return oyuncuHareketi;
	}

	public void setOyuncuHareketi(int oyuncuHareketi) {
		this.oyuncuHareketi = oyuncuHareketi;
	}

}