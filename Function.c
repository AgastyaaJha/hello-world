#include <stdio.h>
int calcPercantage(int maths,int sanskrit,int english);
int main(){
    int maths = 90;
    int sanskrit = 90;
    int english = 95;
    
    printf("percanatge : %d\n", calcPercantage(maths,sanskrit,english));
   return 0;
}
 int calcPercantage(int maths,int sanskrit,int english){
    return (maths+sanskrit+english/3);
   
}
    
