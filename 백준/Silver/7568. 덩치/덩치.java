import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int people = sc.nextInt();      //테스트 할 사람의 수 입력
		
		int [] x = new int [people] ;
		int [] y = new int [people] ;       //x,y의 몸무게를 각각의 배열에 저장한다.
				   
		for (int i=0; i<people; i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}                                  //x,y의 몸무게를 입력해준다.
				
		int [] rank = new int [people];    //덩치의 등수를 입력하기 위해 필요한 배열 rank
		int count =1;                      //덩치의 등수를 정하는 count 가장 큰 덩치는 1
				
		for(int i=0; i<people; i++) {
			count =1;

			for (int j=0; j<people; j++){			
				if(x[i]<x[j] && y[i]<y[j]) 
					count++;
				
				rank[i]=count;
			}			
		}
		
		for (int i=0; i<rank.length; i++) {
			System.out.print(rank[i]+" ");
		}		
	}
}