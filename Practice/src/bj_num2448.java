import java.util.Scanner;
public class bj_num2448 {
	   public static void main(String[] args) {
		      star();
		   }
		   
		   //�޼���1 - �⺻ 3��, N �Է¹ޱ�, �ݺ���� ����
		   public static void star() {
		      // �� �� �� �Է� �޴´�.
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
		   
		   //�޼���2 -�ݺ� ��� ����
		   public static void star_list(int[][] /*��ȭ��*/basic, int /*��� ���ϴ� ����*/n, int /*���� ����*/now_n) {
		      // n/2,0  0,n/2 n,n/2
			   
			  
			   
			   
		   }
		   
		   //�޼���3 -�� ����Ʈ
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