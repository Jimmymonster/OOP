import java.util.*;
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
