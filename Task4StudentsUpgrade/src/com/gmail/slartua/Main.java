package com.gmail.slartua;

public class Main {

	public static void main(String[] args) {
		Group groupOne = new Group("FEL-111");
		try {
			groupOne.addStudent(new Student("Artem", "Slobodyanyuk", 21, true, 1234, "FEL-111"));
			groupOne.addStudent(new Student("Ivan", "Ivanov", 20, true, 235245, "FEL-111"));
			groupOne.addStudent(new Student("Petr", "Petrov", 18, false, 4321, "FEL-111"));
			groupOne.addStudent(new Student("Oleksandr", "Oleksandrov", 17, true, 123145, "FEL-111"));
			groupOne.addStudent(new Student("Vasya", "Vasilev", 16, true, 1254562, "FEL-111"));
			groupOne.addStudent(new Student("Kolya", "Kolyanov", 16, false, 14156, "FEL-111"));
			// groupOne.addStudentInteractive();
		} catch (FullGroupException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(groupOne);

		System.out.println();

		Student student = groupOne.search("Vasilev");

		System.out.println(student);
		System.out.println();

		groupOne.sortByParametr(2, false);
		System.out.println(groupOne);

		Student[] groupRecruts = groupOne.getRecrut();
		for (Student rectruts : groupRecruts) {
			System.out.println("Recrut " + rectruts);
		}

	}
}
