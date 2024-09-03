
#include<stdio.h>
int top=-1;
int main() {
    int i=0, j=0;
    int pushArr[] = {5,10,15,20,25};
    int popArr[] = {20, 25, 15, 10, 5};
    int newArr[10];
    for(i=0;i<5;i++){
        newArr[++top] = pushArr[i];
        printf("the pushed value, %d \n", newArr[top]);
        while(popArr[j]==newArr[top] && top>=0){
         printf("the Poped value, %d \n", newArr[top]);
            top--;
            j++;
        }
    }
    if(top==-1) {
        printf("correct working always, True");
    } else {
          printf("Not a proper Sequence, Wrong");
    }
    return 1;

}