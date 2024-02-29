package whyi;

import java.util.Scanner;

/*
숫자 맞추기 게임! 우리가 먼저 수를 지정하고 난수가 우리가 지정한 수를 맞추는 게임(1~6)
 * */ 
public class Test3_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su , rand ,  ans;
		
		while(true) {
			while(true) {
				System.out.print("숫자를 입력하세요!(1~6) : ");
				su = sc.nextInt();
				
				if(su >= 1 &&  su <= 6) break;
				 System.out.println("1~6까지의 수를 입력하세요");
			}
			
			rand = (int)(Math.random()*6) + 1;
		
			if(su == rand) System.out.println("틀렸습니다");
			System.out.print("계속 할까요?(1:계속 / 0:그만");
			ans = sc.nextInt();
			
			sc.close();
	 }
	
	}
}

