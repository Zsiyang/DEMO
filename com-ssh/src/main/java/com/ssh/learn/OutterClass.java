/*
 * @Title : OutterClass.java
 * 
 * @version V2.0.0
 * @date：2018年7月17日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.ssh.learn;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/** 
 * @ClassName: OutterClass 
 * @Description: TODO
 * @author zhusiyang
 * @since v2.0.0
 * @date 2018年7月17日 
 *  
 */
public class OutterClass {
	static int b = 0;
	int a = 0;
	//成员内部类
	class PartnerInnerClass{
		public void change(int a) {
			a=OutterClass.this.a;
			System.out.println("成员内部类a:"+a);
		}
	}
	//静态内部类
	static class  JubuInnerClass{
		int a = 2;
		public void change(int a) {
			System.out.println("静态内部类a:"+ b);
		}
		
		List<Object> aa = new List<Object>() {
			//匿名内部类
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Object> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean add(Object e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends Object> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends Object> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object set(int index, Object element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void add(int index, Object element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<Object> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<Object> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<Object> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
//局部内部类
class  JubuInnerClass{
	public void change(int a) {
		System.out.println("局部内部类a:"+a);
	}
}
