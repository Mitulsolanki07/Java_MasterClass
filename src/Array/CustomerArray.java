package Array;

import java.util.Arrays;

public class CustomerArray {
    public String[] getCustomers() {
        return customers;
    }

    private String[] customers;
    private int n;
    private int N_max;

    public CustomerArray(int size) {
        this.N_max = size;
        this.customers = new String[N_max];
        this.n = 0;
    }

    public void InsertOptionA(String new_customer) {
        if (new_customer == null) {
            System.out.println("Cannot insert null value");
            return;
        }
        if (n < N_max) {
            customers[n] = new_customer;
            n++;
        } else {
            System.out.println("The array is already full");
        }
    }

    public int SearchOptionA(String customer) {
        if (customer == null) {
            System.out.println("Cannot search for null value");
            return -1;
        }
        customer = customer.toLowerCase(); // Convert search query to lowercase
        for (int i = 0; i < n; i++) {
            if (customers[i].toLowerCase().equals(customer)) { // Convert customer name to lowercase
                return i;
            }
        }
        return -1;
    }

    public void DeleteOptionA(String customer) {
        if (customer == null) {
            System.out.println("Cannot delete null value");
            return;
        }
        customer = customer.toLowerCase(); // Convert search query to lowercase
        int i = 0;
        while (i < n && !customers[i].toLowerCase().equals(customer)) { // Convert customer name to lowercase
            i++;
        }

        if (i == n) {
            System.out.println("This customer is not in the array");
        } else {
            while (i < n - 1) {
                customers[i] = customers[i + 1];
                i++;
            }
            customers[n - 1] = null; // Clear the last element
            n--;
        }
    }

    // Test the algorithms
    public static void main(String[] args) {
        CustomerArray ca = new CustomerArray(3); // Test with smaller size to hit full array case sooner

        System.out.println("Inserting Alice, Bob, Charlie:");
        ca.InsertOptionA("Alice");
        ca.InsertOptionA("Bob");
        ca.InsertOptionA("Charlie");

        System.out.println("Inserting another customer to a full array:");
        ca.InsertOptionA("Dave"); // Should print "The array is already full"
        System.out.println("print array: " + Arrays.toString(ca.getCustomers()));
        System.out.println("Search for Bob: " + ca.SearchOptionA("Bob")); // Should print index of Bob
        System.out.println("Search for Dave: " + ca.SearchOptionA("Dave")); // Should print -1
        System.out.println("Search for null: " + ca.SearchOptionA(null)); // Should handle null gracefully

        ca.InsertOptionA("dave"); // Testing case sensitivity
        System.out.println("print array: " + Arrays.toString(ca.getCustomers()));
        System.out.println("Search for dave: " + ca.SearchOptionA("DAVE")); // Should print -1 since Dave was not inserted

        System.out.println("Delete Bob:");
        ca.DeleteOptionA("Bob");
        System.out.println("print array: " + Arrays.toString(ca.getCustomers()));
        System.out.println("Search for Bob after deletion: " + ca.SearchOptionA("Bob")); // Should print -1

        System.out.println("Delete a customer not in the array:");
        ca.DeleteOptionA("Eve"); // Should print "This customer is not in the array"

        System.out.println("Delete null:");
        ca.DeleteOptionA(null); // Should handle null gracefully

        System.out.println("Inserting Charlie again to test duplicate:");
        ca.InsertOptionA("Charlie"); // Should handle insertion normally
        System.out.println("print array: " + Arrays.toString(ca.getCustomers()));
        System.out.println("Search for Charlie after duplicate: " + ca.SearchOptionA("Charlie")); // Should print the correct index

        System.out.println("Inserting empty string:");
        ca.InsertOptionA(""); // Should handle empty string gracefully
        System.out.println("Search for empty string: " + ca.SearchOptionA("")); // Should print the correct index
        ca.DeleteOptionA(""); // Should delete the empty string gracefully
        System.out.println("Search for empty string after deletion: " + ca.SearchOptionA("")); // Should print -1
    }
}

