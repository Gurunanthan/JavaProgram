package HardThirty;

import java.util.Scanner;

public class generics<T> {
    private int count = 0;
    private int size;
    private T[] arr;

    public generics(int size) {
        this.size = size;
        arr = (T[]) new Object[size];
    }

    public void add(T data) {
        if (count < size) {
            arr[count] = data;
            count++;
        }
    }

    public T get(T data) {
        for (int i = 0; i < count; i++) {
            if (data.equals(arr[i])) {
                return arr[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        generics<String> gen = new generics<>(20);

        gen.add("1");
        gen.add("2");
        gen.add("3");

        System.out.print("Enter an element to retrieve: ");
        String elementToRetrieve = sc.next();
        String result = gen.get(elementToRetrieve);

        if (result != null) {
            System.out.println("Retrieved element: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
