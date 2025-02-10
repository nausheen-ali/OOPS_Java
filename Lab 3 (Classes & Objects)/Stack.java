class Stack {
    int stackarr[];
    int tos;
    Stack(int size){
        stackarr=new int[size];
        tos=-1;
    }
    void push(int value){
        if (tos==stackarr.length-1)
            System.out.println("Stack overflow");
        else 
            stackarr[++tos]=value;
    }
    int pop(){
        if (tos==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        else   
            return stackarr[tos--];
    }
    void display(){
        if (tos==-1)
            System.out.println("Stack is empty");
        else{
            for (int i=tos; i>=0; i--){
                System.out.println(stackarr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Stack cat = new Stack(5);
        cat.push(10);
        cat.push(20);
        cat.push(30);
        cat.push(40);
        cat.push(50);
        cat.push(60);
        cat.display();
        cat.pop();
        cat.display();
    }
}
