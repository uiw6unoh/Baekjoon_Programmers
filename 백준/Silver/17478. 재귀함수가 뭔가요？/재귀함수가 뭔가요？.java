import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	// 결과를 한 번에 출력하기 위한 StringBuilder
	static StringBuilder sb = new StringBuilder();
	static String s=""; //언더바 초기화
	static void chatbot(int n) { //입력한 n이 들어온다.(Ex. N=2 => 2,1,0)
		
		String line = s;
		if (n==0) { //n이 0이되면 마지막 문장을 실행하고 return으로 종료한다.
			sb.append(line+"\"재귀함수가 뭔가요?\"\n");
			sb.append(line+"\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
			sb.append(line+"라고 답변하였지.\n");
			return;
		}
			
		sb.append(line+"\"재귀함수가 뭔가요?\"\n");
		sb.append(line+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
		sb.append(line+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
		sb.append(line+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
		s+="____"; //언더바 추가
		chatbot(n-1); //재귀호출
		sb.append(line+"라고 답변하였지.\n");
		
	}
	
	public static void main(String[] args) throws Exception {
		
		sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");

		//FileInputStream은 느리다.
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		
		int N = Integer.parseInt(in.readLine()); //재귀횟수
		
		chatbot(N); //재귀함수 호출
		
		System.out.println(sb); //출력
	}
}