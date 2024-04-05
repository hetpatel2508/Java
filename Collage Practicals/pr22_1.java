interface stack{
    abstract void push(int num);
    void pop();
    void display();
}

class DynamicStack implements stack{
    int[] memory;
    int top=-1;

    DynamicStack(int size){
        memory = new int[size];
    }

    @Override
    public void pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return;
        }
        memory[top--]=0;
        display();
    }

    @Override
    public void push(int num) {
            if(top==memory.length-1){
                int[] temp = new int[memory.length*2];
                for(int i=0;i<memory.length;i++){
                    temp[i]=memory[i];
                }
                memory=temp;
            }        
            memory[++top]=num;
            display();
    }

    @Override
    public void display(){
        if(top<0){
            System.out.println("Stack Underflow");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(memory[i]);
        }
        System.out.println("\n");
    }
}

public class pr22_1 {
    public static void main(String[] args) {
        DynamicStack obj = new DynamicStack(5);

        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);

        obj.push(11);
        obj.push(12);

        obj.pop();
        obj.pop();
    }    
}
