package homeworkfour;

import linkedlist.Node;

import java.io.FileNotFoundException;

public class LinkedList<T extends Comparable>{


    private Node<T> head;

    public Node<T> createNode(T val){
        return new Node<T>( val);
    }

    public T findMax() {
        if (head == null) {
            return null;
        }
        Node<T> iterator = head;
        T max = head.value;
        while (iterator != null) {
            if (iterator.value.compareTo(max) == 1) {
                max = iterator.value;
            }
            iterator = iterator.next;
        }
        return max;
    }

    public void addFront(T val){
        Node<T> newNode=createNode(val);
        newNode.next=head;
        head=newNode;
    }
    public void addRightAfterHead(T val){
        if(head==null){
            //addFront(val);
            head=createNode(val);
        }
        else{
            Node<T> newNode=createNode(val);//new Node(val);
            newNode.next=head.next;
            head.next=newNode;
        }
    }
    public boolean search(T val){
        if (head==null )
            return false;
        Node<T> iterator=head;
        while(iterator!=null){
            if (iterator.value.compareTo(val)==0)
                return true;
            iterator=iterator.next;
        }
        return false;
    }
    public boolean searchRecursive(T val, Node<T> tempHead){
        if( tempHead==null)
            return false;
        if(tempHead.value.compareTo(val)==0)
            return true;
        else{
            return searchRecursive(val, tempHead.next);
        }
    }
    public boolean searchRecursive(T val){
        return searchRecursive(val, head);
    }

    public void delete(T val){
        if(search(val)==false) {
            System.out.println("the value does not exist");
            return;
        }
        if(head.value.compareTo(val)==0){
            head=head.next;
        }
        Node<T> iterator=head,prev=head;
        while(iterator.value.compareTo(val)!=0){
            prev=iterator;
            iterator=iterator.next;
        }
        prev.next=iterator.next;
    }

    public void addToEnd(T val){
        if (head==null)
            addFront(val);
        else{
            Node<T> iterator=head;
            while(iterator.next!=null)
                iterator=iterator.next;
            iterator.next=createNode(val);

        }
    }

    public void display(){
        Node<T> iterator=head;
        while(iterator!=null){
            System.out.println(iterator);
            iterator=iterator.next;

        }
    }



        public void printList() {
            Node<Comparable> temp = (Node<Comparable>) head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    public int getCount()
    {
        Node <Comparable> temp = (Node<Comparable>)head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }
    public String get(int index){
        if(index<0||index>= getCount()){
            return "";
        }else{
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.toString();
        }
    }




}



