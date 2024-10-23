#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Define the structure for a student
typedef struct Student {
    char stud_name[60];
    char reg_num[10];
    int mark1, mark2, mark3, total;
    float average;
    char grade;
    struct Student *next;
} Student;

Student *head = NULL, *headNew = NULL;
int headInsertionCount = 0;
int headDeletionCount = 0;

// Function to calculate grade based on average
char calculateGrade(float avg) {
    if (avg >= 91) return 'S';
    if (avg >= 81) return 'A';
    if (avg >= 71) return 'B';
    if (avg >= 61) return 'C';
    if (avg >= 51) return 'D';
    if (avg >= 41) return 'E';
    if (avg < 40) return 'F';
    return 'N'; // Not appeared or Not eligible or Debarred
}

// Function to create a new student node
Student *createStudent(char *name, char *reg, int m1, int m2, int m3) {
    Student *newNode = (Student *)malloc(sizeof(Student));
    strcpy(newNode->stud_name, name);
    strcpy(newNode->reg_num, reg);
    newNode->mark1 = m1;
    newNode->mark2 = m2;
    newNode->mark3 = m3;
    newNode->total = m1 + m2 + m3;
    newNode->average = newNode->total / 3.0;
    newNode->grade = calculateGrade(newNode->average);
    newNode->next = NULL;
    return newNode;
}

// Function to add a new student at the end without duplicates
void addStudent(char *name, char *reg, int m1, int m2, int m3) {
    Student *newNode = createStudent(name, reg, m1, m2, m3);
    if (!head) {
        head = newNode;
        headInsertionCount++;
        return;
    }
    Student *temp = head;
    while (temp->next) {
        if (strcmp(temp->reg_num, reg) == 0) {
            printf("Duplicate registration number not allowed: %s\n", reg);
            free(newNode);
            return;
        }
        temp = temp->next;
    }
    if (strcmp(temp->reg_num, reg) == 0) {
        printf("Duplicate registration number not allowed: %s\n", reg);
        free(newNode);
        return;
    }
    temp->next = newNode;
}

// Function to traverse and print the list
void printList(Student *start) {
    if (!start) {
        printf("The list is empty.\n");
        return;
    }
    Student *temp = start;
    while (temp) {
        printf("Name: %s, Reg. No: %s, Marks: %d, %d, %d, Total: %d, Average: %.2f, Grade: %c\n",
               temp->stud_name, temp->reg_num, temp->mark1, temp->mark2, temp->mark3,
               temp->total, temp->average, temp->grade);
        temp = temp->next;
    }
    printf("\n");
}

// Function to print the list in reverse using a stack
void printListReverse(Student *start) {
    if (!start) {
        printf("The list is empty.\n");
        return;
    }
    Student *stack[100];
    int top = -1;
    Student *temp = start;
    while (temp) {
        stack[++top] = temp;
        temp = temp->next;
    }
    while (top >= 0) {
        temp = stack[top--];
        printf("Name: %s, Reg. No: %s, Marks: %d, %d, %d, Total: %d, Average: %.2f, Grade: %c\n",
               temp->stud_name, temp->reg_num, temp->mark1, temp->mark2, temp->mark3,
               temp->total, temp->average, temp->grade);
    }
    printf("\n");
}

// Function to delete nodes with average > 90 and move them to a new list
void moveHighAverageStudents() {
    Student *temp = head, *prev = NULL;
    while (temp) {
        if (temp->average > 90) {
            // Move node to the new list
            if (!headNew) {
                headNew = temp;
            } else {
                Student *newTemp = headNew;
                while (newTemp->next) {
                    newTemp = newTemp->next;
                }
                newTemp->next = temp;
            }
            // Remove node from the original list
            if (prev) {
                prev->next = temp->next;
            } else {
                head = temp->next;
                headDeletionCount++;
            }
            Student *nextTemp = temp->next;
            temp->next = NULL;
            temp = nextTemp;
        } else {
            prev = temp;
            temp = temp->next;
        }
    }
}

// Function to print the counts of head node updates
void printHeadUpdatesCount() {
    printf("Number of times head node updated during insertions: %d\n", headInsertionCount);
    printf("Number of times head node updated during deletions: %d\n", headDeletionCount);
}

// Main function with menu-driven input
int main() {
    int choice;
    char name[60], reg[10];
    int m1, m2, m3;
    do {
        printf("\nMenu:\n");
        printf("1. Add Student\n");
        printf("2. Display Students\n");
        printf("3. Display Students in Reverse\n");
        printf("4. Move Students with Average > 90 to New List\n");
        printf("5. Display New List\n");
        printf("6. Display Remaining Original List\n");
        printf("7. Print Head Node Update Counts\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                printf("Enter student name: ");
                scanf("%s", name);
                printf("Enter registration number: ");
                scanf("%s", reg);
                printf("Enter marks for three subjects: ");
                scanf("%d %d %d", &m1, &m2, &m3);
                addStudent(name, reg, m1, m2, m3);
                break;
            case 2:
                printf("Original List:\n");
                printList(head);
                break;
            case 3:
                printf("List in Reverse Order:\n");
                printListReverse(head);
                break;
            case 4:
                moveHighAverageStudents();
                printf("Students with average > 90 moved to a new list.\n");
                break;
            case 5:
                printf("New List (Students with average > 90):\n");
                printList(headNew);
                break;
            case 6:
                printf("Remaining Students in Original List:\n");
                printList(head);
                break;
            case 7:
                printHeadUpdatesCount();
                break;
            case 0:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    } while (choice != 0);

    return 0;
}
