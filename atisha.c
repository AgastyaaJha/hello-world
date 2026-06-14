#include<stdio.h>
#include<string.h>
 typedef struct address{
    int house;
    int block;
    char city[100];
    char state[100];
} add;
void print_add(struct address addr);
int main()
{
    struct  address addresses[5];
    printf("enter the info for thr person 1:");
    scanf("%d",&addresses[0].house);
    scanf("%d",&addresses[0].block);
     scanf("%s",addresses[0].city);
     scanf("%s",addresses[0].state);
     return 0;
}
void print_add(struct address addr){
    printf("address is %d,%d.%s,%s",addr.house,addr. block,addr.city,addr.state);
}



    


