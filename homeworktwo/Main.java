package homeworktwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        /*
        LinkedList list = new LinkedList();
        list.readMyFile("homework/data.txt",list);
        list.display();
        LinkedList newList=new LinkedList();
        newList.readMyFile("homework/search.txt",newList);

*/
        readFile();

        }

    static File myFile;
    static Scanner myScanner;
    static LinkedList<String> linkedList;


    private static void readFile() throws FileNotFoundException {
        myFile = new File("homeworktwo/data.txt");
        myScanner = new Scanner(myFile);
        linkedList = new LinkedList<>();

        while (myScanner.hasNextLine()) {
            String lines = myScanner.nextLine();
            String[] datas = lines.split(",");
            for(String a : datas) {
                if(!linkedList.search(a))
                    linkedList.addToEnd(a);
            }
        }
        linkedList.display();
    }

    }







