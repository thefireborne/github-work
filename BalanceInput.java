import java.util.*;

class BalanceInput
{
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
			Stack<Character> stk=new Stack<>();
            //Complete the code
            if(input==null||input.length()==0)
                  return;
            for(int i=0;i<input.length();i++)
            {
                
                if(input.charAt(i)==')')
                {
                    if(stk.empty()==false&&stk.peek()=='(')
                        stk.pop();
                    else
                    	{   stk.push(')');
                       break;
                    }
                }
                else if(input.charAt(i)==']')
                {
                    if(stk.empty()==false&&stk.peek()=='[')
                        stk.pop();
                    else
                    	{   stk.push(']');
                        break;
                    }
                    
                }
                else if(input.charAt(i)=='}')
                {
                    if(stk.empty()==false&&stk.peek()=='{')
                        stk.pop();
                    else
                    	{  stk.push('}');
                        break ;
                    }
                    
                }
                else
                    stk.push(input.charAt(i));
                
                
            }
            if(stk.empty()==true)
                System.out.println("true");
            else
            System.out.println("false");
		}
		
	}
}