package Practise;

import java.util.Arrays;

public class CustomerArray {

    private String[] customers;
    private int n; // the number of customers currently stored
    private int N_max; // maximum capacity of customers array

    public CustomerArray(int size) {
        this.N_max = size;
        this.customers = new String[N_max]; // initialize null value of n size of customer array
        this.n = 0; // default set current customer to 0
    }

    public void InsertOptionB(String new_customer) {
        if (new_customer == null) {
            System.out.println("Cannot insert null value");
            return;
        }
        if ((new_customer.trim()).isBlank()) {
            System.out.println("Cannot insert empty value");
            return;
        }
        if (n < N_max) {
            int i = 0;
            while (i < n && customers[i].compareTo(new_customer) < 0) {
                i++;
            }
            int j = n - 1;
            while (j >= i) {
                customers[j + 1] = customers[j];
                j--;
            }
            customers[i] = new_customer;
            n++;
        } else {
            System.out.println("The array is already full");
        }
    }

    public int SearchOptionB(String customer) {
        if (customer == null) {
            System.out.println("Cannot search for null value");
            return -1;
        }
        if ((customer.trim()).isBlank()) {
            System.out.println("Cannot search for empty value");
            return -1;
        }
        customer = customer.toLowerCase(); // Convert search query to lowercase
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            String currentCustomer = customers[m].toLowerCase(); // Convert customer name to lowercase
            if (currentCustomer.equals(customer)) {
                return m;
            } else if (currentCustomer.compareTo(customer) > 0) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public void DeleteOptionB(String customer) {
        if (customer == null) {
            System.out.println("Cannot delete null value");
            return;
        }
        customer = customer.toLowerCase(); // Convert search query to lowercase
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            String currentCustomer = customers[m].toLowerCase(); // Convert customer name to lowercase
            if (currentCustomer.equals(customer)) {
                while (m < n - 1) {
                    customers[m] = customers[m + 1];
                    m++;
                }
                customers[n - 1] = null; // Nullify the value after deletion
                n--; // reduce number of customer count by 1
                return;
            } else if (currentCustomer.compareTo(customer) > 0) {
                r = m - 1; // search in left side of array by changing right index to middle index - 1
            } else {
                l = m + 1; // search in right side of array by changing left index to middle index + 1
            }
        }
        System.out.println("This customer is not in the array");
    }

    public void increasedCapacity(int n_max) {
        this.N_max = n_max;
//        create new array with increased capacity
        this.customers = Arrays.copyOf(this.customers, this.N_max);
    }

    @Override
    public String toString() {
        return "\n" + "-".repeat(10) + "\nArray: " + Arrays.toString(customers) + "\nSize: " + this.n + "\nCapacity: " + this.N_max + "\n" + "-".repeat(10) + "\n";
    }

    // Test the algorithms
    public static void main(String[] args) {
        CustomerArray ca = new CustomerArray(3); // Test with smaller size to hit full array case sooner

        System.out.println("Inserting Alice, Bob, Charlie:");
        ca.InsertOptionB("Alice");
        ca.InsertOptionB("Bob");
        ca.InsertOptionB("Charlie");
        System.out.println(ca);

        System.out.println("Inserting another customer to a full array:");
        ca.InsertOptionB("Dave"); // Should print "The array is already full"

        System.out.println("Search for Bob: " + ca.SearchOptionB("bob")); // Should print index of Bob
        System.out.println("Search for Dave: " + ca.SearchOptionB("dave")); // Should print -1
        System.out.println("Search for null: " + ca.SearchOptionB(null)); // Should handle null gracefully

        System.out.println("Inserting dave: ");
        ca.InsertOptionB("dave"); // Testing case sensitivity
        System.out.println("Search for dave: " + ca.SearchOptionB("DAVE")); // Should print -1 since Dave was not inserted

        System.out.println("Delete Bob:");
        ca.DeleteOptionB("Bob");
        System.out.println(ca);
        System.out.println("Search for Bob after deletion: " + ca.SearchOptionB("Bob")); // Should print -1

        System.out.println("Delete a customer not in the array:");
        ca.DeleteOptionB("Eve"); // Should print "This customer is not in the array"

        System.out.println("Delete null:");
        ca.DeleteOptionB(null); // Should handle null gracefully

        System.out.println("Inserting Charlie again to test duplicate:");
        ca.InsertOptionB("Charlie"); // Should handle insertion normally
        System.out.println(ca);

        System.out.println("Search for Charlie after duplicate: " + ca.SearchOptionB("Charlie")); // Should print the correct index

        System.out.println("Increase capacity of array to 4");
        ca.increasedCapacity(4);
        System.out.println("Inserting empty string:");
        ca.InsertOptionB(" "); // Should handle empty string gracefully
        System.out.println(ca);
        System.out.println("Search for empty string: " + ca.SearchOptionB("")); // Should print the correct index
        ca.DeleteOptionB(" "); // Should delete the empty string gracefully
        System.out.println("Search for empty string after deletion: " + ca.SearchOptionB("")); // Should print -1

        System.out.println("Final Customer Array: " + ca);
    }
}
