package sist.com.obj.basic2;

public class Node {
	private Node before;
	private Object data;
	private Node next;
	   
	public Node() {
	      
	}
	public Node(Node before) {
		this.before=before;
	}
	public Node(Node before,Object data) {
	    this.before=before;
	    this.data=data;
	}
	public Node(Node before,Object data,Node next) {
	    this.before=before;
	    this.data=data;
	    this.next=next;
	}
	    public Node(Object data) {
	      this.data=data;
	   }
	    public Node(Object data,Node next) {
	      this.data=data;
	      this.next=next;
	   }
	    public Object getData() {
	       return this.data;
	    }
	    public void setData(Object data) {
	       this.data=data;
	    }
	    public void setNext(Node next) {
	       this.next=next;
	    }
	    public Node getNext() {
	       return this.next;
	    }
	    public Node getBefore() {
	       return this.before;
	    }
	    public void setBofore(Node before) {
	       this.before=before;
	    }
	   
	   public static void main(String[] args) {
	      /*Node node=new Node(10,new Node(20,new Node(30,new Node(40,new Node(50)))));//data|next
	      System.out.println(node.getNext().getNext().getNext().getData());*/
	      
	      //Node node=new Node(new Node(null,10,node),20,new Node(30));//before|data|next
	      Node []node={new Node(null,10),new Node(20),new Node(30),new Node(40)};
	      node[0].setNext(node[1]);
	      
	      node[1].setBofore(node[0]);
	      node[1].setNext(node[2]);
	      
	      node[2].setBofore(node[1]);
	      node[2].setNext(node[3]);
	      
	      node[3].setBofore(node[2]);
	      node[3].setNext(node[0]);
	      
	      System.out.println(node[0].getNext().getNext().getNext().getBefore().getData());
	      
	   }

}















