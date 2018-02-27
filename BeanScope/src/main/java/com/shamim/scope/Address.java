package com.shamim.scope;

public class Address {
	
	private String thana;
	private String district;
	
	public Address() {
	}

	public Address(String thana, String district) {
		this.thana = thana;
		this.district = district;
	}

	public String getThana() {
		return thana;
	}

	public void setThana(String thana) {
		this.thana = thana;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "Address [thana=" + thana + ", district=" + district + "]";
	}
}
