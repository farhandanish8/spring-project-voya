package com.insuranceapp.model;

public class Insurance {
	private Integer insuranceId;
	private String policyname;
	private String brand;
	private String type;
	private int duration;
	private double premiun;
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insurance(Integer insuranceId, String policyname, String brand, String type, int duration, double premiun) {
		super();
		this.insuranceId = insuranceId;
		this.policyname = policyname;
		this.brand = brand;
		this.type = type;
		this.duration = duration;
		this.premiun = premiun;
	}
	public Integer getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getPolicyname() {
		return policyname;
	}
	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getPremiun() {
		return premiun;
	}
	public void setPremiun(double premiun) {
		this.premiun = premiun;
	}
	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", policyname=" + policyname + ", brand=" + brand + ", type="
				+ type + ", duration=" + duration + ", premiun=" + premiun + "]";
	}
	
}
