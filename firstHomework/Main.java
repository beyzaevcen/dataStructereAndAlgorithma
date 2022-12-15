package firstHomework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Stack mainStack=new Stack(4);
        Stack secondStack=new Stack(4);

        mainStack.push(2);
        mainStack.push(1);
        mainStack.push(8);
        mainStack.push(4);

        secondStack.push(11);
        secondStack.push(6);
        secondStack.push(9);
        secondStack.push(3);


       // firstHomework.StackOperations stackOperations=new firstHomework.StackOperations();
        // stackOperations.removeMin(mainStack).display();

         SortStack sortStack=new SortStack();
        sortStack.sortStacks(mainStack,secondStack).display();






















    }



}
