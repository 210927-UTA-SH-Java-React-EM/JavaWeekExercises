package com.example.activity.eight;

import java.util.LinkedList;  

public class ProducerConsumerDriver {
	
	public static void main(String args[]) {
        LinkedList<Integer> buffer = new LinkedList<Integer>();
        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);
        
        System.out.println(p.getBuffer().size());
        System.out.println(p.getSIZE());
       
        p.start();
        c.start();
        try {
			p.join();
			c.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
    }
}
