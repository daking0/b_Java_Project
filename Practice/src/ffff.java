import java.util.Scanner;

public class ffff {

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
			star_list(star, count, 6);
		}
		
	}
	

	public static int[][] star_list(int[][] /*��ȭ��*/basic, int /*��� ���ϴ� ����*/n, int /*���� ����*/now_n) {
		//1.���� ��ȭ�� 2��� �ø���
		//1-1.�� ��ȭ�� ����
		int[][] new_basic = new int[now_n][now_n * 2];
//		//1-2. �� ��ȭ���� ������ 2��� ũ�⸦ �ø���
//		for(int i=0; i<basic.length;i++) {
//			new_basic[] = new int[basic[i].length * 2];
//		}
		
		
		//2. 3���� ����Ʈ�� �� �׸���
		//����Ʈ 3��  [0][n/2] [n/2][0] [n/2][n]
		//����Ʈ ������ �����ϱ�
		int ix1 =0 , ix2 =now_n/2, ix3=now_n/2;
		int iy1=now_n/2, iy2=0, iy3=now_n; 
		
		for(int i =0; i< basic.length;i++) {
			for(int j =0; j< basic[i].length; j++) {
			 
				 //����
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
