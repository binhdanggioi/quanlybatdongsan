package com.laptrinhjavaweb.DTO;

public class CustomerDTO extends AbstractDTO {
	private String name;
	private Integer phoneNumber;
	private String email;
	private String need;
	private String staffimport;
	private String dateimport;
	private String status;
	private Long staffId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
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

}
