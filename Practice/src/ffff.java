import java.util.Scanner;

public class ffff {

	public static void main(String[] args) {
	   star();
	}
	
	//메서드1 - 기본 3줄, N 입력받기, 반복찍기 실행
	public static void star() {
		// 한 줄 을 입력 받는다.
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		int[][] star = new int[][] {
			{0,0,1,0,0,0}
		   ,{0,1,0,1,0,0}
		   ,{1,1,1,1,1,0}
		};
		
		if(count == 3) {
			// end this method
			print(star);
		} else { 
			// go to method 2 
			star_list(star, count, 6);
		}
		
	}
	

	public static int[][] star_list(int[][] /*도화지*/basic, int /*찍길 원하는 라인*/n, int /*현재 라인*/now_n) {
		//1.기존 도화지 2배로 늘리기
		//1-1.새 도화지 선언
		int[][] new_basic = new int[now_n][now_n * 2];
//		//1-2. 새 도화지를 기존의 2배로 크기를 늘리기
//		for(int i=0; i<basic.length;i++) {
//			new_basic[] = new int[basic[i].length * 2];
//		}
		
		
		//2. 3개의 포인트에 별 그리기
		//포인트 3개  [0][n/2] [n/2][0] [n/2][n]
		//포인트 각각에 복사하기
		int ix1 =0 , ix2 =now_n/2, ix3=now_n/2;
		int iy1=now_n/2, iy2=0, iy3=now_n; 
		
		for(int i =0; i< basic.length;i++) {
			for(int j =0; j< basic[i].length; j++) {
			 
				 //과중
				new_basic[ix1+i][iy1+j] = basic[i][j];
				new_basic[ix2+i][iy2+j] = basic[i][j];
				new_basic[ix3+i][iy3+j] = basic[i][j];
			}
		}
		//System.out.println(now_n +"+"+ n);
		if(now_n == n) {
			print(new_basic);
		} else { 
			star_list(new_basic, n , now_n * 2);
		}
		
		return new_basic;
		
	}
	
	public static void print(int[][] star) {
	
		for(int i = 0 ; i < star.length ; i++) {
			for (int j = 0 ; j < star[0].length ; j++) {
				if(star[i][j] == 0){
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
