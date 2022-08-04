package com.bridgeLab.workshop2;

public class PhysicsTeacher extends Teacher {
	String mainSubject = "Physics";
	
	public static void main(String[] args) {
		PhysicsTeacher obj = new PhysicsTeacher() ;
		System.out.println("College Name is:"+ obj.collegeName);
		System.out.println("Teacher Designation is:" + obj.designation);
		System.out.println("Teacher Main Subject is: "+obj.mainSubject);
		obj.does();
		
		}
	}