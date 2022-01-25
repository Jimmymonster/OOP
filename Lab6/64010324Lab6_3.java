import java.util.*;
class Queue{
    private int Size=8;
    private int[] element;
    private int front;
    private int it=0;
    Queue(){
        element=new int[Size];
        front=0;
    }
    Queue(int size){
        Size=size;
        element=new int[size];
        front=0;
    }
    public void enqueue(int v){
        if(it==Size){
            System.out.println("Queue is full");
            return;
        }
        element[it++]=v;
    }
    public int dequeue(){
        if(it==0){
            System.out.print("Queue is empty");
            return -1;
        }
        else {
            int temp=element[0];
            for(int i=0;i<it;i++){
                element[i]=element[i+1];
            }
            it--;
            return temp;
        }
    }
    public boolean empty(){
        if(it==0)
            return true;
        else
            return false;
    }
    public int getSize(){
        return it;
    }
}
class Pro3{
    public static void main(String args[]){
        Queue q=new Queue(30);
        for(int i=1;i<=20;i++){
            q.enqueue(i);
        }
        for(int i=0;i<20;i++){
            System.out.println(q.dequeue());
        }
    }
}
