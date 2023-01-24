package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "CONTACT_DTLS")

public class Contact {

	public Contact() {
		super();
		//TODO Auto-generated constructor stub
	}
	public Contact(int cid, String name, String email, long phno, String activeSw) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.activeSw = activeSw;
	}
	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", name=" + name + ", email=" + email + ", phno=" + phno + ", activeSw="
				+ activeSw + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private long phno;
	@Column
	private String activeSw;
	
}
