package programmers.lv0;

public class stringPush {
	
	// [문자열 밀기]
	//	문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
	//
	//	제한사항
	//	0 < A의 길이 = B의 길이 < 100
	//	A, B는 알파벳 소문자로 이루어져 있습니다.
	
	//	[입출력 예]
	//	A	     B	       result
	//	"hello"	 "ohell"   1
	//	"apple"	 "elppa"   -1
	//	"atat"	 "tata"	   1
	//	"abc"	 "abc"	   0
	
	//	입출력 예 설명
	//	입출력 예 #1
	//
	//	"hello"를 오른쪽으로 한 칸 밀면 "ohell"가 됩니다.
	//	입출력 예 #2
	//
	//	"apple"은 몇 번을 밀어도 "elppa"가 될 수 없습니다.
	//	입출력 예 #3
	//
	//	"atat"는 오른쪽으로 한 칸, 세 칸을 밀면 "tata"가 되므로 최소 횟수인 1을 반환합니다.
	//	입출력 예 #4
	//
	//	"abc"는 밀지 않아도 "abc"이므로 0을 반환합니다.
	
		public int solution(String A, String B) {
			int result = 0;
	        
	        // 문자열의 인덱스 0번과 마지막 인덱스(A.length()-1)이 계속 변경되는 형태이기 때문에
	        // 문자열의 합산을 이용하여 A[0]과 A[1~ A.length()-1] 인덱스의 블록 형태를 이용하여
	        // 값을 교환하는 형식으로 코드를 구성하였음.
	        
	        // 문자열이 조합될 빈 문자열 생성
	        String emptyString = "";
	        
	        // A 문자열의 길이만큼 반복
	        while(result < A.length()){
	            
	            String x = A.substring(0, 1);
	            String y = A.substring(1);
	            
	            emptyString = x+y;
	            
	            if(B.equals(emptyString)){ // 구성한 문자열이 B와 같다면 반복문 탈출
	                break;
	            } else { // 같지 않을 경우,
	                result++;
	                emptyString = ""; // 문자열 초기화
	                
	                
	                // 문자열의 구성을 한자리씩 변경함
	                x = A.substring(A.length()-1);
	                y = A.substring(0, A.length()-1);
	                
	                A = x + y ;
	                
	            }
	            
	        }
	        
	        
	        // 문자열의 길이만큼 반복을 하여도 While의 탈출조건이 발생하지 않았다면, 구성될 수 없는 문자열
	        // 따라서 result 값에 -1을 저장하고 return
	        if(result == A.length()){
	            result = -1;
	        }
	        
	        return result;
	}

	

	
}
