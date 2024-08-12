package org.example;

class Stack<T> {
    private Node<T> top;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null) throw new IllegalStateException("Stack is empty");
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if (top == null) throw new IllegalStateException("Stack is empty");
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node<T> current = top;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
