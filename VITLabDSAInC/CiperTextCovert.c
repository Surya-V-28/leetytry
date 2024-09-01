#include<stdio.h>
#define max 100
int main() {
    char  str[max];
    char newStr[max];
    int turn=0;
    printf("Enter the text to convert to ciper \n");
    scanf("%s", str);
    printf("Enter the number of the shift you wanna do \n");
    scanf("%d", &turn);
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
    printf("the entered string is %s", newStr);
    return 0;
}