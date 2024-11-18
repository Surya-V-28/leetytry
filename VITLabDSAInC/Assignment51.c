

// Perform the following operations in a Binary Search Tree
// a) Create and insert the elements 40,25,17,60,7,19.
// b) Search whether 25 and 33 are found or not (Text based
// output is enough).

#include <stdio.h>
#include <stdlib.h>

// Define a node structure
struct Node {
    int key;
    struct Node* left;
    struct Node* right;
};

// Function to create a new node
struct Node* createNode(int key) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->key = key;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to insert a node into the BST
struct Node* insert(struct Node* root, int key) {
    if (root == NULL) {
        return createNode(key);
    }
    if (key < root->key) {
        root->left = insert(root->left, key);
    } else if (key > root->key) {
        root->right = insert(root->right, key);
    }
    return root;
}

// Function to search for a key in the BST
int search(struct Node* root, int key) {
    if (root == NULL) {
        return 0; // Key not found
    }
    if (root->key == key) {
        return 1; // Key found
    } else if (key < root->key) {
        return search(root->left, key);
    } else {
        return search(root->right, key);
    }
}

int main() {
    struct Node* root = NULL;

    // Insert elements into the BST
    int elements[] = {40, 25, 17, 60, 7, 19};
    int n = sizeof(elements) / sizeof(elements[0]);
    for (int i = 0; i < n; i++) {
        root = insert(root, elements[i]);
    }

    // Search for 25 and 33
    int keysToSearch[] = {25, 33};
    for (int i = 0; i < 2; i++) {
        if (search(root, keysToSearch[i])) {
            printf("%d found in the BST.\n", keysToSearch[i]);
        } else {
            printf("%d not found in the BST.\n", keysToSearch[i]);
        }
    }

    return 0;
}

#include <stdio.h>
#include <stdlib.h>

// Define the structure of a binary tree node
struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

// Function to create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to merge two binary trees
struct Node* mergeTrees(struct Node* t1, struct Node* t2) {
    if (t1 == NULL) return t2; // If first tree is NULL, return second tree
    if (t2 == NULL) return t1; // If second tree is NULL, return first tree

    // Merge current nodes
    t1->data += t2->data;

    // Recursively merge left and right subtrees
    t1->left = mergeTrees(t1->left, t2->left);
    t1->right = mergeTrees(t1->right, t2->right);

    return t1;
}

// Function to print the tree in level-order (for output clarity)
void printLevelOrder(struct Node* root) {
    if (root == NULL) return;

    struct Node* queue[100];
    int front = 0, rear = 0;
    queue[rear++] = root;

    while (front < rear) {
        struct Node* current = queue[front++];
        printf("%d ", current->data);

        if (current->left != NULL) queue[rear++] = current->left;
        if (current->right != NULL) queue[rear++] = current->right;
    }
}

// Helper function to insert nodes level-wise from array representation
struct Node* insertLevelOrder(int arr[], int n, int i) {
    if (i >= n || arr[i] == 0) return NULL;

    struct Node* root = createNode(arr[i]);
    root->left = insertLevelOrder(arr, n, 2 * i + 1);
    root->right = insertLevelOrder(arr, n, 2 * i + 2);

    return root;
}

// Main function
int main() {
    int arr1[] = {1, 3, 2, 5};
    int arr2[] = {2, 1, 3, 0, 4, 0, 7};

    int n1 = sizeof(arr1) / sizeof(arr1[0]);
    int n2 = sizeof(arr2) / sizeof(arr2[0]);

    // Create binary trees from array inputs
    struct Node* tree1 = insertLevelOrder(arr1, n1, 0);
    struct Node* tree2 = insertLevelOrder(arr2, n2, 0);

    // Merge the two binary trees
    struct Node* mergedTree = mergeTrees(tree1, tree2);

    // Print the merged tree in level-order
    printf("Merged Tree: ");
    printLevelOrder(mergedTree);
    printf("\n");

    return 0;
}
