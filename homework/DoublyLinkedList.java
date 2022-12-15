package homework;

import java.io.*;
import java.util.Scanner;

public class DoublyLinkedList<T extends Comparable>  {
    DNode<T> head;



   public DoublyLinkedList<Student> readFile(String path) throws FileNotFoundException {
        DoublyLinkedList<Student> list=new DoublyLinkedList<Student>();
        File myFile= new File(path);
        Scanner  myScanner = new Scanner(myFile);
       String data = null;

        while (myScanner.hasNextLine()) {
            data = myScanner.nextLine();
            String tempList[] = data.split(" ");
            Student student = new Student(Integer.parseInt(tempList[0]), tempList[1], Integer.parseInt(tempList[2]), Integer.parseInt(tempList[3]));
            list.addToEnd(student);
        }
        myScanner.close();
        return list;
    }

    public String studentsLowestDataGrade(DoublyLinkedList<Student> list){
        if(head==null){
            return  null;
        }
        DNode<Student> iterator=list.head;
        Student min=list.head.value;

        while(iterator!=null){
            if(iterator.value.compareTo(min)==-1){
                min=iterator.value;
            }
            iterator=iterator.next;
        }
        return min.name;
    }

    public String sortByDataGrades(DoublyLinkedList<Student> list){
       DNode<Student> iterator;
       DNode<Student> m=null;
       int f;
       if (head==null) return null;
       do{
           f=0;
           iterator=list.head;
           while (iterator.next!=m){
               if(iterator.value.dataGrade>iterator.next.value.dataGrade){
                   int temp=iterator.value.dataGrade;
                   iterator.value.dataGrade=iterator.next.value.dataGrade;
                   iterator.next.value.dataGrade=temp;
                   f=1;
               }
               iterator=iterator.next;
           }
           m=iterator;

       }while (f!=0);
return iterator.value.name;

    }

    

    public void sortByOverralAvarage(DoublyLinkedList<Student> list){
        DNode<Student> iterator;
        DNode<Student> m=null;
        int f;
        if (head==null) return;
        do{
            f=0;
            iterator=list.head;
            while (iterator.next!=m){
                if(iterator.value.average>iterator.next.value.average){
                    int temp=iterator.value.average;
                    iterator.value.average=iterator.next.value.average;
                    iterator.next.value.average=temp;
                    f=1;
                }
                iterator=iterator.next;
            }
            m=iterator;

        }while (f!=0);

       /*
        DNode<Student> iterator=list.head;
        DNode<Student> m=null;

        while(iterator!=null){
            if(iterator.value.average<iterator.next.value.average){
                m=iterator;
                iterator=iterator.next;
                iterator.next=m;
            }else if(iterator.value.average>iterator.next.value.average){
                iterator=iterator.next;
            }
            System.out.println(iterator);
            iterator=iterator.next;
        }

        */



    }



    public DoublyLinkedList<Student> addNewStudent(DoublyLinkedList<Student> list,int id,String name,int mathGrade,int dataGrade) {
       Student newStudent=new Student(id,name,mathGrade,dataGrade);
       list.addToEnd(newStudent);
       return list;
    }


    public void studentCount(DoublyLinkedList<Student> list){
       int count=0;
       if (list.head==null){
           return;
       }
       while (list.head!=null){
           count++;
           list.head=list.head.next;
       }
        System.out.println(String.valueOf((int) count));

    }

    public double mathAvarage() throws FileNotFoundException {
        DoublyLinkedList<Student> myList=new DoublyLinkedList<Student>();
        myList=myList.readFile("homework/students.txt");
        int mathScore=0;
        int studentCount=0;
        double mathAvarege=0;
        while (myList.head!=null){
            mathScore+=myList.head.value.mathGrade;
            studentCount++;
            mathAvarege=(mathScore/studentCount);
            myList.head=myList.head.next;
        }

        return mathAvarege;


    }

    public double DataAvarage() throws FileNotFoundException {
        DoublyLinkedList<Student> myList=new DoublyLinkedList<Student>();
        myList=myList.readFile("homework/students.txt");
        int dataScore=0;
        int studentCount=0;
        double dataAvarage=0;
        while (myList.head!=null){
            dataScore+=myList.head.value.dataGrade;
            studentCount++;
            myList.head=myList.head.next;
        }
        dataAvarage=(dataScore/studentCount);

        return dataAvarage;
    }







    public void addToFront(T val){
        DNode<T> newNode =new DNode<>(val);
        if(head==null){
            head=newNode;

        }else{
            newNode.next=head;
            head=newNode;
            head.next.prev=head;
        }
    }


    public void addToEnd(T val){
        DNode<T> newNode =new DNode<>(val);
        if(head==null) head = newNode;
        else{
            DNode iterator=head;
            while (iterator.next!=null){
                iterator=iterator.next;
            }
            iterator.next=newNode;
            newNode.prev=iterator;
        }
    }






    public void delete(T val){
        if(head==null)
            return;
        if(head.value.compareTo(val)==0){
            head=head.next;
            if(head!=null)
                head.prev=null;
            return;
        }
        DNode<T> iterator = head.next;
        while(iterator!=null){
            if(iterator.value.compareTo(val) == 0){
                iterator.prev.next = iterator.next;
                if(iterator.next != null)
                    iterator.next.prev = iterator.prev;
                break;
            }
            iterator = iterator.next;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("empty list");
        }else {
            DNode<T> iterator = head;
            while (iterator != null) {
                System.out.println(iterator.value);
                iterator = iterator.next;
            }
        }

    }




    public boolean search(T a) {
        if(head==null){
            return false;
        }
        DNode<T> iterator=head;
        while (iterator!=null){
            if(iterator.value.compareTo(a)==0){
                return true;
            }
            iterator=iterator.next;
        }
        return false;
    }

}
