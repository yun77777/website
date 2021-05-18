package com.mall.user;

public class UserVO {

	private String ID;
	private String PW;
//    private String userName;
//    private String userEmail;
//    private Date userJoinDate;
//    private Date userLoginDate;
//    private String userSignature;
//    private String userImg;
//    private int userPoint;
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String PW) {
		this.PW = PW;
	}
	@Override
	public String toString() {
		return "UserVO [ID=" + ID + ", PW=" + PW + "]";
	}

	// getter, setter, toString 생략
}