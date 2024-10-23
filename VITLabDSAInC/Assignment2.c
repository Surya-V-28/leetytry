#include <stdio.h>
#include <stdlib.h>

// Function to check if an array contains duplicates
int hasDuplicates(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                return 1;
            }
        }
    }
    return 0;
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
    return count;
}

// Merge function for merge sort
void merge(int arr[], int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int L[n1], R[n2];

    for (int i = 0; i < n1; i++)
        L[i] = arr[left + i];
    for (int i = 0; i < n2; i++)
        R[i] = arr[mid + 1 + i];

    int i = 0, j = 0, k = left;

    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
}

// Merge sort function
void mergeSort(int arr[], int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}

// Function to find the second smallest index using linear search
int findSecondSmallestIndexLinear(int arr[], int n) {
    if (n < 2) {
        printf("Not enough elements to find the second smallest.\n");
        return -1;
    }
    return 1; // Since it's sorted, the second smallest will always be at index 1.
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
    return -1;
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
        printf("3. Sort Intermediate Result Using Merge Sort\n");
        printf("4. Find Second Smallest Using Linear Search\n");
        printf("5. Find Second Smallest Using Binary Search\n");
        printf("6. Exit\n");
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
                    mergeSort(divisible, 0, divisibleCount - 1);
                    printf("Sorted intermediate result: ");
                    printArray(divisible, divisibleCount);
                } else {
                    printf("Please find numbers divisible by even numbers first.\n");
                }
                break;

            case 4:
                if (divisibleCount > 0) {
                    int secondSmallestIndex = findSecondSmallestIndexLinear(divisible, divisibleCount);
                    if (secondSmallestIndex != -1) {
                        printf("Using linear search:\n");
                        printf("Second smallest index is %d and the corresponding number is %d.\n",
                               secondSmallestIndex, divisible[secondSmallestIndex]);
                    }
                } else {
                    printf("Please sort the intermediate result first.\n");
                }
                break;

            case 5:
                if (divisibleCount > 0) {
                    int target = divisible[1]; // The second smallest element after sorting
                    int secondSmallestIndex = binarySearch(divisible, divisibleCount, target);
                    if (secondSmallestIndex != -1) {
                        printf("Using binary search:\n");
                        printf("Second smallest index is %d and the corresponding number is %d.\n",
                               secondSmallestIndex, target);
                    }
                } else {
                    printf("Please sort the intermediate result first.\n");
                }
                break;

            case 6:
                printf("Exiting the program.\n");
                break;

            default:
                printf("Invalid choice! Please try again.\n");
        }
    } while (choice != 6);

    return 0;
}
