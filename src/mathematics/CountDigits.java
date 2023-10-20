package mathematics;

public class CountDigits {
    //Iterative solution
    public static int countDigits(int n){
        int count=0;
        while(n!=0 || n>0){
            n=n/10;
            ++count;
        }
        return count;
    }
    public static int count(int n){
        if(n==0){
            return 0;
        }
        return 1+count(n/10);
    }
    public static int countLog(long n){
        return (int) Math.floor(Math.log10(n)+1);
    }
}
