import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    

        int K= scan.nextInt();

 if(K == 1){
   System.out.println("Top 1");
 }else  if (K > 1 && K <= 3){
   System.out.println("Top 3");
 }else if (K > 3 && K <= 5){
   System.out.println("Top 5");
}else  if (K > 5 && K <= 10){
   System.out.println("Top 10");
}else  if (K > 10 && K <= 25){
   System.out.println("Top 25");
}else  if (K > 25 && K <= 50){
   System.out.println("Top 50");
}else  if (K > 50 && K <= 100){
   System.out.println("Top 100");}
   
    }
}