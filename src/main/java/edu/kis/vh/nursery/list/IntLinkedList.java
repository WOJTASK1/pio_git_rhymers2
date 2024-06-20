package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;
    // TODO: delete unused 'i' field
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }
    // TODO: unused method and always returns false, add implementation?
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }


        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }


    }
}
