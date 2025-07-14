package com.demo.labs.lab1.Sixth;

import java.util.*;

class ArrayStore {
    private int[] arr = new int[10];
    private int size = 0;

    // Accept 10 integers
    public void acceptInput(Scanner scanner) {
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
            size++;
        }
    }

    // Display using while loop
    public void displayWhile() {
        System.out.print("Array elements (while loop): ");
        int i = 0;
        while (i < size) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    // Display using for loop
    public void displayFor() {
        System.out.print("Array elements (for loop): ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Sort the array
    public void sortArray() {
        Arrays.sort(arr, 0, size);
        System.out.println("Sorted array: " + Arrays.toString(Arrays.copyOf(arr, size)));
    }

    // Count occurrences of a number
    public int countOccurrences(int num) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    // Insert number at specified position
    public void insertAt(int num, int position) {
        if (position < 0 || position > size || size == arr.length) {
            System.out.println("Invalid position or array full.");
            return;
        }

        // Shift elements to the right
        for (int i = size; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = num;
        size++;
        System.out.println("After insertion: " + Arrays.toString(Arrays.copyOf(arr, size)));
    }

    // Return array excluding duplicates
    public int[] removeDuplicates() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(arr[i]);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayStore store = new ArrayStore();

        store.acceptInput(scanner);
        store.displayWhile();
        store.displayFor();
        store.sortArray();

        // Count occurrences
        System.out.print("Enter a number to count occurrences: ");
        int number = scanner.nextInt();
        int count = store.countOccurrences(number);
        System.out.println(number + " occurs " + count + " times.");

        // Insert number
        System.out.print("Enter number to insert: ");
        int toInsert = scanner.nextInt();
        System.out.print("Enter position (0-9): ");
        int pos = scanner.nextInt();
        store.insertAt(toInsert, pos);

        // Remove duplicates
        int[] uniqueArray = store.removeDuplicates();
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));

        scanner.close();
    }
}

