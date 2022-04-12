package com.example.demojpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@Column(name="prod_id")
	private String prodId;
	
	@Column(name="prod_name")
	private String prodName;
	
	@Column(name="prod_desc")
	private String prodDesc;
	
	@Column(name="price")
	private double price;

	public Product() {
			}

	public Product(String prodId, String prodName, String prodDesc, double price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.price = price;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
