#include<stdio.h>
int main()
{
    int num,n;
    printf("enter a number ");
    scanf("%d \n %d\n",&num,&n);
    for(int i=0;i<=n;i++)
    {
        if(num%2!=0)
        {
            printf("not a prime number\n");
        }
        else
        {
            printf("prime number \n");
        }
    }
    return 0;
}
    