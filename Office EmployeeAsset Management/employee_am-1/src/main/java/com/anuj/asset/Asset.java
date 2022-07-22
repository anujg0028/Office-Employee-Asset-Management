package com.anuj.asset;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.anuj.Employee.Employee;

@Entity
@Table(name="asset")
public class Asset {
	
	@Id
	private String aname;
	private String date;
	private String condition;
	private String status;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Asset emp;
	
	
	
	/*@OneToOne
	private Employee emp;*/
	
	
	
	/*public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}*/
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
