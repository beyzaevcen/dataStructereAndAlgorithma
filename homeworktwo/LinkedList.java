package homeworktwo;

import linkedlist.Node;

public class LinkedList <T extends Comparable>{

    //Firstly I did readMyFile method like this.But It also reads numbers with copies.
    //So I write the method in the main.

    /*
 public LinkedList readMyFile(String value, LinkedList<String> list) throws FileNotFoundException{
     File myFile =new File(value);
     Scanner myScanner=new Scanner(myFile);
     myScanner.useDelimiter(",");
     while(myScanner.hasNext()){
         list.addToEnd(myScanner.next());
     }
     myScanner.close();

     return null;
 }

     */
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
    /*
    public void searchValuesInLinkedList() throws FileNotFoundException {
        long beginTime = 0, endTime = 0;
        beginTime = System.nanoTime();
        //read the txt file
        Scanner sc = new Scanner(new File("Search.txt")); //read the txt file
        sc.useDelimiter(",");   //sets the delimiter pattern
        int nodeCounter = 0;
        double total = 0;
        int searchTxtCounter = 0;
        while (sc.hasNext()){  //returns a boolean value
            searchTxtCounter++;
            T value = (T) sc.next();
            if ((nodeCounter = this.search(value)) != 0) {
                total += nodeCounter;
                //System.out.println("Bu eleman(" + value + ") linkedListte var!");
            }else{
                total += this.getCount();
            }

        }
        sc.close();  //closes the scanner
        //System.out.println(total + " kere node'lara erişim sağlandı!");
        double average = total / searchTxtCounter;
        System.out.println("Total Number Of Memory Access(es) : " + ((int) total));
        System.out.println("Average Number Of Memory Access(es) : " + average);

        endTime = System.nanoTime();
        System.out.println("Çalışma Süresi : " + ((double) (endTime - beginTime)) / 1000000000);
    }
*/



}



