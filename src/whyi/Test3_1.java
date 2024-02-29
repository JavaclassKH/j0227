package whyi;

import java.util.Scanner;

// 숫자 맞추기 게임!(1~100까지의 자연수)
public class Test3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rand = (int)(Math.random() * 100) + 1;
		int cnt = 1 , su;
		
		while(cnt <= 5) {
			System.out.print(cnt + ". 수를 입력하세요(범위는 1~100) : ");
			su = sc.nextInt();
			
			if(su == rand) {
				System.out.println("정답입니다!");
				break;
				
			
			}
			else if(su > rand)	System.out.println("!!더 작은 수를 넣으세요");
			else	System.out.println("!!더 큰 수를 넣으세요");
			cnt++;
		}
		if(cnt == 6) {
			System.out.println("정답은 "+ rand +" 입니다.");
			System.out.println("다은 기회에....");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
