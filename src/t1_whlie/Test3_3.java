package t1_whlie;

// 무한 loop
public class Test3_3 {
	public static void main(String[] args) {
		
		int i = 0;
		boolean run = true;
		
		while(run) {
			i++;
			System.out.println(i + ".안녕");
			
			//if (i == 20) break;
			if (i == 10) run = false;
		}
		
		
		
	}
}
