package t3_for;

public class Test6_1 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=1; i<=3; i++) {
			
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt + " , i = "+i+" , j = " +j);
				// 앞의 문장을 6번 수행 후 탈출시키고자 한다.
				if(cnt == 6) break; // break 는 가장 가까운 for 문을 탈출한다
			}
			System.out.println();
		}	
		System.out.println("작업 끝!");
	}
}
