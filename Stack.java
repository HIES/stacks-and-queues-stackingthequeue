import javax.swing.plaf.BorderUIResource;
import java.util.EmptyStackException;

public class Stack<E>
{
	private Node top;
	private int size;

	private class Node {
		private E data;
		private Node next;
		private Node prev;

		public Node(E input){
			data = input;
			next = null;
			prev = null;
		}
}


	public Stack()
	{
		top = null;
	}

	public void push(E item)
	{
		Node holdItem = new Node(item);
		if(size == 0){
			top = holdItem;
		}

		else{
			holdItem.prev = top;
			top.next = holdItem;
			top = holdItem;
		}
		size++;
	}

	public E pop() throws EmptyStackException
	{
		Node saveNode = top;
		if(size > 1){
			top = saveNode.prev;
			saveNode.prev = null;
			size--;
			return saveNode.data;
		}

		else if(size == 1){
			top = null;
			size--;
			return saveNode.data;
		}

		else {
			throw new EmptyStackException();
		}

	}

	public E peek() throws EmptyStackException
	{
		if(size > 0)
		return top.data;

		else
			throw new EmptyStackException();
	}

	public boolean isEmpty()
	{
		if(top == null)
			return true;
		else
			return false;
	}

	public int size()
	{
		return size;
	}
}
