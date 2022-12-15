package homework;

import java.io.FileNotFoundException;


public class Student implements Comparable{
public int id;
public String name;
public int mathGrade;
public int dataGrade;
public int average=(mathGrade+dataGrade)/2;



    public Student(int id, String name, int mathGrade, int dataGrade) {
        this.id = id;
        this.name = name;
        this.mathGrade = mathGrade;
        this.dataGrade = dataGrade;
    }





    @Override
    public int compareTo(Object o) {
        Student s=((Student)o);
        if(this.dataGrade==((Student) o).dataGrade){
            return 0;
        }else if(this.dataGrade>((Student) o).dataGrade){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return(id+" "+name+" "+mathGrade+" "+dataGrade);
    }
}
