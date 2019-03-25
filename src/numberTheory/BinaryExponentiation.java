package numberTheory;

public class BinaryExponentiation {
    //finding x^n ex:3^10
    //trick x^n=(x^2)^n/2
    public static void main(String[] args) {
        System.out.println(binaryExponentiation(3,2));
        System.out.println("e^"+modularExponentiation(3,10,4));
    }

    static long binaryExponentiation(int x,int n){
        if(n==0){
            return 1;
        }
        if(n%2==0)
            return binaryExponentiation(x*x,n/2);
        else
            return x*binaryExponentiation(x*x,(n-1)/2);
    }

    static long modularExponentiation(int x,int n,int M)
    {
        if(n==0)
            return 1;
        else if(n%2 == 0)        //n is even
            return modularExponentiation((x*x)%M,n/2,M);
        else                             //n is odd
            return (x*modularExponentiation((x*x)%M,(n-1)/2,M))%M;

    }

}
