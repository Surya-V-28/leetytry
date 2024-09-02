#include<stdio.h>
#define max 100
int main() {
    char  str[max];
    char ch;
    char newStr[max];
    int turn=0;
    do {
    printf("Enter the text to convert to ciper in Upper Case \n");
    scanf("%s", str);
    printf("Enter the number of the shift you wanna do for[0-25] \n");
    scanf("%d", &turn);
    if(!(turn>=0 && turn <=25)){
        printf("then entered number is not in the range we convert to range using %d mod 25 is %d \n", turn, turn%26);
    }
    int i=0;
    while(str[i] !='\0'){
        if(str[i]>='a' && str[i]<='z') {
            newStr[i] =(str[i]- 'a'+ turn)%26 + 'a';
         } 
         else if(str[i]>='A' && str[i]<='Z') {
             newStr[i] =(str[i]-'A'+ turn)%26 + 'A';
         } 
         else {
            newStr[i] = str[i];
         }
        i++;
    }
     newStr[i] = '\0'; 
    printf("the Converted ciper string is %s \n", newStr);
    printf("Do you wish to continue yes = y / No = N \n");
    getchar();  
    scanf("%c",&ch);
    }while(ch=='y');
    return 0;
}