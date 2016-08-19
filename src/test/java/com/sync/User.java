/**
 * 
 */
package com.sync;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/** 
 * @author wanggengqi
 * @email wanggengqi@chinasofti.com
 * @date 2016年3月17日 上午10:47:31 
 */
public class User {

	
	private String name;
	private Double money;
	private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	
	public User (String name, Double money){
		this.name = name;
		this.money = money;
	}
	
	public void addMoney(Double addmoney) throws InterruptedException{
			this.money += addmoney;
	}
	
	public void sendMoney(Double remoney, User user) throws InterruptedException{
		rwl.writeLock().lock();
		try {
			this.money -= remoney;
			user.addMoney(remoney);
			
			System.out.println(toString());
		} finally {
			rwl.writeLock().unlock();
		}
	}
	
	
	public String toString(){
		return "用户："+ this.name + " 剩余金额：" + String.valueOf(this.money);
	}
	
	public Double getMoney(){
		return this.money;
	}
}
