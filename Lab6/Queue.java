public class Queue {
    private int Size=8;
    private int[] element;
    private int it=0;
    //constructor
    Queue(){
        element=new int[Size];
    }
    Queue(int size){
        Size=size;
        element=new int[size];
    }
    //function
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
