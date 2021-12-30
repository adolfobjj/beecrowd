import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        int j = 1;
        while(j<=x){
            String s[] = sc.nextLine().split(" ");
            int a[]= new int[s.length];
            for(int i =0;i<a.length;i++){
                if((i!=1) && (i!=3) && (i!=5)){
                    a[i] = Integer.parseInt(s[i]);
                }
                
            }
            int n = 0;
            int d = 0;
            if(s[3].compareTo("+")==0){
                d=a[2]*a[6];
                n = (a[0]*a[6] + a[4]*a[2]);
            }else if(s[3].compareTo("-")==0){
                d=a[2]*a[6];
                n = (a[0]*a[6] - a[4]*a[2]);
            }else if(s[3].compareTo("*")==0){
                n = a[0]*a[4];
                d = a[2]*a[6];
            }else if(s[3].compareTo("/")==0){
                n = a[0]*a[6];
                d = a[2]*a[4];
            }
            int temp =0;
            int d2 = d;
            int n2 = n;
            if((n>0)  && (d>0)){
              if(n<d){
                    for(int i =n2;i>=2;i--){
                        if((n2%i==0)&&(d2%i==0)){
                            n2 = n2/i;
                            d2 = d2/i;
                        }
                    }
                }else{
                    for(int i =d2;i>=2;i--){
                        if((n2%i==0)&&(d2%i==0)){
                            n2 = n2/i;
                            d2 = d2/i;
                        }
                    }
                }
            }else if(n<0){
                n2 = n*(-1);
                if(n2<d){
                    
                    for(int i =n2;i>=2;i--){
                        if((n2%i==0)&&(d2%i==0)){
                            n2 = n2/i;
                            d2 = d2/i;
                        }
                    }
                    n2 = n2 *(-1);
                }else{
                  for(int i =d2;i>=2;i--){
                        if((n2%i==0)&&(d2%i==0)){
                            n2 = n2/i;
                            d2 = d2/i;
                        }
                    }
                    n2 = n2 *(-1);
                }
            }else if(d<0){
                d2 = d*(-1);
                if(n2<d2){
                    
                    for(int i =n2;i>=2;i--){
                        if((n2%i==0)&&(d2%i==0)){
                            n2 = n2/i;
                            d2 = (d2/i)*(-1);
                        }
                    }
                    d2 = d2*(-1);
                }else{
                    for(int i =d2;i>=2;i--){
                        if((n2%i==0)&&(d2%i==0)){
                            n2 = n2/i;
                            d2 = (d2/i)*(-1);
                        }
                    }
                    d2 = d2*(-1);
                }
            }
            if(n2==0){
                System.out.println(n+"/"+d+" = "+n2+"/"+1);
            }else{
                System.out.println(n+"/"+d+" = "+n2+"/"+d2);
            }
            j++;
        }
    }
}