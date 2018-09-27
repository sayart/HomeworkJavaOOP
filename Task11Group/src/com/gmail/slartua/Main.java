package com.gmail.slartua;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group group = new Group("FEL-111");
		try {
			group.addStudent(new Student(129956, "Artem", "Slobodyanyuk", 25, true));
			group.addStudent(new Student(223456, "Ortem", "blobodyanyuk", 25, true));
			group.addStudent(new Student(328456, "Brtem", "dlobodyanyuk", 25, true));
			group.addStudent(new Student(423456, "Drtem", "alobodyanyuk", 25, true));
			group.addStudent(new Student(523856, "artem", "Vlobodyanyuk", 25, true));
			group.addStudent(new Student(621456, "Vrtem", "vlobodyanyuk", 25, true));
			group.addStudent(new Student(723456, "Srtem", "Globodyanyuk", 25, true));
			group.addStudent(new Student(823956, "urtem", "globodyanyuk", 25, true));
			group.addStudent(new Student(923456, "Artem", "olobodyanyuk", 25, true));

		} catch (FullGroupException e) {
			e.printStackTrace();
		}
		group.delStudent(123456);
		
		System.out.println(group);
		System.out.println();
		
		group.sortByLastName(); //with help of interface Comparable
		System.out.println(group);
		System.out.println();
		
		group.sortByParameter(1);
		System.out.println(group);
		System.out.println();
		
	}
	

}
