package com.example.spring01.model.dto;

public class AddressDTO {
	private String userid;
	private String passwd;
	private String name;
	private int tel;
	private String address;
	
	public AddressDTO() {
		super();
	}

		public AddressDTO(String userid, String passwd, String name, int tel, String address) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

		public String getUserid() {
			return userid;
		}

		public void setUserid(String userid) {
			this.userid = userid;
		}

		public String getPasswd() {
			return passwd;
		}

		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getTel() {
			return tel;
		}

		public void setTel(int tel) {
			this.tel = tel;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "AddressDTO [userid=" + userid + ", passwd=" + passwd + ", name=" + name + ", tel=" + tel
					+ ", address=" + address + "]";
		}
	
	
}
