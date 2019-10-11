package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.annotation.Column;
import com.laptrinhjavaweb.annotation.Entity;
import com.laptrinhjavaweb.annotation.Table;

@Entity
@Table(name = "infocustomer")
public class CustomerEntity extends BaseEntity {
	@Column(name = "name")
	private String name;

	@Column(name = "phonenumber")
	private Integer phonenumber;

	@Column(name = "email")
	private String email;
	
	@Column(name = "need")
	private String need;
	
	@Column(name = "staffimport")
	private String staffimport;
	
	@Column(name = "dateimport")
	private String dateimport;
	
	@Column(name = "status")
	private String status;

	@Column(name = "staffid")
	private Long staffId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNeed() {
		return need;
	}

	public void setNeed(String need) {
		this.need = need;
	}

	public String getStaffimport() {
		return staffimport;
	}

	public void setStaffimport(String staffimport) {
		this.staffimport = staffimport;
	}

	public String getDateimport() {
		return dateimport;
	}

	public void setDateimport(String dateimport) {
		this.dateimport = dateimport;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

}
