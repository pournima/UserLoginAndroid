package com.pack.login;

import android.os.Parcel;
import android.os.Parcelable;

public class loginClass implements Parcelable {
	
	String name;
	String address;
	String gender;
	String hobbies;
	
	public loginClass(){
		
	}
	public loginClass(String name, String address, String gender,String hobbies) {
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.hobbies=hobbies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		dest.writeString(name);
		dest.writeString(address);
		dest.writeString(gender);
		dest.writeString(hobbies);
		
	}
	
	 public static Parcelable.Creator<loginClass> CREATOR=new Parcelable.Creator<loginClass>() {

		@Override
		public loginClass createFromParcel(Parcel source) {
			// TODO Auto-generated method stub
			
			loginClass cls=new loginClass();
			cls.setName(source.readString());
			cls.setAddress(source.readString());
			cls.setGender(source.readString());
			cls.setHobbies(source.readString());
			return cls;
		}

		@Override
		public loginClass[] newArray(int size) {
			// TODO Auto-generated method stub
			return null;
		}
	
	 }; 
		

}
