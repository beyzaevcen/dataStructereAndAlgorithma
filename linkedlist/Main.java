package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();


        myLinkedList.append(5);
        myLinkedList.append(6);

        myLinkedList.prepend(8);
        myLinkedList.insert(2,7);
       // myLinkedList.set(1,9);
        myLinkedList.printList();
        System.out.println("after reverse");
        myLinkedList.reverse();
        myLinkedList.printList();
        //System.out.println(myLinkedList.get(1).value);





    }

}


