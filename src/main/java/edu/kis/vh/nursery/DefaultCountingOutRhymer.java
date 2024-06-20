package edu.kis.vh.nursery;

/**
 * The type DefaultCountingOutRhymer represents simple stack
 */
public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int EMPTY_VALUE = -1;
    private final int[] numbers = new int[MAX_SIZE];

    public int total = EMPTY_VALUE;


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
        return total == EMPTY_VALUE;
    }
    /**
     * Checks if the stack is full.
     *
     * @return true if the stack is full, false otherwise
     */
    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }
    /**
     * Returns top value of the stack.
     *
     * @return value at the top of stack - if stack is empty returns EMPTY_VALUE
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_VALUE;
        return numbers[total];
    }
    /**
     * Removes and returns the value at the top of the stack.
     *
     * @return value at the top of stack - if stack is empty returns EMPTY_VALUE
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_VALUE;
        return numbers[total--];
    }

}
