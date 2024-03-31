 class InnerQueueDemo {
    int front = -1;
    int rear = -1;
    int queue[];
    int size;

    InnerQueueDemo(int size){
        this.size = size;
        queue = new int[size];
    }
    
    public void add(int ele){
        if(rear >= size-1){
            System.out.println("OverFlow...!");
            return;
        }
        else if(rear == -1 && front == -1){
            rear = front = 0;
            queue[rear] = ele;
        }
        else{
            rear++;
            queue[rear] = ele;
            
        }
    }

    public void remove(){
        if(rear == -1 && front == -1)
        {
            System.out.println("UnderFlow....!");
            return;
        }
        else if(rear == front){
            int ele = queue[front];
            rear = front = -1;
            System.out.println("Deleted Element is ="+ele);
        }
        else{
            int ele = queue[front];
            front++;
            System.out.println("Deleted Element is ="+ele);
        }
    }

    public void peek(){
        if(rear == -1 && front == -1)
        {
            System.out.println("UnderFlow....!");
            return;
        }
        System.out.println("The Front of The Queue Element is :"+queue[front]);
    }

    public void display(){
        if(rear == -1 && front == -1)
        {
            System.out.println("UnderFlow....!");
            return;
        }
        System.out.print("Queue :");
        for(int i=front;i<=rear;++i){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        InnerQueueDemo obj = new InnerQueueDemo(5);
        obj.remove();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(3);
        obj.display();
        obj.peek();
        obj.remove();
        obj.display();
        obj.peek();
    }    
}
