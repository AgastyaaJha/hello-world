import java.util.*;
class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}






class FirstClass{
    
    public static void main(String[] args) {
        int n=5;
        int number =1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        
    }
        
}




class directCllass{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for ( int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}