import java.util.Scanner;


public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int m =sc.nextInt();
		int sead = sc.nextInt();
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		
		for(int a = 0; a < m; a++) {
			for(int c = 0; c < m; c ++) {
				if((a*sead+c)%m==x1) {
					if((a*x1+c)%m==x2) {
						System.out.println(a+ " "+ c);
						a = m;
					}
				}
			}
		}
	}
}
