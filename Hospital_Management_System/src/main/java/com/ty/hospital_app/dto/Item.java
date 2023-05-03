package com.ty.hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int item_id;
	private String item_name;
	private int item_cost;
	private int item_quantity;
	@ManyToOne
	@JoinColumn
	private MedOrder medorder;
	
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_cost() {
		return item_cost;
	}
	public void setItem_cost(int item_cost) {
		this.item_cost = item_cost;
	}
	public int getItem_quantity() {
		return item_quantity;
	}
	public void setItem_quantity(int item_quantity) {
		this.item_quantity = item_quantity;
	}
	public MedOrder getMedorder() {
		return medorder;
	}
	public void setMedorder(MedOrder medorder) {
		this.medorder = medorder;
	}
	
}
