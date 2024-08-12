package com.neml.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PersonAgeNameComparator {

	public static void main(String[] args) {

		List<PersonModel> pls = new ArrayList<PersonModel>();
		pls.add(new PersonModel("Balaji",26));
		pls.add(new PersonModel("Niraj",23));
		pls.add(new PersonModel("Parag",25));
		pls.add(new PersonModel("Gaurav",27));
		
		Iterator<PersonModel> itp = pls.iterator();
		while(itp.hasNext()) {
			
			PersonModel person = itp.next();
			
			System.out.println("Name : "+person.getName()+ " | Age : "+person.getAge());
			
		}
		
		System.out.println("After sorting ...");
		
		Collections.sort(pls,Comparator.comparingInt(PersonModel :: getAge).thenComparing(PersonModel :: getName));
		
		Iterator<PersonModel> itp1 = pls.iterator();
		while(itp1.hasNext()) {
			
			PersonModel person = itp1.next();
			
			System.out.println("Name : "+person.getName()+ " | Age : "+person.getAge());
			
		}
	}

}

class PersonModel {

	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PersonModel(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonModel [name=" + name + ", age=" + age + "]";
	}
}

//class AgeComparator implements Comparator<PersonModel>{
//
//	@Override
//	public int compare(PersonModel o1, PersonModel o2) {
//		
//		if(o1.getAge()>o2.getAge()) {		
//			return 1;	
//		}else if(o1.getAge()==o2.getAge()){
//			return 0;
//		}else {
//			return -1;
//		}
//		
//	}
//	
//}
