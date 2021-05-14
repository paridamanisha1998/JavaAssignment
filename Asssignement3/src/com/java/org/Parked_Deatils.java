package com.java.org;

import java.util.*;

public class Parked_Deatils {
	String Name;
	String carModel;
	int carNo;
	String MobileNo;
	String Address;

	public Parked_Deatils(String name, String carModel, int carNo, String mobileNo, String address) {
		super();
		Name = name;
		this.carModel = carModel;
		this.carNo = carNo;
		MobileNo = mobileNo;
		Address = address;
	}

	@Override
	public String toString() {
		return "Parked_Owner_Deatils [Name=" + Name + ", carModel=" + carModel + ", carNo=" + carNo + ", MobileNo="
				+ MobileNo + ", Address=" + Address + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void remove() {
		// TODO Auto-generated method stub

	}

}

class Parked_Car_Owner_List {

	static  Parked_Deatils p1 = new Parked_Deatils("Hulk", "Buildozer", 1807, "9874561230",
			"20/7 Guardian of galaxy");
	static Parked_Deatils p2 = new Parked_Deatils("Tom", "Bike", 1998, "9784561230",
			"7g Disney World");
	static Parked_Deatils p3 = new Parked_Deatils("Jerry", "Cycle", 0211, "9871234560",
			"8g Disney World");
	static Parked_Deatils p4 = new Parked_Deatils("Thor", "Audi", 0311, "9654123780",
			"20/A Guardian of galaxy");

	static TreeMap<Integer, Parked_Deatils> n = new TreeMap<>();

	static int add_new_car(Parked_Deatils obj) {

		n.put(100, p1);
		n.put(102, p2);
		n.put(103, p3);
		n.put(104, p4);

		System.out.println(n);
		return 0;

	}

	public static Object remove1(int i) {

		n.remove(i);

		System.out.println(n);
		return n;

	}

	public static Object Get_owner_information(int token) {

		System.out.println(n.get(token));

		return n.get(token);

	}

	public static void main(String[] args) {

		add_new_car(p1);

		remove1(102);

		Get_owner_information(104);

	}

}
