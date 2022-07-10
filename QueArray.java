public class QueArray <T> {
	 protected final int SIZE = 10; // default capacity
	  protected T[] elements;           // array that holds queue elements
	  protected int numElements = 0;    // number of elements in this queue
	  protected int front = 0;          // index of front of queue
	  protected int rear;               // index of rear of queue

	  public QueArray() 
	  {
	    elements = (T[]) new Object[SIZE];
	    rear = SIZE - 1;
	  }

	  public QueArray(int maxSize) 
	  {
	    elements = (T[]) new Object[maxSize];
	    rear = maxSize - 1;
	  }

	  public void enqueue(T element)
	  // Throws QueueOverflowException if this queue is full;
	  // otherwise, adds element to the rear of this queue.
	  {  
	    if (isFull())
	      System.out.println("Enqueue attempted on a full queue.");
	    else
	    {
	      rear = (rear + 1) % elements.length;
	      elements[rear] = element;
	      numElements = numElements + 1;
	    }
	  }

	  public T dequeue()
	  // Throws QueueUnderflowException if this queue is empty;
	  // otherwise, removes front element from this queue and returns it.
	  {   
	    if (isEmpty())
	    {
	    	System.out.println("Dequeue attempted on empty queue.");
	    	return null;
	    }
	    else
	    {
	      T toReturn = elements[front];
	      elements[front] = null;
	      front = (front + 1) % elements.length;
	      numElements = numElements - 1;
	      return toReturn;
	    }
	  }

	  public boolean isEmpty()
	  // Returns true if this queue is empty; otherwise, returns false.
	  {              
	    return (numElements == 0);
	  }

	  public boolean isFull()
	  // Returns true if this queue is full; otherwise, returns false.
	  {              
	    return (numElements == elements.length);
	  }
	  
	  public int size()
	  // Returns the number of elements in this queue.
	  {
	    return numElements;
	  }
	  
	  public void printQue() {
		  if (isEmpty())
			  System.out.println("Que is empty");
		  else {
			  int temp = front;
			  for(int i = 0; i < numElements; i++){
				  System.out.print( elements[temp] + "  ");
				  temp = (temp + 1) % elements.length;
			  }
		  }
		  System.out.println();
	  }
}
