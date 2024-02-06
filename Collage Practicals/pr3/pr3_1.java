class stack{
    int top=-1;
    int[] arr;
    int capacity;

    stack(int s,int[] temp)
    {
        capacity=s;
        arr = new int[capacity];
        for(int i=0;i<temp.length;i++)
        {
            arr[i]=temp[i];
            top++;
        }
    }

    void output()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
        }
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    boolean isEmpty() {
        return (top == -1);
    }

    boolean isFull() {
        return (top == capacity - 1);
    }

    int pop()
    {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            int result=arr[top];
            // arr[top]=0;
            top--;
            return result;
        }
    }
    
    void push(int value)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow");
        }
        else
        {

            top++;
            arr[top]=value;
        }
    }
    
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            return arr[top];
        }
    }
};

class pr3_1{
    public static void main(String[] args) {
        // int[] temp={1,2,3,4,5};
        stack s1 =  new stack(8,new int[]{1,2,3,4});
        s1.output();
        
        System.out.println("After push 7:");
        s1.push(7);
        s1.output();
        
        int pop=s1.pop();
        System.out.println("After pop removed element : "+pop);
        s1.output();
        
        int peek=s1.peek();
        System.out.println("peek element = "+peek);
    }
}