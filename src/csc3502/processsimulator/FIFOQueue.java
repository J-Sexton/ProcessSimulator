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
	public Queue<Node>q = new Queue<Node>() {
        @Override
        public boolean add(Node node) {
            return false;
        }

        @Override
        public boolean offer(Node node) {
            return false;
        }

        @Override
        public Node remove() {
            return null;
        }

        @Override
        public Node poll() {
            return null;
        }

        @Override
        public Node element() {
            return null;
        }

        @Override
        public Node peek() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Node> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Node> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };

	class Node {
		Process process;
		Node next;

		Node(Process p) {
			this.process = p;
			this.next = null;
		}

	}

	//@Override
	public void offer(Process p) {
		/*Node previous= fi.getLast();
		Node n = new Node(p);
		fi.add(n);
		previous.next=n;*/
		Node n = new Node(p);
		q.offer(n);
		head = n;


	}

	@Override
	public Process poll() {
		return head.process;
	}

	@Override
	public boolean isEmpty() {
	    if(head.process == null | head == null){
	    	return true;
		}
		else return false;
	}


	public String getSignature() {
		return signature;
	}

}
