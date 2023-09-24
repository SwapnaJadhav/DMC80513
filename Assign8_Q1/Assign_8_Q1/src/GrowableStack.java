
public class GrowableStack implements Stack
{
	private Employee[] arr;
	private int top;

	public GrowableStack() {
		// Initialize the array to store the employees
		// we use the array as a stack
		arr = new Employee[STACK_SIZE];
		top = -1;
	}

	public Employee pop() 
	{
		if (top == -1) 
		{
			throw new StackException("Stack is Underflow");
		}
		Employee e = arr[top];
		arr[top] = null;
		top = top -1;
		return e;
	}

	public void push(Employee e) 
	{
		if(top == arr.length-1) 
		{
			Employee[] tmp = new Employee[arr.length*2];
			for(int i = 0; i < arr.length; i++) 
			{
				tmp[i] = arr[i];
			}
			arr = tmp;
		}
		top = top + 1;
		arr[top] = e;
	}

}// end of class GrowableStack
