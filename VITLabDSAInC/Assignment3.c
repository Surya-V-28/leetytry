#include <stdio.h>
#include <stdlib.h>

// Function to check if an array contains duplicates
int hasDuplicates(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                return 1; // Duplicate found
            }
        }
    }
    return 0; // No duplicates
}

// Function to get input sequence from the user
void getInput(int arr[], int *n) {
    printf("Enter the number of elements: ");
    scanf("%d", n);
    printf("Enter %d unique integers:\n", *n);
    for (int i = 0; i < *n; i++) {
        scanf("%d", &arr[i]);
    }
    while (hasDuplicates(arr, *n)) {
        printf("The sequence contains duplicates. Please enter %d unique integers:\n", *n);
        for (int i = 0; i < *n; i++) {
            scanf("%d", &arr[i]);
        }
    }
}

// Function to find numbers divisible by any even number
int findDivisibleByEven(int input[], int n, int output[]) {
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (input[i] % 2 == 0) {
            output[count++] = input[i];
        }
    }
    return count; // Return the count of divisible numbers
}

// Function to find the second smallest number using linear search
int findSecondSmallestIndexLinear(int arr[], int n) {
    if (n < 2) {
        printf("Not enough elements to find the second smallest.\n");
        return -1;
    }
    int first = arr[0], second = __INT_MAX__;
    int secondIndex = -1;

    for (int i = 1; i < n; i++) {
        if (arr[i] < first) {
            second = first;
            first = arr[i];
            secondIndex = i;
        } else if (arr[i] < second && arr[i] != first) {
            second = arr[i];
            secondIndex = i;
        }
    }
    return secondIndex;
}

// Function to sort an array (required for binary search)
void sortArray(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

// Binary search function for a target value
int binarySearch(int arr[], int n, int target) {
    int left = 0, right = n - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1; // Not found
}

// Function to print the array
void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// Main function with menu-based choices
int main() {
    int input[100], n = 0;
    int divisible[100], divisibleCount = 0;
    int choice;

    do {
        printf("\nMenu:\n");
        printf("1. Enter Input Sequence\n");
        printf("2. Find Numbers Divisible by Even Numbers\n");
        printf("3. Find Second Smallest Using Linear Search\n");
        printf("4. Find Second Smallest Using Binary Search\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                getInput(input, &n);
                printf("Input sequence is: ");
                printArray(input, n);
                break;

            case 2:
                divisibleCount = findDivisibleByEven(input, n, divisible);
                printf("Numbers divisible by any even number: ");
                printArray(divisible, divisibleCount);
                break;

            case 3:
                if (divisibleCount > 0) {
                    int secondSmallestIndex = findSecondSmallestIndexLinear(divisible, divisibleCount);
                    if (secondSmallestIndex != -1) {
                        printf("Using linear search:\n");
                        printf("Second smallest index is %d and the corresponding number is %d.\n",
                               secondSmallestIndex, divisible[secondSmallestIndex]);
                    }
                } else {
                    printf("Please find numbers divisible by even numbers first.\n");
                }
                break;

            case 4:
                if (divisibleCount > 0) {
                    sortArray(divisible, divisibleCount);
                    int secondSmallestIndex = findSecondSmallestIndexLinear(divisible, divisibleCount);
                    if (secondSmallestIndex != -1) {
                        printf("Using binary search:\n");
                        int target = divisible[1]; // Second element after sorting
                        int index = binarySearch(divisible, divisibleCount, target);
                        printf("Second smallest index is %d and the corresponding number is %d.\n",
                               index, target);
                    }
                } else {
                    printf("Please find numbers divisible by even numbers first.\n");
                }
                break;

            case 5:
                printf("Exiting...\n");
                break;

            default:
                printf("Invalid choice! Please try again.\n");
                break;
        }
    } while (choice != 5);

    return 0;
}
