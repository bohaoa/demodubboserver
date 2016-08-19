/**
 * 
 */
package com.sync;

/** 
 * @author wanggengqi
 * @email wanggengqi@chinasofti.com
 * @date 2016年3月17日 上午10:53:35 
 */
public class SynchronizedTest {

	/** 
	 * @author wanggengqi
	 * @date 2016年3月17日 上午10:53:35
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		
		final User a = new User("a", 100.00);
		final User b = new User("b", 100.00);
		final User c = new User("c", 100.00);
		
		
		for(int i=0; i<4; i++){
			Thread thread_a = new Thread(new Runnable(){
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						a.sendMoney(10.00, b);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			thread_a.start();
		}
		 
		
		for(int i=0; i<4; i++){
			Thread thread_c = new Thread(new Runnable(){
				public void run() {
					try {
						c.sendMoney(10.00, b);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			thread_c.start();
		}
		
		 
	}

}
