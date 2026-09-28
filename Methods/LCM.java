public class LCM {
    static int gcd (int a, int b){

        int gcd = 1;

        for (int i = 1; i <= Math.min(a, b); i++){
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }

        return gcd;
    }

    static int lcm (int a, int b) {
        return (a * b) / gcd (a, b);
    }

    public static void main (String[] args){

        int a = 12;
        int b = 18;

        int resultgcd = gcd(a, b);
        int resultlcm = lcm(a, b);

        System.out.println("GCD: " + resultgcd);
        System.out.println("LCM: " + resultlcm);
    }
}