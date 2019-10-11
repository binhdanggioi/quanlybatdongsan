package com.laptrinhjavaweb.builder;

public class CustomerSearchBuilder {
	private String name;
	private Integer phonenumber;
	private String email;
	private Long staffId;

	public String getName() {
		return name;
	}

	public Integer getPhonenumber() {
		return phonenumber;
	}

	public String getEmail() {
		return email;
	}
	
	public Long getStaffId() {
		return staffId;
	}

	private CustomerSearchBuilder(Customer builder) {
		this.name = builder.name;
		this.phonenumber = builder.phonenumber;
		this.email = builder.email;
		this.staffId = builder.staffId;
	}

	public static class Customer {
		private String name;
		private Integer phonenumber;
		private String email;
		private Long staffId;

		public Customer setName(String name) {
			this.name = name;
			return this;
		}

		public Customer setPhonenumber(Integer phonenumber) {
			this.phonenumber = phonenumber;
			return this;
		}

		public Customer setEmail(String email) {
			this.email = email;
			return this;
		}
		
		public Customer setStaffId(Long staffId) {
			this.staffId = staffId;
			return this;
		}

		public CustomerSearchBuilder build() {
			return new CustomerSearchBuilder(this);
		}
	}
}
