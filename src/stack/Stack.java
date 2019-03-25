package stack;

import java.util.ArrayList;

public class Stack<T> {
    int top;
    T[] arr;
    public Stack(){
        top=-1;
        arr=(T[]) new Object[Integer.MAX_VALUE/4];
    }

    public void push(T i){
        arr[++top]=i;
    }
    public T peek(){
        return arr[top];
    }

    public T pop(){
        return arr[top--];
    }
    public boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }
    public void printAll(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        for(int i=0;i<top;i++){
            System.out.println(arr[i]);
        }
    }
}
