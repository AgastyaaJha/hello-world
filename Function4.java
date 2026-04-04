import java .util.*;

public class Function4 {
    public static int printTable(int n){
        if(n%2==0){
            System.out.println("Even number");
        }
            else{
                System.out.println("Odd number");
            }
        //for (int i=1;i<=10;i++){
            
            //System.out.println(n*i);
        //}
            
            return 1;
        
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            printTable(n);
    }
}