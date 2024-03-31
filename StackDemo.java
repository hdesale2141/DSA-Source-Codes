class StackOperation{
    int cnt = -1;
    int size;
    int[] stack;
    
    StackOperation(int size)
    {
        this.size = size;
        stack = new int[size];
    }

    public void push(int ele)
    {
        if(cnt >= size-1) {
            System.out.println("OverFlow...!");
            return;
        }
        cnt++;
        stack[cnt] = ele;
        System.out.println("Element Added Succesfully...!");
    }

    public void pop()
    {
        if(cnt < 0){
            System.out.println("UnderFlow...!");
            return;
        }
        int ele = stack[cnt];
        System.out.println("Poped Element is = "+ele);
        cnt--;
    }

    public void peek()
    {
        if(cnt < 0){
            System.out.println("UnderFlow...!");
            return;
        } 
        System.out.println("The Top Most Element is ="+stack[cnt]);
    }

    public void display(){
        if(cnt < 0){
            System.out.println("UnderFlow...!");
            return;
        }
        for(int i=0;i<=cnt;++i){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
public class StackDemo {
    public static void main(String[] args) {
        // int n = 5;
        // int[] stack = new int[n];
        StackOperation obj = new StackOperation(5);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(3);
        obj.display();
        obj.pop();
        obj.display();
        obj.peek();
        // obj.pop(stack);
        // obj.pop(stack);
        // obj.pop(stack);

    }
    
}
