/*
 * @Title : Person.java
 * 
 * @version V2.0.0
 * @date：2018年7月16日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.ssh.learn;

import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;

/**
 * @ClassName: Person
 * @Description: TODO
 * @author zhusiyang
 * @since v2.0.0
 * @date 2018年7月16日
 * 
 */
public class Person {
	private final Date birthDate;
	private static final Date BOOM_START;
	private static final Date BOOM_END;

	static {
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT")); // 新创建Calendar实例
		gmtCal.set(1949, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_START = gmtCal.getTime(); // 新创建Date实例
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_END = gmtCal.getTime(); // 新创建Date实例
	}

	public Person(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isBabyBoomer() {
		return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
	}

}
