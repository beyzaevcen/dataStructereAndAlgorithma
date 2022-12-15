package firstHomework;

public class Stack {

    private int top;
    private int[] items;
    public Stack(int size){
        this.items=new int[size];
        this.top=-1;

    }
    public boolean isEmpty(){
        return this.top==-1;
    }
    public boolean isFull(){
        return this.top==this.items.length-1;
    }
    public int count(){
        return this.top+1;
    }
    public int size(){
        return this.items.length;
    }
    public int peek(){
        return this.items[this.top];
    }
    public void push(int val){
        if(isFull()){
            System.out.println("stack is full");
        }else{
            this.top++;
            this.items[this.top]=val;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }else{
            this.top--;
            return this.items[this.top+1];
        }
    }
    public void display() {
        if (isEmpty())
            System.out.println("stack is empty");
        else {
            for (int i = this.top; i >= 0; i--) {
                System.out.println(this.items[i]);
            }
        }

    }






























/*
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }
    public firstHomework.Stack(int value){
        Node newNode=new Node(value);
        top=newNode;
        height=1;

    }
    public void printStack(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: "+top.value);
    }
    public void getHeight(){
        System.out.println("Height: "+height);
    }

    public void push(int value){
        Node newNode=new Node(value);
        if(height==0){
            top=newNode;
        }else{
            newNode.next=top;
            top=newNode;
        }
        height++;
    }
    public Node pop() {
        if (height == 0) {
            return null;
        }

        Node temp = top;
        top = temp.next;
        temp = null;

        height--;
        return temp;
    }
    */




}
