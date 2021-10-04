package com.example.activity.eight;

import java.util.LinkedList;

class Producer extends Thread {

    private final LinkedList<Integer> buffer;
    private final int SIZE = 10;

    public Producer(LinkedList<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < SIZE; i++) {
            System.out.println("Produced: " + (i+1));
            try {
                produce(i);
            } catch (InterruptedException e) {
            	e.printStackTrace();
            }

        }
    }
    
    
    //Fill out the produce method according to the given sudo code, this will implement the producer for us
    private void produce(int i) throws InterruptedException {
    	
    	//synchronized will allow us to share our buffer across multiple threads nicely
        synchronized(buffer) {
        	while(buffer.size() == SIZE) {
        		System.out.println("The buffer is full...");
        		buffer.wait();
        	}
        	//1. While the buffer is full, print that is is full and wait with the wait() method
        	//HINT wait needs to be called on the buffer itself
        	
        	synchronized(buffer) {
        		System.out.println("New item added to buffer.");
        		buffer.add(i);
        		Thread.sleep(100);
        		buffer.notify();
        	}
        	//2. If the buffer is empty add the next value to the buffer
        	//3. Notify the other threads the buffer has been updated with notify
        	//Hint notify needs to be called on the buffer itself
        }
    }
}