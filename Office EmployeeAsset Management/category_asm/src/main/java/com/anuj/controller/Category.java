package com.anuj.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	private int cid;
	private String cname;
	private String cdesc;
	
	/*@OneToOne
	@PrimaryKeyJoinColumn(name="cid")
	@Autowired
	Asset aset;*/
	
	/*public Asset getAset() {
		return aset;
	}
	public void setAset(Asset aset) {
		this.aset = aset;
	}*/
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdesc() {
		return cdesc;
	}
	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", cdesc=" + cdesc + "]";
	}
	
	

}
	
	