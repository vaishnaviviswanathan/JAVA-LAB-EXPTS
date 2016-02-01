import java.util.LinkedList;
import java.util.Scanner;


public class linkdlist implements Stack{
 LinkedList<Integer>i=new LinkedList<Integer>();
	public linkdlist() {
		// TODO Auto-generated constructor stub
	}
    public void push(int k){
    	i.add(k);
    }
    public int pop(){
    	return (i.remove(i.size()-1));
    }
    public int peek(){
    	return (i.get(i.size()-1));
    }
    public int isempty(){
    	int k=i.size();
    	if(k>1)return 1;
    	else return 0;
    }
    public int isfull(){
    	System.out.println("\nInvalid Option");
    	return 0;
    }
    public void display(){
    	for(Integer k:i)
    		System.out.println("\n"+k);
    }
	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int ch,d,k;
	      linkdlist a=new linkdlist();
	      Scanner in=new Scanner(System.in);
	      do{
	      System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Isfull\n5.Isempty\n6.Display\nYour choice:");
	      ch=in.nextInt();
	      switch(ch){
	      case 1:System.out.println("\nEnter the element to be pushed:");
	          k=in.nextInt();
	    	 if(isfull()) a.push(k);
                                     else System.out.println("\nStack overflow"); break;
	      case 2:if(isempty())k=a.pop();
	      System.out.println("\nElement popped out is:"+k);
                        else System.out.println("\nStack underflow"); break;
	      case 3:k=a.peek();
	      System.out.println("\nElement on top of the stack is:"+k);
	      break;
	      case 4:k=a.isfull();
	      break;
	      case 5: k=a.isempty();
	      if(k==1)System.out.println("\nStack is not empty");
	      else System.out.println("\nStack is empty");
	      break;
	      case 6:a.display();
	      }
	      System.out.println("\nDo you want to continue(0/1):");
	      d=in.nextInt();
		}while(d==1);
	}

}
