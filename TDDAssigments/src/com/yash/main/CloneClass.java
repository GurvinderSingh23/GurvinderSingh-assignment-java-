package com.yash.main;

public class CloneClass implements Cloneable {
	int id;
	String name;

	public CloneClass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public CloneClass() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	CloneClass clone1;

	public CloneClass getObject(int id, String name) throws CloneNotSupportedException {
		clone1 = new CloneClass(id, name);
		return (CloneClass) clone1.clone();

	}

}
