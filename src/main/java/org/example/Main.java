package org.example;

public class Main
{

    public static void main(String[] args)
    {
        // Linked List
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.printList();

        linkedList.remove(10);
        linkedList.printList();

        System.out.println(linkedList.contains(5));

        // Stacks
        Stack<String> stack = new Stack<>();
        stack.push("Ipsum");
        stack.push("Dolor");
        stack.printStack();

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        // Queues
        Queue<Double> queue = new Queue<>();
        queue.enqueue(1.5);
        queue.enqueue(2.0);
        queue.enqueue(3.5);
        queue.printQueue();

        System.out.println(queue.dequeue());
        queue.printQueue();

        // Binary Search Trees
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        bst.inOrderTraversal();

        System.out.println(bst.search(60));
        System.out.println(bst.search(90));
    }
}
