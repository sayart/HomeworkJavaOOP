package com.gmail.slartua;

public class Group {
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

}
