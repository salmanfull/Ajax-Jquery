/**
 * 
 */
package com.full.bean;

/**
 * @author Johnson Abraham
 * @since 13-Apr-2017, 10:31:40 AM
 * AJAX-JSON
 */
public class Intern {

	private int id;
	private String name;
	private int age;
	private String team;
	
	/**
	 * 
	 */
	public Intern() {
		// TODO Auto-generated constructor stub
	}

	public Intern(int id, String name, int age, String team) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.team = team;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}
