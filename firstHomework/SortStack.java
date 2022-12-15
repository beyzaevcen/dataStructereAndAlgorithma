package firstHomework;

import javax.swing.table.AbstractTableModel;

public class SortStack {

    public Stack sortStacks(Stack stack1, Stack stack2) {
        Stack finalStack = new Stack(stack1.size() + stack2.size());
        while (!stack1.isEmpty()) {
            int top = stack1.peek();
            stack1.pop();
            finalStack.push(top);
        }
        while (!stack2.isEmpty()) {
            int top = stack2.peek();
            stack2.pop();
            finalStack.push(top);
        }

        Stack tempStack = new Stack(finalStack.size());
        while (!finalStack.isEmpty()) {
            int temp = finalStack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() < temp) {
                finalStack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;


    }
}








