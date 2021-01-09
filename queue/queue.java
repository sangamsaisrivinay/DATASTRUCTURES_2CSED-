                        //NORMAL QUEUE IMPLEMMENTATION

//front =0 and rear =0
//if we do insertions rear is incremented
//if we do deletions front is incremented
//once if front and rear reaches max of the queue they cannot be resumed to 0th position
//queuefull=queue overflow      condition:rear==max
//queueempty =queue underflow   condition:front==rear==max or front==rear==0

class queueoperations{
    final int max=4;
    int queue[]=new int[max];
    int front=0,rear=0;
    //enqueue
    public void enqueue(int e){
        if(isQueueFull()){System.out.println("Queue overflow!!");
        return;}
        else{
            queue[rear++]=e;
            System.out.println(e+"added in queue");
        }
    }
    //dequeue
    public int dequeue(){
        if(isQueueEmpty()){
            System.out.println("Queue under flow!!");
            return -1;
        }
        else{
            int temp=queue[front++];
            System.out.println(temp+"popped");
            return temp;
        }
    }
    //isQueueEmpty
    public boolean isQueueEmpty(){
        if(front==rear)
            return true;
        return false;
    }
    //isQueueFull
    public boolean isQueueFull(){
        if(rear==max)
            return true;
        return false;
    }
    //viewqueue
    public void viewQueue(){
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]);
        }
    }
}
public class queue{
    public static void main(String args[]){
        queueoperations obj=new queueoperations();
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.enqueue(3);
    }
}
