package csc3502.processsimulator;
import java.util.*;


/*
 * Homework 2:
 * @jsexto16
 * Goal: finish the code in each functions to provide a First in first out queue.
 * Note that in this class, no implementations of List in java library are allowed.
 * You could implement a linked list using the class Node below.
 */
public class FIFOQueue implements Queue {

	//put your name as the value of the signature.
	String signature = "jsexto16";
	
	Node head = new Node(null);
	Node pointer = head;
	LinkedList fifoQueue = new LinkedList();

	class Node {
		Process process;
		Node next;

		Node(Process p) {
			this.process = p;
			fifoQueue.add(p);
			this.next = null;
		}
	}

	@Override
	public void offer(Process p) {
		fifoQueue.offer(p);
	}

	@Override
	public Process poll() {
		fifoQueue.poll();
	}

	@Override
	public boolean isEmpty() {
	    int y =0;
		Iterator<Process>x=fifoQueue.iterator();
		while(x.hasNext()){
		    y++;
        }
        if (y == 0){
		    return true;
        }
        else return false;
	}

	@Override
	public String getSignature() {
		return signature;
	}
	
}
