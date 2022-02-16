package com.example.demo.entity;
import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;@Entity
	public class Student {
	@javax.persistence.Id
	@GeneratedValue
	private int Id;
	private String Name;
	private String loc;
	private String job;
	private int age; public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public int getId() {
	return Id;
	}
	public void setId(int id) {
	Id = id;
	}
	public String getName() {
	return Name;
	}
	public void setName(String name) {
	Name = name;
	}
	public String getLoc() {
	return loc;
	}
	public void setLoc(String loc) {
	this.loc = loc;
	}
	public String getJob() {
	return job;
	}
	public void setJob(String job) {
	this.job = job;
	}
	public Student(int id, String name, String loc, String job, int age) {
	super();
	Id = id;
	Name = name;
	this.loc = loc;
	this.job = job;
	this.age = age;
	}
	public Student() {
	super();
	// TODO Auto-generated constructor stub
	}
}




