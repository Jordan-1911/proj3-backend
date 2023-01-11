package com.proj3.warehouses.models;

import javax.persistence.*;


@Entity
@Table(name= "gpu_inventory")
public class Gpu {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gpu_id")
	private int id;
	
	@Column(name = "manufacturer")
	private String manufacturer;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "cost")
	private int cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Gpu [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", cost=" + cost + "]";
	}
	

}
