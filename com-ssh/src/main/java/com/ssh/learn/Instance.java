/*
 * @Title : Instance.java
 * 
 * @version V2.0.0
 * @date：2018年7月16日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.ssh.learn;

import java.io.Serializable;

/**
 * @ClassName: Instance
 * @Description: TODO
 * @author zhusiyang
 * @since v2.0.0
 * @date 2018年7月16日
 * 
 */
public class Instance implements Serializable {
	private static final Instance obj = new Instance();

	private Instance() {

	}

	public static Instance getInstance() {
		return obj;
	}

	private Object readResolve() {
		return obj;
	}

}
