/*
 * @Title : Operation.java
 * 
 * @version V2.0.0
 * @date：2018年7月19日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.ssh.learn;

/**
 * @ClassName: Operation
 * @Description: TODO
 * @author zhusiyang
 * @since v2.0.0
 * @date 2018年7月19日
 * 
 */
public enum Operation {
	// PLUS, MINUS, TIMES, DUVIDE;
	// double apply(double x, double y) {
	// switch (this) {
	// case PLUS:
	// return x + y;
	// case MINUS:
	// return x - y;
	// case TIMES:
	// return x * y;
	// case DUVIDE:
	// return x / y;
	// }
	// throw new AssertionError("Unknow op:" + this);
	// }
	PLUS {
		double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS {
		double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES {
		double apply(double x, double y) {
			return x * y;
		}
	},
	DEFAULT {

		double apply(double x, double y) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	},
	DUVIDE {
		double apply(double x, double y) {
			return x / y;
		}
	};
	abstract double apply(double x, double y);
}
