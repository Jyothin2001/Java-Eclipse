package com.xworkz.stream;

import java.io.Serializable;

public class GodDTO implements Serializable ,Comparable<GodDTO>
{
	private static final long serialVersionUID = 1L;
	//no need to implements and override comparable<> interface instead use comparator()
	
	private String godName;
	private String place;
	private String gender;
	private String avatar;
	private String specialPower;
	
	
	public GodDTO()
	{
		System.out.println("no arg");
	}
	
	public GodDTO(String godName, String place, String gender, String avatar, String specialPower) {
		super();
		this.godName = godName;
		this.place = place;
		this.gender = gender;
		this.avatar = avatar;
		this.specialPower = specialPower;
	}
	
	
	@Override
	public String toString() {
		return "GodDTO [godName=" + godName + ", place=" + place + ", gender=" + gender + ", avatar=" + avatar
				+ ", specialPower=" + specialPower + "]";
	}

	public String getGodName() {
		return godName;
	}
	public void setGodName(String godName) {
		this.godName = godName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getSpecialPower() {
		return specialPower;
	}
	public void setSpecialPower(String specialPower) {
		this.specialPower = specialPower;
	}

	@Override
	public int compareTo(GodDTO o) 
	{
		
		return this.getGodName().compareTo(o.godName);
	}

}
