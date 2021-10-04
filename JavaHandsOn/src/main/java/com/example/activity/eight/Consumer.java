package com.example.activity.eight;

import java.util.LinkedList;

class Consumer extends Thread {

	private final LinkedList<Integer> buffer;
	private final int SIZE = 10;

	public Consumer(LinkedList<Integer> buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i = 0; i < SIZE; i++) {
			System.out.println("Consumed: " + (i + 1));
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

    private void consume() throws InterruptedException {
    	
    	//synchronized will allow us to share our buffer across multiple threads nicely
        synchronized(buffer) {
        	while(buffer.isEmpty()) {
        		System.out.println("The buffer is empty...");
        		buffer.wait();
        	}
        	//1. While the buffer is full, print that is is full and wait with the wait() method
        	//HINT wait needs to be called on the buffer itself
        	
        	synchronized(buffer) {
        		System.out.println("Item resolved from buffer.");
        		buffer.remove(0);
        		Thread.sleep(100);
        		buffer.notify();
        	}
        	//2. If the buffer is empty add the next value to the buffer
        	//3. Notify the other threads the buffer has been updated with notify
        	//Hint notify needs to be called on the buffer itself
        }
    }
}