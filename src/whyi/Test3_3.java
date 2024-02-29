package whyi;

import java.util.Scanner;

/*
숫자 맞추기 게임! 우리가 먼저 수를 지정하고 난수가 우리가 지정한 수를 맞추는 게임(1~6)
 * */ 
public class Test3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rand = (int)(Math.random()*10) + 1;
		int su , cnt = 1;
		
		
		while(cnt <= 5) {
			System.out.print("숫자를 입력하세요!(1~6) : ");
			su = sc.nextInt();
			if(su == rand) {
				System.out.println("정답입니다!");
				break;
			}
		else if(su > rand) {
			System.out.println("더 작은 수를 입력하세요.");
		}
		else {
			System.out.println("더 큰 수를 입력하세요.");
		}
		cnt++;
		
		
	
	 }
		if(cnt == 6) {
			System.out.println("틀렸습니다");
		}
		
		sc.close();
	}
}

