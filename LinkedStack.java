
class Node 
{
  Node next;
  public int data;
  Node(int data)
  {
    this.data=data;

  }

}


class LinkedStack
{
	Node head;
    int length;
    public void push(int data)
    {
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
    }

    public int pop() throws Exception
    {
    	int data=0;
       if(head==null)
          throw new Exception("stack underflow");
       else
       {
       	data=head.data;
         head=head.next;
         length--;
       }

    return data;
    }

    public boolean empty()
    {
      if(head==null)
       return true;
     else
     	return false;

    }

    public int peek()
    {
    	return head.data;
    }
     
    public int search(int data)
    {
       int count=1;
       Node temp=head;
       while(temp.data!=data)
       {
       	temp=temp.next;
       	count++;
       }
     return count;
    }

    public String toString()
    {
        Node temp=head;
        String s="[";
           while(temp.next!=null)
           {
            s=s+temp.data+",";
            temp=temp.next;
           }
         s=s+temp.data+"]";
     return s;
    }
public static void main(String[] args) {
	LinkedStack ls=new LinkedStack();
    ls.push(1);
    ls.push(2);
    ls.push(3);
    ls.push(4);
    ls.push(5);
    System.out.println(ls);
    try{
    System.out.println("after popping "+ls.pop());
      }
      catch(Exception e)
      {
      	System.out.println(e.getMessage());
      }
    
    System.out.println(ls);
    System.out.println(ls.empty());
    System.out.println("offset: "+ls.search(4));
	
}


}