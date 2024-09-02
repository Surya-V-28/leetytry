#include<stdio.h>
#include<stdbool.h>
#define maxSize 100
int Nparenthsis=0;
int FParenthsis=0;
int Sparenthsis = 0;
int top =-1;  // value for the stack top
char stk[maxSize];
bool notValid = false;
bool checkitsOpen(char c) {
    if(c=='(' || c=='[' || c=='{' ){
        return true;
    } else {
        return false;
    }
}
bool checkitsClose(char c) {
    if(c==')' || c==']' || c=='}' ){
        return true;
    } else {
        return false;
    }
}
bool isMatching(char c) {
    if(c==')' && stk[top]=='('){
        Nparenthsis++;
        return true;
    } 
    else if(c==']' && stk[top]=='['){
        Sparenthsis++;
        return true;
    }
    else if(c=='}' && stk[top]=='{'){
        FParenthsis++;
        return true;
    }
    else {
        return false;
    }

}
void push(char ch){
    if(top <100) {
        stk[++top] = ch;
    } else {
        printf("stack is over flow");
    }
} 
void pop() {
    top--;
}
void printTheDetails() {
    if(Nparenthsis<=5 && FParenthsis<=5 && Sparenthsis<=5) {
        printf(" the count of () is %d \n ", Nparenthsis);
        printf(" the count of [] is %d \n ", Sparenthsis);
        printf(" the count of {} is %d \n ", FParenthsis);
        printf("its Insufficents");
    } else if(Nparenthsis<=10 && FParenthsis<=10 && Sparenthsis<=10) {
        printf(" the count of () is %d \n ", Nparenthsis);
        printf(" the count of [] is %d \n ", Sparenthsis);
        printf(" the count of {} is %d \n ", FParenthsis);
        printf("its Moderate");
    } else {
        printf(" the count of () is %d \n ", Nparenthsis);
        printf(" the count of [] is %d \n ", Sparenthsis);
        printf(" the count of {} is %d \n ", FParenthsis);
        printf("irs Sufficents");
    }
}

int main() {
    int eachChar;
    FILE *file  = fopen("input.txt","r");
    if(file==NULL) {
        printf("unable to open the file form the user");
        return 0;
    }
    while((eachChar=fgetc(file))!=EOF){
        if(checkitsClose(eachChar) || checkitsOpen(eachChar)){
        if(checkitsOpen(eachChar)) {
            push(eachChar);
        } else  if(checkitsClose(eachChar) && isMatching(eachChar)) {
            pop(); 
        }
         else {
            printf("wrong pranenthis %d \n", top);
            notValid= true;
            break;
        }
        }
    }
    fclose(file);
    if(!notValid){
        printf("correct pranenthis %d \n", top);
        printTheDetails();
    }


    return 1;
}