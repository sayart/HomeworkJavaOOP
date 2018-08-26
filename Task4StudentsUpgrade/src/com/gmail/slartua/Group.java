package com.gmail.slartua;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Group implements Voencom {
	private Student[] group = new Student[10];
	private String groupName;

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudentInteractive() throws FullGroupException {
		try {
			String firstName = inputFirstName();
			String lastName = inputLastName();
			int age = inputAge();
			boolean sex = inputSex();
			int zachetka = inputZachetka();
			String groupName = inputGroupName();
			Student st = new Student(firstName, lastName, age, sex, zachetka, groupName);
			addStudent(st);
		} catch (NullPointerException e) {
			e.printStackTrace();
			return;
		}
	}

	private String inputFirstName() throws NullPointerException {
		String s;
		for (;;) {
			try {
				s = String.valueOf(JOptionPane.showInputDialog("Input first name"));
				return s;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Wrong format");
			}
		}
	}

	private String inputLastName() throws NullPointerException {
		String s;
		for (;;) {
			try {
				s = String.valueOf(JOptionPane.showInputDialog("Input last name"));
				return s;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Wrong format");
			}
		}
	}

	private int inputAge() throws NullPointerException {
		Integer a;
		for (;;) {
			try {
				a = Integer.valueOf(JOptionPane.showInputDialog("Input age"));
				return a;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Wrong format");
			}
		}

	}

	private boolean inputSex() throws NullPointerException {
		boolean s;
		for (;;) {
			try {
				s = String.valueOf(JOptionPane.showInputDialog("Input sex man or woman")).equals("man");
				return s;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Wrong format");
			}
		}
	}

	private String inputGroupName() {
		return this.groupName;
	}

	private int inputZachetka() {
		Integer a;
		for (;;) {
			try {
				a = Integer.valueOf(JOptionPane.showInputDialog("Input zachetka"));
				return a;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Wrong format");
			}
		}
	}

	public void addStudent(Student student) throws FullGroupException {
		if (student == null) {
			throw new IllegalArgumentException("Student null");
		}
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				student.setGroupName(this.groupName);
				group[i] = student;
				return;
			}
		}
		throw new FullGroupException();
	}

	public Student search(String lastName) {
		for (Student student : group) {
			if (student != null && student.getLastName().equals(lastName)) {
				return student;
			}
		}
		return null;
	}

	public void deleteStudent(int zachetka) {
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getZachetka() == zachetka) {
				group[i] = null;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Group: " + this.groupName).append(System.lineSeparator());
		int i = 0;
		for (Student student : group) {
			if (student != null) {
				sb.append(++i + ". " + student);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

	public void sortByParametr(int i) {
		Arrays.sort(this.group, new StudentComparator(i));
	}

	public void sortByParametr(int i, boolean forward) {
		Arrays.sort(this.group, new StudentComparator(i, forward));
	}

	@Override
	public Student[] getRecrut() {
		int n = 0;
		for (Student student : group) {
			if (student != null && student.isSex() && student.getAge() >= 18) {
				n += 1;
			}
		}
		Student[] groupRecruts = new Student[n];
		int i = 0;
		for (Student student : this.group) {
			if (student != null && student.isSex() && student.getAge() >= 18) {
				groupRecruts[i++] = student;
			}
		}
		return groupRecruts;

	}

}
