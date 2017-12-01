import java.util.NoSuchElementException;

public class Queue<E>
{
	private Object[] queue;
	private int firstIndex;
	private int lastIndex;
	private int size;

	public Queue()
	{
		queue = new Object[size+50];
	}

	public int size()
	{
		int counter = 0;
		for (Object o : queue) {
			if(o != null)
				counter++;
		}
		size = counter;
		return size;
	}

	public boolean isEmpty()
	{
		boolean empty = true;
		for(int i = 0; i < queue.length; i++){
			if(queue[i] != null)
				empty = false;
		}
		return empty;
	}

	public void enqueue(E item)
	{
		queue[size+1] = item;
		size++;

	}

	public E dequeue() throws NoSuchElementException
	{
		if(!isEmpty()) {
			int index = 0;
			while (queue[index] == null)
				index++;

			Object returnItem = queue[index];
			queue[index] = null;

			return (E) returnItem;
		}

		else
			throw new NoSuchElementException();

	}

	public E peek() throws NoSuchElementException
	{
		if(!isEmpty()) {
			int index = 0;
			while (queue[index] == null)
				index++;

			return (E) queue[index];
		}
		else
			throw new NoSuchElementException();
	}

}
