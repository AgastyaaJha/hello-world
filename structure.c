#include <stdio.h>
#include <string.h>
struct student {
    int roll;
    float cgpa;
    char name[50];
};
int main()
{
    struct student s1;
    struct student s2;
    s1 .roll =10;
    s1.cgpa=7.8;
    strcpy(s1.name ,"Agastyaa");
    s2 .roll =11;
    s2.cgpa=7.9;
    strcpy(s2.name ,"Anubhuti");
    printf("the name is %s \n",s1.name);
    printf("roll is %d\n",s1.roll);
    printf("cgpa is %f\n",s1.cgpa);
    printf("the name is %s \n",s2.name);
    printf("roll is %d\n",s2.roll);
    printf("cgpa is %f\n",s2.cgpa);
    return 0;
}

