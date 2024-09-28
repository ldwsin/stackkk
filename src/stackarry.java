public class stackarry {
    private int []stackarray;
    private int top;
    private int len;
    public stackarry(int size){
        stackarray=new int[size];
        len=size;
        top=-1;
    }

    void push(int k){
        if(isfull())
        {
            System.out.println("stack已满，无法push");
            return;
        }
         stackarray[++top]=k;
    }

    void pop(){
        if(isempty())
        {
            System.out.println("stack为空，无法pop");
            return;
        }
        else top--;
    }

    int view(){
        if(isempty())
        {
            System.out.println("stack 为空");
        }
       return stackarray[top];
    }

    boolean isfull(){
       return top==len-1;
    }
    boolean isempty(){
        if(top==-1)
            return true;
        else return false;
    }
    void vieww(){
        if(isempty())
        {
            System.out.println("栈为空");
            return ;
        }
        else
        System.out.println("当前栈顶为:"+view());
    }
    public static void  main(String[] args){
        stackarry stack=new stackarry(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.vieww();

        stack.pop();
        stack.pop();
        stack.vieww();
        stack.pop();

        stack.vieww();
        stack.push(100);
        stack.vieww();


    }
}
