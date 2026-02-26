package package1;
import java.util.*;
public class Sieve_of_Eratosthenes {
    static int Sum_prime(int m) {
    	boolean[]isPrime=new boolean[m+1];
    	Arrays.fill(isPrime, true);
    	isPrime[0]=isPrime[1]=false;
    	int sum=0;
    	for(int i=2;i<=m;i++) {
    		if(isPrime[i]) {
    			sum+=i;
    			for(int j=i*i;j<=m;j+=i) {
    				isPrime[j]=false;
    			}
    		}
    	}
    	return sum;
    }
	public static void main(String[] args) {
		int m=6;
		System.out.println(Sum_prime(m));
	}

}
