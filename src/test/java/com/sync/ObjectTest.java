/**
 * 
 */
package com.sync;

/** 
 * @author wanggengqi
 * @email wanggengqi@chinasofti.com
 * @date 2016年3月17日 下午3:22:01 
 */
public class ObjectTest {

	/** 
	 * @author wanggengqi
	 * @date 2016年3月17日 下午3:22:01
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 User a = new User("a", 100.00);
		 User b = new User("a", 100.00);
		 System.out.println(a == b);
		 System.out.println(a.equals(b)); 
		 System.out.println(a.hashCode());
		 System.out.println(b.hashCode());
	}

}
