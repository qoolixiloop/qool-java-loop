package ch13;

public class Node<T> {

	private T info;
	private Node<T> left;
	private Node<T> right;

	public Node(T i) {
		this(i, null, null);
	}

	public Node(T i, Node<T> l, Node<T> r) {
		info = i;
		left = l;
		right = r;
	}

	public T getInfo()     		{
		return info;
	}
	public Node<T> getLeft()    	{
		return left;
	}
	public Node<T> getRight()   	{
		return right;
	}
	public void setInfo(T i) {
		this.info = i;
	}

	public void setLeft(Node<T> l)	{
		this.left = l;
	}
	public void setRight(Node<T> r)	{
		this.right = r;
	}


}

