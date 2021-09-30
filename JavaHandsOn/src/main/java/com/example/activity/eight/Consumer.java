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
        for(int i=0; i<SIZE; i++){
            try {
                System.out.println("Consumed: " + consume());
                Thread.sleep(50);
            } catch (InterruptedException e) {
            	e.printStackTrace();
            }

        }
    }
    
    //Fill out the produce method according to the given sudo code, this will implement the producer for us
    private int consume() throws InterruptedException {
    	//synchronized will allow us to share our buffer across multiple threads nicely
    	synchronized(buffer) {
    		//1. While the buffer is empty, print that is is empty and wait with the wait() method
        	//HINT wait needs to be called on the buffer itself
    		if(buffer.isEmpty()) {
    			System.out.println("Consumer, the buffer is empty. Please wait...");
    			buffer.wait();
    		}
    		
    		//2. Notify the other threads the buffer has been updated with notify
    		//Hint notify needs to be called on the buffer itself
    		int result = buffer.poll();
    		buffer.notify();
    		
    		//3. Grab the item at index 0 of the buffer and return it
    		return result;
    	}
    }
}
