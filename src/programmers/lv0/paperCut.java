package programmers.lv0;

public class paperCut {
	
//	[문제 설명]
//	머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
//	정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하도록 solution 함수를 완성해보세요.
//
//			제한사항
//			0 < M, N < 100
//			종이를 겹쳐서 자를 수 없습니다.
//			입출력 예
//			M	N	result
//			2	2	3
//			2	5	9
//			1	1	0
//			입출력 예 설명
//			입출력 예 #1
//
//			본문과 동일합니다.
//			입출력 예 #2
//
//			가로 2 세로 5인 종이는 가로로 1번 세로로 8번 총 가위질 9번이 필요합니다.
//			입출력 예 #3
//
//			이미 1 * 1 크기이므로 0을 return 합니다.
	
			public int solution(int M, int N) {
				
		//      가로 : M , 세로 : N 이라고 정했을 때,
		//      세로의 길이에서 가위질이 필요한 횟수는 N-1 이다.
		         
		//      가로에서 필요한 가위질의 횟수는 M == 1 경우와 M != 1 경우로 나뉘는데,
		//      M == 1 경우, 세로의 가위질 횟수(n - 1)을 return.
		//      M != 1 경우, (M-1) + ((n-1) * 2)을 return 한다.
		     
		//      위 수식을 짧게 정리하면 아래와 같다.
		     
		     
		     int answer = (M * N) - 1;
		     return answer;
				
			}
	
}
