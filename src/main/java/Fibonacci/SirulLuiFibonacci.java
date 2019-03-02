package Fibonacci;

public class SirulLuiFibonacci {


    public static void main(String[] args) {


   getFib(0);


        System.out.println(getFib(46));

    }

   public static int getFib(int n) {

        int t1=0;
        int t2=1;
        int S = 0;


        for(int i=2; i<n; i++) {
            S = t1+t2;
            t1=t2;
            t2 =S;

        }
        return S;


    }

}

