public class SmiritiQueue
{
    int size=5;
    int[]arr=new int [size];
    int front=0;
    int rear=-1;
    public void enqueue(int data)
    {
        if(rear==size-1)
        {
            System.out.println("queue is full");
        }
        else
        {
            rear++;
            arr[rear]=data;
        }
    }
    public boolean isempty()
    {
        if(front<0||front>rear)
            return true;
        else
            return false;
    }
    public int dequeue()
    {
        int data;
        if(!isempty())
        {
            data=arr[front];
            front++;
            return data;
        }
        else
        {
            System.out.println("empty");
        }
        return 0;
    }
    public void display()
    {
        if(isempty())
            System.out.println("queue is empty");
        else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main (String[]args)
    {
        SmiritiQueue q = new SmiritiQueue();
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.dequeue();
        q.display();
        
    }
}