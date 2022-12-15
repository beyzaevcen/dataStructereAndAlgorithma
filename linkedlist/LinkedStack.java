package linkedlist;

public class LinkedStack<T extends Comparable> {
    Node<T> top;
    //private int[] items;

    public boolean isEmpty(){
        return this.top==null;
    }
    public void push(T val){
        Node<T> NewNode =new Node<T>(val);
        if(top==null){
            top=NewNode;
        }else{
            NewNode.next=top;
            top=NewNode;

        }
    }
    public T peek(){
        if(isEmpty()){
            return null;
        }
        return (T) top;
    }

    public T pop(){
        if (isEmpty()) {
            return null;
        }
        T temp=top.value;
        top=top.next;
        return temp;
    }

    public void display(){
        if (top != null) {


            while (top.next != null) {
                top = top.next;
                System.out.println(top);
            }
        }else
            System.out.println("Empty list");
    }

    public int count(){
        if(isEmpty()){
            return 0;
        }
       int a=0;
        while(top.next!=null){
            a++;
        }
        return a;
    }





}
