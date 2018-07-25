/*
 * @Title : Student.java
 * 
 * @version V2.0.0
 * @date：2018年7月17日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.ssh.learn;

/**
 * @ClassName: Student
 * @Description: TODO
 * @author zhusiyang
 * @since v2.0.0
 * @date 2018年7月17日
 * 
 */
public class Student implements Cloneable {
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	

	@Override
	protected Student clone() throws CloneNotSupportedException {
		Student stu = (Student)super.clone();
		stu.name = new String(name);
		return stu;
	}
}
