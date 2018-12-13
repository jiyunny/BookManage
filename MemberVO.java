package com.Project;

public class MemberVO {
	
	int  	memno    	= 0;  
	String  mname    	= null;  
	String  birthday    = null;
	String  tel         = null;
	String  memid       = null;
	String  mempw       = null;
	String  address     = null;
	String  mnager_user = null;
	String  gender      = null;
	
	MemberVO(int memno, String mname, String birthday, String tel, String mempw,String adress,String mnager_user,String gender){
		this.memno = memno;
		this.mname = mname;
		this.birthday = birthday;
		this.tel = tel ;
		this.mempw = mempw;
		this.address = address;
		this.mnager_user = mnager_user;
		this.gender = gender;
		
	}
	
	public int getMemno() {
		return memno;
	}
	public void setMemno(int memno) {
		this.memno = memno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMemid() {
		return memid;
	}
	public void setMemid(String memid) {
		this.memid = memid;
	}
	public String getMempw() {
		return mempw;
	}
	public void setMempw(String mempw) {
		this.mempw = mempw;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMnager_user() {
		return mnager_user;
	}
	public void setMnager_user(String mnager_user) {
		this.mnager_user = mnager_user;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
