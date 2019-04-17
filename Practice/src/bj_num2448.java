import java.util.Scanner;
public class bj_num2448 {
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
		         star_list(star, count, 3);
		      }
		      
		   }
		   
		   //메서드2 -반복 찍기 실행
		   public static void star_list(int[][] /*도화지*/basic, int /*찍길 원하는 라인*/n, int /*현재 라인*/now_n) {
		      // n/2,0  0,n/2 n,n/2
			   
			  
			   
			   
		   }
		   
		   //메서드3 -별 프린트
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