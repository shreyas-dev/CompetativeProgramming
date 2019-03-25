package numberTheory;

public class ExtendedEuclideanGCD {
    static int gcd,x,y;
    static int loopCount=0;
    static void extendendGCD(int a,int b){
        loopCount++;
        if(b==0){
            gcd=a;
            x=0;
            y=1;
        }else{
            extendendGCD(b,a%b);
            int temp=x;
            x=y;
            y=temp-((a/b)*y);
        }
    }

    public static void main(String[] args) {
        extendendGCD(Integer.MAX_VALUE,Integer.MAX_VALUE-1);
        System.out.println(gcd);
        System.out.println(loopCount);
    }
}
