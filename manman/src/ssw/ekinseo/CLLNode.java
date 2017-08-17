package ssw.ekinseo;

public class CLLNode {
	public CLLNode next;
	public int data;
	
	public CLLNode() {
		next = null;
		data = Integer.MIN_VALUE;
	}
	public CLLNode(int data) {
		this.data = data;
		next = null;
	}
	public CLLNode getNext() {
		return this.next;
	}
	public void setNext(CLLNode node) {
		next = node;
	}
	public int getData() {
		return this.data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String toString() {
		return Integer.toString(data);
	}
	
	

}
