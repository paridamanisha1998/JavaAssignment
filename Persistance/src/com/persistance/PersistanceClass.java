package com.persistance;

public class PersistanceClass {

	public static void main(String[] args) {
		
		Persistance ob1=new FilePersistance();
		ob1.persist();
		Persistance ob2=new DatabasePersistance();
		ob2.persist();
		
	}

}
