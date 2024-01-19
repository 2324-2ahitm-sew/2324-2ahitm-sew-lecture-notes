package at.htlleonding.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void push() {
        Stack mystack = new Stack();

        mystack.push("Winkelgasse");
        System.out.println();
    }

    @Test
    void pushUnderlineWithTwoElements() {
        Stack mystack = new Stack();
        mystack.push("Winkelgasse");
        mystack.push("David");
        System.out.println();
    }

    @Test
    void popwiththreeelements() {
        Stack mystack = new Stack();
        mystack.push("Winkelgasse");
        mystack.push("David");
        mystack.push("Eldin");
        String name = mystack.pop().toString();
        System.out.println(name);
    }

    @Test
    void peekwithThreeElements() {
        Stack mystack = new Stack();
        mystack.push("Winkelgasse");
        mystack.push("David");
        mystack.push("Eldin");
        String name = mystack.peek().toString();
        System.out.println(name);
    }

    @Test
    void poponaEmptyStack() {
        Stack mystack = new Stack();
        mystack.pop();

    }
}