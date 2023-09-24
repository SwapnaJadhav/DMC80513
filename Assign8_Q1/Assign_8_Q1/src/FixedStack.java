
public class FixedStack implements Stack
{
	private Employee[] arr;
	private int top;

	public FixedStack() {
		// Initialize the array to store the employees
		// we use the array as a stack
		arr = new Employee[STACK_SIZE];
		top = -1;
	}

	public Employee pop() 
	{
		// TODO Auto-generated method stub

		if (top == -1) 
		{
			throw new StackException("Stack is Underflow");
		}
		Employee e = arr[top];
		arr[top]=null;
		top = top -1;
		return e;
	}

	public void push(Employee e) 
	{
		if(top == STACK_SIZE - 1) 
		{
			throw new StackException("Stack is Overflow");
		}
		top = top + 1;
		arr[top] = e;
	}

}

class StackException extends RuntimeException 
{
	public StackException(String s1)
	{
		super(s1);
	}

}//end of Class_FixedStack
