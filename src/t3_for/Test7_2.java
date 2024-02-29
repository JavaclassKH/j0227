package t3_for;

//return : 아래 명령을 모두 무시하고 클래스 블록을 종료
public class Test7_2 {
	public static void main(String[] args) {
		int cnt = 0;
		// Lable(이름:)을 적어주면 해당 for문을 탈출시켜줄 수 있다.
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt + " , i = "+i+" , j = " +j);
				// 앞의 문장을 6번 수행 후 탈출시키고자 한다.
				if(cnt == 6) return; 
			}
			System.out.println();
		}	
		System.out.println("작업 끝!");
		
	}
}
