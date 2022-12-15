package firstHomework;

import firstHomework.Stack;

public class StackOperations {


        public Stack removeMin(Stack stack) {
            Stack tempStack = new Stack(stack.size());
            int minVal = stack.peek();
            while (!stack.isEmpty()) {
                if (stack.size() > 0 && stack.peek() < minVal) {
                    minVal = stack.peek();
                }
                int top = stack.peek();
                stack.pop();
                tempStack.push(top);
            }
            while (!tempStack.isEmpty()) {

                if (tempStack.peek() != minVal) {
                    int tempVal = tempStack.peek();
                    stack.push(tempVal);

                }

                tempStack.pop();
            }

            return stack;
        }

        }



