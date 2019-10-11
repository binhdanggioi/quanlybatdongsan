package com.laptrinhjavaweb.entity;

import java.util.Date;

import com.laptrinhjavaweb.annotation.Column;

public class BaseEntity {
	@Column(name = "id")
	private Long id;

	@Column(name = "createddate")
	private Date createdDate;

	@Column(name = "createdby")
	private Date createdBy;

	@Column(name = "modifieddate")
	private String modifiedDate;

	@Column(name = "modifiedby")
	private String modifiedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
