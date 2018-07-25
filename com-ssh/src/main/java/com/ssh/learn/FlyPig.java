/*
 * @Title : FlyPig.java
 * 
 * @version V2.0.0
 * @date：2018年7月17日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.ssh.learn;

import java.io.Serializable;

/**
 * @ClassName: FlyPig
 * @Description: TODO
 * @author zhusiyang
 * @since v2.0.0
 * @date 2018年7月17日
 * 
 */
public class FlyPig implements Serializable {
	 private static final long serialVersionUID = 1L;
	private static String AGE = "26";
	private String name;
	private String color;
	transient private String car;

	 private String addTip;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	 public String getAddTip() {
	 return addTip;
	 }
	
	 public void setAddTip(String addTip) {
	 this.addTip = addTip;
	 }

	@Override
	public String toString() {
		return "FlyPig{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", car='" + car + '\'' + ", AGE='"
				+ AGE + '\'' +
				// ", addTip='" + addTip + '\'' +
				'}';
	}

}
