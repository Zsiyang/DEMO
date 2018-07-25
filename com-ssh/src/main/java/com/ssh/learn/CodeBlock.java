/*
 * @Title : CodeBlock.java
 * 
 * @version V2.0.0
 * @date：2018年7月16日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.ssh.learn;

/**
 * @ClassName: CodeBlock
 * @Description: TODO
 * @author zhusiyang
 * @since v2.0.0
 * @date 2018年7月16日
 * 
 */
class Code {
	{
		System.out.println("Code的构造块");
	}

	static {
		System.out.println("Code的静态代码块");
	}

	public Code() {
		System.out.println("Code的构造方法");
	}
}

public class CodeBlock {
	{
		System.out.println("CodeBlock的构造块");
	}

	static {
		System.out.println("CodeBlock的静态代码块");
	}

	public CodeBlock() {
		System.out.println("CodeBlock的构造方法");
	}

	public static void main(String[] args) {
		System.out.println("CodeBlock的主方法");
		new Code();
		new Code();
		new CodeBlock();
		new CodeBlock();
	}

}
