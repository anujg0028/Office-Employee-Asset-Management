package com.anuj.Employee;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.anuj.asset.Asset;

@Entity
@Table(name="employee")
public class Employee {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	private String designation;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Asset aset;
	
	public Employee()
	{
		eid=0;
		ename="";
		designation="";
		aset=null;
	}
	
	
	
	public Employee(int eid, String ename, String designation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.designation = designation;
	}


	public Employee(int eid, String ename, String designation, Asset aset) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.designation = designation;
		this.aset = aset;
	}


	public int getEid() {
		return eid;
	}
	
	
	public Asset getAset() {
		return aset;
	}

	public void setAset(Asset aset) {
		this.aset = aset;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", designation=" + designation + "]";
	}
		//




	
	
}

