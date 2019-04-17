import java.util.Scanner;

public class star_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i=0; i<num; i++) {
            for (int j=i; j<num-1; j++)
                System.out.print(" ");
            for (int k=0; k<=(i*2); k++)
                System.out.print("*");
            System.out.println("");
        }
        
        System.out.println();

		
		}
	}


/*   public static void main(String[] args) {
      ForIn(1, 5,"*");
   }
   
   public static void ForIn(int start, int end, String st){
      if(start < end){
         System.out.println(st);
         ForIn(start+1, end, st+"*");
      } else {
         System.out.println(st);
      }
   } 

*/