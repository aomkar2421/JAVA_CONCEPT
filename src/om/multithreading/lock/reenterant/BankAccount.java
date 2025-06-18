package om.multithreading.lock.reenterant;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

	int balance = 100;

	Lock lock = new ReentrantLock();

	void withdrawBalance(int amount) {

		System.out.println(Thread.currentThread().getName()+" Is trying to withdraw money");
		if (amount <= balance) {

			try {
				if (lock.tryLock(2000, TimeUnit.MILLISECONDS)) {
					
					System.out.println(Thread.currentThread().getName()+" Money withdrawl is in progress");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}finally {
						lock.unlock();
					}
					balance -=amount;
					System.out.println(Thread.currentThread().getName()+" Withdrawl complete");

				}else {
					System.out.println(Thread.currentThread().getName()+" Could not acquire lock");
				}

			}
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}

		}
		else {
			System.out.println(Thread.currentThread().getName()+" Amount is insufficient");
			System.out.println(Thread.currentThread().getName()+"Trnsaction failed");
			return;
		}

	}

}




//package com.om.lock.reenterant;
//
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class BankAccount {
//
//	int balance = 100;
//
//	private final Lock lock = new ReentrantLock();
//
//	void withdrawBalance(int amount) {
//
//		System.out.println(Thread.currentThread().getName()+" Is trying to withdraw money");
//
//		try {
//			if (lock.tryLock(400, TimeUnit.MILLISECONDS)) {
//				
//				if (amount <= balance) {
//					
//					try {
//						System.out.println(Thread.currentThread().getName()+" Money withdrawl is in progress");
//						Thread.sleep(5000);
//						balance -=amount;
//						System.out.println(Thread.currentThread().getName()+" Withdrawl complete");
//					} catch (InterruptedException e) {
//						Thread.currentThread().interrupt();
//					}finally {
//						lock.unlock();
//					}
//					
//				}else {
//					System.out.println(Thread.currentThread().getName()+" Amount is insufficient");
//					System.out.println(Thread.currentThread().getName()+"Trnsaction failed");
//					return;
//				}
//				
//			}else {
//				System.out.println(Thread.currentThread().getName()+" Could not acquire lock");
//			}
//
//		}
//		catch (InterruptedException e) {
//			Thread.currentThread().interrupt();
//			e.printStackTrace();
//		}
//
//	}
//
//
//}
