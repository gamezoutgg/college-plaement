package programs;

import java.util.Scanner;

/**
 * Super Queue — an enhanced circular queue with operations at both ends.
 * Supports enqueue/dequeue from front and rear, peek, display, and size.
 */
public class SuperQueue {

    private int[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public SuperQueue(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getSize() {
        return size;
    }

    /** Add element at the rear of the queue. */
    public boolean enqueueRear(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        data[rear] = value;
        size++;
        return true;
    }

    /** Add element at the front of the queue. */
    public boolean enqueueFront(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            rear = 0;
            front = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }

        data[front] = value;
        size++;
        return true;
    }

    /** Remove and return element from the front. */
    public Integer dequeueFront() {
        if (isEmpty()) {
            return null;
        }

        int value = data[front];

        if (size == 1) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        return value;
    }

    /** Remove and return element from the rear. */
    public Integer dequeueRear() {
        if (isEmpty()) {
            return null;
        }

        int value = data[rear];

        if (size == 1) {
            front = -1;
            rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }

        size--;
        return value;
    }

    public Integer peekFront() {
        if (isEmpty()) {
            return null;
        }
        return data[front];
    }

    public Integer peekRear() {
        if (isEmpty()) {
            return null;
        }
        return data[rear];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Super Queue (front -> rear): ");
        int index = front;

        for (int i = 0; i < size; i++) {
            System.out.print(data[index]);
            if (i < size - 1) {
                System.out.print(" ");
            }
            index = (index + 1) % capacity;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SuperQueue queue = new SuperQueue(10);

        System.out.println("=== Super Queue Demo ===");
        System.out.println("Capacity: 10");

        while (true) {
            System.out.println();
            System.out.println("1. Enqueue Rear");
            System.out.println("2. Enqueue Front");
            System.out.println("3. Dequeue Front");
            System.out.println("4. Dequeue Rear");
            System.out.println("5. Peek Front");
            System.out.println("6. Peek Rear");
            System.out.println("7. Display Queue");
            System.out.println("8. Show Size");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value to enqueue at rear: ");
                    int value = scanner.nextInt();
                    if (queue.enqueueRear(value)) {
                        System.out.println(value + " enqueued at rear.");
                    } else {
                        System.out.println("Queue is full.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter value to enqueue at front: ");
                    int value = scanner.nextInt();
                    if (queue.enqueueFront(value)) {
                        System.out.println(value + " enqueued at front.");
                    } else {
                        System.out.println("Queue is full.");
                    }
                }
                case 3 -> {
                    Integer removed = queue.dequeueFront();
                    if (removed != null) {
                        System.out.println("Dequeued from front: " + removed);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                }
                case 4 -> {
                    Integer removed = queue.dequeueRear();
                    if (removed != null) {
                        System.out.println("Dequeued from rear: " + removed);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                }
                case 5 -> {
                    Integer front = queue.peekFront();
                    if (front != null) {
                        System.out.println("Front element: " + front);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                }
                case 6 -> {
                    Integer rear = queue.peekRear();
                    if (rear != null) {
                        System.out.println("Rear element: " + rear);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                }
                case 7 -> queue.display();
                case 8 -> System.out.println("Current size: " + queue.getSize());
                case 9 -> {
                    System.out.println("Exiting Super Queue demo.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
}
