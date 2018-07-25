/*
 * @Title : Main.java
 * 
 * @version V2.0.0
 * @date：2018年7月16日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.ssh.learn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.ext.beans.BeansWrapper;

/**
 * @ClassName: Main
 * @Description: TODO
 * @author zhusiyang
 * @since v2.0.0
 * @date 2018年7月16日
 * 
 */
public class Main {
	public static void main(String[] args) throws Exception {
		// String name = "D:\\objFile.obj";
		// ObjectOutputStream out = new ObjectOutputStream(new
		// FileOutputStream(name));
		// Instance instance = Instance.getInstance();
		// out.writeObject(instance);
		// out.close();
		//
		// ObjectInputStream in = new ObjectInputStream(new
		// FileInputStream(name));
		// Instance instance1 = (Instance) in.readObject();
		// in = new ObjectInputStream(new FileInputStream(name));
		// Instance instance2 = (Instance) in.readObject();
		//
		// System.out.println("obj1 hashcode:" + instance1.hashCode());
		// System.out.println("obj2 hashcode:" + instance2.hashCode());
		// in.close();

		// Student stu = new Student("kevin", 23);
		// Student stu2 = stu.clone();
		// stu2.setAge(0);
		// System.out.println(stu.equals(stu2));
		// System.out.println(stu.getName()==stu2.getName());
		// System.out.println(stu.getAge());

		// Object[] objects = new Long[1];
		// objects[0] = "hello";
		// System.out.println(objects[0]);

//		List<String> l1 = new ArrayList<String>();
//		List<Integer> l2 = new ArrayList<Integer>();
//		System.out.println(l1.getClass().getName());
//		System.out.println(l1.getClass() == l2.getClass());
//		
//		
//		List<Integer> li2 = null;
//		li2 = new ArrayList();
		//List<Boolean> li3 = new ArrayList<Boolean>[];
		
//		List<Sub> list1 = new ArrayList<Sub>();
//		List<Base> list2 = new ArrayList<Base>();
//		list2.addAll(list1);
//		System.out.println(list2);
//		Main main = new Main();
//		Sub sub = main.new Sub();
//		Base base = sub;   
		
//		List<? > wildlist = new ArrayList<T>();
//		wildlist.add("");// 编译不通过
		
		
//		double x = 1.1;
//		double y = 2.2;
//		double result = Operation.DEFAULT.apply(x, y);
//		System.out.println(result);
//		Map<AlamPoints, Command> map = new HashMap<AlamPoints, Command>();
//		EnumMap<AlamPoints, Command> em = new EnumMap<AlamPoints, Command>(AlamPoints.class);
//		em.put(AlamPoints.KTTCHEN, new Command() {
//			
//			@Override
//			public void action() {
//				System.out.println("Kitchen fire");
//				
//			}
//		});
//		em.put(AlamPoints.BATHROOM, new Command() {
//
//			@Override
//			public void action() {
//				 System.out.println("Bathroom alert!");
//				
//			}
//			
//		});
//		for(Map.Entry<AlamPoints, Command> e:em.entrySet()){
//			System.out.print(e.getKey() + ":");
//			e.getValue().action();
//		}
		
		
		
//		Date start = new Date();
//		Date end = new Date();
//		Period period = new Period(start, end);
//		end.setYear(78);
//		System.out.println(end);
//		
//		List<String> list = new ArrayList<>();
		System.out.println(Object[].class);
	}
	class Base{}

	class Sub extends Base{}

	 
}
