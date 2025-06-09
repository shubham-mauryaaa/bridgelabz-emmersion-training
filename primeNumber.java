import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 0 || n == 1){
			System.out.print("Entered Number is not a Prime Number!");
			return;
		}
		for(int i=2; i<=n/2; i++){
			if(n%i == 0){
				System.out.print("Entered Number is not a Prime Number!");
				return;
			}
		}
		System.out.print("Entered Number is Prime Number!");
	}
}