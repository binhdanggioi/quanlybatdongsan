package com.laptrinhjavaweb.builder;

public class BuildingSearchBuilder {
	private String name;
	private String district;
	private String buildingarea;
	private String numberOfBasement;
	private String street;
	private String ward;
	private String[] buildingTypes = new String[] {};
	private String areaRentFrom;
	private String areaRentTo;
	private String costRentFrom;
	private String costRentTo;
	private String staffId;
	
	public String getName() {
		return name;
	}
	
	public String getStaffId() {
		return staffId;
	}

	public String getCostRentFrom() {
		return costRentFrom;
	}

	public String getCostRentTo() {
		return costRentTo;
	}

	public String getAreaRentFrom() {
		return areaRentFrom;
	}

	public String getAreaRentTo() {
		return areaRentTo;
	}

	public String[] getBuildingTypes() {
		return buildingTypes;
	}

	public String getDistrict() {
		return district;
	}

	public String getBuildingarea() {
		return buildingarea;
	}

	public String getNumberOfBasement() {
		return numberOfBasement;
	}

	public String getStreet() {
		return street;
	}

	public String getWard() {
		return ward;
	}

	private BuildingSearchBuilder(Builder builder) {
		this.name = builder.name;
		this.district = builder.district;
		this.numberOfBasement = builder.numberOfBasement;
		this.buildingarea = builder.buildingarea;
		this.street = builder.street;
		this.ward = builder.ward;
		this.buildingTypes = builder.buildingTypes;
		this.areaRentFrom = builder.areaRentFrom;
		this.areaRentTo = builder.areaRentTo;
		this.costRentFrom = builder.costRentFrom;
		this.costRentTo = builder.costRentTo;
		this.staffId = builder.staffId;

	}

	public static class Builder {
		private String name;
		private String district;
		private String buildingarea;
		private String numberOfBasement;
		private String street;
		private String ward;
		private String[] buildingTypes = new String[] {};
		private String areaRentFrom;
		private String areaRentTo;
		private String costRentFrom;
		private String costRentTo;
		private String staffId;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setStaffId(String staffId) {
			this.staffId = staffId;
			return this;
		}

		public Builder setCostRentFrom(String costRentFrom) {
			this.costRentFrom = costRentFrom;return this;
		}

		public Builder setCostRentTo(String costRentTo) {
			this.costRentTo = costRentTo;return this;
		}

		public Builder setAreaRentFrom(String areaRentFrom) {
			this.areaRentFrom = areaRentFrom;
			return this;
		}

		public Builder setAreaRentTo(String areaRentTo) {
			this.areaRentTo = areaRentTo;
			return this;
		}

		public Builder setBuildingTypes(String[] buildingTypes) {
			this.buildingTypes = buildingTypes;
			return this;
		}

		public Builder setStreet(String street) {
			this.street = street;
			return this;
		}

		public Builder setWard(String ward) {
			this.ward = ward;
			return this;
		}

		public Builder setDistrict(String district) {
			this.district = district;
			return this;
		}

		public Builder setBuildingarea(String buildingarea) {
			this.buildingarea = buildingarea;
			return this;
		}

		public Builder setNumberOfBasement(String numberOfBasement) {
			this.numberOfBasement = numberOfBasement;
			return this;
		}

		public BuildingSearchBuilder build() {
			return new BuildingSearchBuilder(this);
		}

	}

}
