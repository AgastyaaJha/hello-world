import java.util.*;
class CalacClass{
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Press 1 for +, 2 for -, 3 for *, 4 for /");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            if (b!=0){
                System.out.println(a/b);
            }
            else{
                System.out.println("Cannot divide by zero");
            }
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
    }
