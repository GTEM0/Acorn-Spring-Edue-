package com.acorn.api;

public class ApiDTO {

	String informCode;
	String informCause;
	String informOverall;
	String informData;
	public String getInformCode() {
		return informCode;
	}
	public void setInformCode(String informCode) {
		this.informCode = informCode;
	}
	public String getInformCause() {
		return informCause;
	}
	public void setInformCause(String informCause) {
		this.informCause = informCause;
	}
	public String getInformOverall() {
		return informOverall;
	}
	public void setInformOverall(String informOverall) {
		this.informOverall = informOverall;
	}
	public String getInformData() {
		return informData;
	}
	public void setInformData(String informData) {
		this.informData = informData;
	}
	@Override
	public String toString() {
		return "ApiDTO [informCode=" + informCode + ", informCause=" + informCause + ", informOverall=" + informOverall
				+ ", informData=" + informData + "]";
	}
	 public ApiDTO() {
		// TODO Auto-generated constructor stub
	}
	public ApiDTO(String informCode, String informCause, String informOverall, String informData) {
		super();
		this.informCode = informCode;
		this.informCause = informCause;
		this.informOverall = informOverall;
		this.informData = informData;
	}
	 
	
}
