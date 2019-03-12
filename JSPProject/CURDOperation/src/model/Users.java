package model;

import java.io.Serializable;

public class Users implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer S_No;
	private String First_Name = null;
	private String Last_Name = null;
	private String Email = null;
	private String Password = null;
	private String Gender = null;
	private String Country = null;
	private String State = null;
	private String City = null;

	public Integer getS_No() {
		return S_No;
	}

	public void setS_No(Integer s_No) {
		S_No = s_No;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Users [S_No=" + S_No + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Email=" + Email
				+ ", Password=" + Password + ", Gender=" + Gender + ", Country=" + Country + ", State=" + State
				+ ", City=" + City + "]";
	}
	
	
	
}
