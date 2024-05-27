package at.htlleonding.generics;

import java.util.Stack;

public class CustomStack<T> {

    private Node<T> top;

    public CustomStack() {
    }


    //Stack<String> x;

    public T push(T element) {
        Node<T> n = new Node<>(top, element);
        top = n;
        return top.getData();
    }

    ;

    public T pop() {

//        if(top == null){
//            throw new RuntimeException("Stack is empty");
//        }

        if (top == null) {
            return null;
        }

        Node<T> topElement = top;
        top = top.getNext();

        return topElement.getData();

    }

}
