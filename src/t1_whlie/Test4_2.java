package t1_whlie;

// 반복문 제어(조건문의 처음으로 돌려보낸다 : continue)
//i 값이 짝수인 경우만 출력하시오.(단, 홀수인 경우는 출력하지 않고 다시 조건을 비교하도록 하시오.)
public class Test4_2 {
	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {
			i++;
			
			if(i % 2 != 0) continue; 
			// i 는 12345678910 되는데, 
				
			System.out.println(i);
		}
		
		
		
		
	}
}
