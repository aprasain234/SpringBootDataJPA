package com.ashishprasain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Avenger {
	
	@Id
	private int aid;
	private String aname;
	private String tech;
	private String planet;
	private int age;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public String getPlanet() {
		return planet;
	}
	public void setPlanet(String planet) {
		this.planet = planet;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Avenger [aid=" + aid + ", aname=" + aname + ", tech=" + tech + ", planet=" + planet + ", age=" + age
				+ "]";
	}
}
