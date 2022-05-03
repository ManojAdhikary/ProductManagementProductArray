package com.takeo.model;
//Step 1. Properties, 2. Getter, Setter 3. Constructor
//Step 2: Impl
//Step 3: model
//Step 4: client
public class Ticket {

	int sno;
	String pname;
	int qty;
	int price;

	public int getSno() {
		return sno;
	}

	public void setSno(int pid) {
		this.sno = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Ticket(int sno, String pname, int qty, int price) {
		super();
		this.sno = sno;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}

	public Ticket() {
		super();
	}

}
