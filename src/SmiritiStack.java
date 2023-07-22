
public class SmiritiStack {
    int maxsize=5;
    int  top=-1;
    int[]arr=new int [5];
    
    public boolean isfull()
    {
        if(top==maxsize-1)
            return true;
        else
            return false;
    }
    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
        public void push (int number)
        {
            if(isfull()==true)
            {
                System.out.println("stack overflow");
            }
            else
            {
                top++;
                arr[top]=number;
            }
        }
        public void pop()
        {
            if(isEmpty()==true)
                System.out.println("stack underflow");
                        else
            {
                System.out.println("deleted item:"+arr[top]);
                        top--;
            }
        }
        public void show()
            {
                int i;
                if(top==-1)
                {
                    System.out.println("stack empty");
                }
                else
                {
                    System.out.println("elements in stack:");
                            for(i=0;i<=top;i++)
                            {
                                System.out.println(arr[i]+"");
                            }
                            System.out.println("");
                }
            }
        
        public static void main(String[] args){
               SmiritiStack myStack = new SmiritiStack();
               myStack.push(10);
               myStack.push(20);  
               myStack.pop();
               myStack.show();
           }

}
