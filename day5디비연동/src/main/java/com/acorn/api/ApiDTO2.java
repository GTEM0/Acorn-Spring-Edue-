package com.acorn.api;

public class ApiDTO2 {

	String informCode;
	String informCause;
	String informOverall;
	String informData;
	String imageUrl1;
	String imageUrl2;
	String imageUrl3;
	String imageUrl4;
	String imageUrl5;
	String imageUrl6;
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
	public String getImageUrl1() {
		return imageUrl1;
	}
	public void setImageUrl1(String imageUrl1) {
		this.imageUrl1 = imageUrl1;
	}
	public String getImageUrl2() {
		return imageUrl2;
	}
	public void setImageUrl2(String imageUrl2) {
		this.imageUrl2 = imageUrl2;
	}
	public String getImageUrl3() {
		return imageUrl3;
	}
	public void setImageUrl3(String imageUrl3) {
		this.imageUrl3 = imageUrl3;
	}
	public String getImageUrl4() {
		return imageUrl4;
	}
	public void setImageUrl4(String imageUrl4) {
		this.imageUrl4 = imageUrl4;
	}
	public String getImageUrl5() {
		return imageUrl5;
	}
	public void setImageUrl5(String imageUrl5) {
		this.imageUrl5 = imageUrl5;
	}
	public String getImageUrl6() {
		return imageUrl6;
	}
	public void setImageUrl6(String imageUrl6) {
		this.imageUrl6 = imageUrl6;
	}
	@Override
	public String toString() {
		return "ApiDTO2 [informCode=" + informCode + ", informCause=" + informCause + ", informOverall=" + informOverall
				+ ", informData=" + informData + ", imageUrl1=" + imageUrl1 + ", imageUrl2=" + imageUrl2
				+ ", imageUrl3=" + imageUrl3 + ", imageUrl4=" + imageUrl4 + ", imageUrl5=" + imageUrl5 + ", imageUrl6="
				+ imageUrl6 + "]";
	}
	public ApiDTO2(String informCode, String informCause, String informOverall, String informData, String imageUrl1,
			String imageUrl2, String imageUrl3, String imageUrl4, String imageUrl5, String imageUrl6) {
		super();
		this.informCode = informCode;
		this.informCause = informCause;
		this.informOverall = informOverall;
		this.informData = informData;
		this.imageUrl1 = imageUrl1;
		this.imageUrl2 = imageUrl2;
		this.imageUrl3 = imageUrl3;
		this.imageUrl4 = imageUrl4;
		this.imageUrl5 = imageUrl5;
		this.imageUrl6 = imageUrl6;
	}
	
	public ApiDTO2() {
		// TODO Auto-generated constructor stub
	}
}
