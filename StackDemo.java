import java.util.*;

class StackDemo
{
	public static int capacity;
	public static final int CAPACITY=16;
	public static int top=-1;
    public static int[] stack;


public StackDemo()
{
this(CAPACITY);

}


public StackDemo(int cap)
{

this.capacity=cap;
stack= new int[capacity];
}


public static int size()
{
return top+1;

}

public static boolean empty()
{
	boolean bool;
	if(top<0)
	bool=true;
	else
	bool= false;
return bool;
}

public static void expand()
{
    int len=size();
    int[] temp=new int[len*2];
    System.arraycopy(stack,0,temp,0,len);
      stack=temp;
} 

public static int shrink()
{
int len=size();
int element=stack[len-1];
int[] temp=new int [len-1];
System.arraycopy(stack,0,temp,0,len-1);
top--;
return element;
}

public void push(int data)
{
  if(size()==capacity)
    expand();
stack[++top]=data;
}

public int pop() throws Exception
{
 int element=0;
if(empty())
{
	throw new Exception("stack underflow");
	
}
else
element=shrink();

return element;

}

public void printele()
{
for(int i=0;i<size();i++)
{
	System.out.print(stack[i]+" ");
}

}

public static void main(String[] args) {
StackDemo s=new StackDemo();

s.push(2);
s.push(3);
s.push(4);
s.push(5);
s.push(6);
s.push(7);
s.printele();
try{
s.pop();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
System.out.println("after removing");
s.printele();
System.out.println("\n"+top);
}

}