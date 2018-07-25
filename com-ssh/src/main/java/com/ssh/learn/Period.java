/*
 * @Title : Period.java
 * 
 * @version V2.0.0
 * @date：2018年7月19日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.ssh.learn;

import java.util.Date;

/**
 * @ClassName: Period
 * @Description: TODO
 * @author zhusiyang
 * @since v2.0.0
 * @date 2018年7月19日
 * 
 */
public class Period {
	private final Date start;
	private final Date end;

	public Period(Date start, Date end) {
		if (start.compareTo(end) > 0) {
			throw new IllegalArgumentException(start + "after" + end);
		}
		this.start = start;
		this.end = end;
	}

	public Date start() {
		return start;
	}

	public Date end() {
		return end;
	}

}
