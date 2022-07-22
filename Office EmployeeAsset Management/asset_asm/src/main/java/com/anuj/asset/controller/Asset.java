package com.anuj.asset.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Asset {
	
	@Id
	private String aname;
	private String date;
	private String condition;
	private String status;
	
	
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	/*public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}*/
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Asset [aname=" + aname + ", date=" + date + ", condition=" + condition + ", status=" + status + "]";
	}
	
	
	
	
	

}
