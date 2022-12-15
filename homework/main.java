package homework;

import java.io.FileNotFoundException;
import java.io.IOException;

public class main{
    public static void main(String[] args) throws IOException {
        DoublyLinkedList<Student> list=new DoublyLinkedList<Student>();
        list=list.readFile("homework/students.txt");
        list.studentCount(list);
    }
}