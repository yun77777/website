package com.mall.user;

public class LoginDTO {

    private String ID;
    private String PW;
    private boolean useCookie;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public boolean isUseCookie() {
		return useCookie;
	}
	public void setUseCookie(boolean useCookie) {
		this.useCookie = useCookie;
	}
	@Override
	public String toString() {
		return "LoginDTO [ID=" + ID + ", PW=" + PW + ", useCookie=" + useCookie + "]";
	}

    // getter, setter, toString 생략
}