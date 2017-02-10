package csc3502.processsimulator;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


/*
 * Homework 2:
 * @jsexto16
 * Goal: finish the code in each functions to provide a First in first out queue.
 * Note that in this class, no implementations of List in java library are allowed.
 * You could implement a linked list using the class Node below.
 */
public class FIFOQueue implements csc3502.processsimulator.Queue {

	//put your name as the value of the signature.
	String signature = "jsexto16";

	Node head = new Node(null);
	Node pointer = head;
	//public LinkedList <Node> fi = new LinkedList<Node>((Collection<? extends Node>) head);




	class Node {
		Process process;
		Node next;

		Node(Process p) {
			this.process = p;
			this.next = null;
		}

	}

	@Override
	public void offer(Process p) {
Node temp = new Node(p);
		if(isEmpty()){
		    head = temp;


        }

        else{

			if(head.next == null){
				head.next = temp;
			}
			pointer.next = temp;
        }
    pointer = temp;
		pointer.next = null;

	}

	@Override
	public Process poll() {

        if (isEmpty()) {
            return null;
        }
        else{
            Process p = head.process;
            head = head.next;
            return p;
        }


	}

	@Override
	public boolean isEmpty() {
	    if(head == null){
	    	return true;
		}

		else if (head.process == null){
	        return true;
        }
		else return false;
	}


	public String getSignature() {
		return signature;
	}

}
