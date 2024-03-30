package com.model;

public class Harddisk {

	private int hid;
	private String hname;
	public Harddisk() {
		super();
	}
	public Harddisk(int hid, String hname) {
		super();
		this.hid = hid;
		this.hname = hname;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	@Override
	public String toString() {
		return "Harddisk [hid=" + hid + ", hname=" + hname + "]";
	}
	
	
	
}
