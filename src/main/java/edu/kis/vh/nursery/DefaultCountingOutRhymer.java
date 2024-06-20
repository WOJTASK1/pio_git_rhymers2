package edu.kis.vh.nursery;

/**
 * The type DefaultCountingOutRhymer represents simple stack
 */
public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];


    private int total = -1;
    /**
     * Adds a number to the stack if it is not full.
     *
     * @param in - number to be added
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean callCheck() {
        return total == -1;
    }
    /**
     * Checks if the stack is full.
     *
     * @return true if the stack is full, false otherwise
     */
    public boolean isFull() {
        return total == 11;
    }
    /**
     * Returns top value of the stack.
     *
     * @return value at the top of stack - if stack is empty returns EMPTY_VALUE
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }
    /**
     * Removes and returns the value at the top of the stack.
     *
     * @return value at the top of stack - if stack is empty returns EMPTY_VALUE
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
