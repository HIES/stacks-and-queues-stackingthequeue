import java.util.NoSuchElementException;

public class Queue<E>
{
	private Object[] queue;

	public Queue()
	{
		queue = new Object[0];
	}

	public int size()
	{return queue.length;}

	public boolean isEmpty()
	{
	    if (queue.length > 0) {
            return false;
        }
	    return true;
	}

	public void enqueue(E item)
	{
        Object [] newQueue = new Object[queue.length+1];
        newQueue[newQueue.length - 1] = (Object)item;
        queue = newQueue;
    }

	public E dequeue()
	{
	    if(queue.length == 0) {
            throw new NoSuchElementException();
        }
		Object [] newQueue = new Object[queue.length - 1];
        Object out = queue[0];

		for (int i = 0; i < queue.length - 1 ; i++)
		{
            newQueue[i] = queue[i + 1];
		}
		queue = newQueue;
		return (E)(out);
	}

	public E peek()
	{
        if(queue.length == 0) {
            throw new NoSuchElementException();
        }
        else {
            return (E) (queue[0]);
        }
	}

}
