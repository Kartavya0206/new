import java.util.* ;
public class Fabbinaci{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a=0;
        System.out.print(0+" ");
        int b=1;
        System.out.print(1+" ");
        for(int count=2 ; count<=n ; count ++)
        {
            int temp =b;
            b=b+a;
            System.out.print(b+ " ");
            a=temp;
        }
        sc.close();
        }
    }

