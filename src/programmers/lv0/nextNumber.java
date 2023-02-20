package programmers.lv0;

public class nextNumber {

//			등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
//
//			제한사항
//			2 < common의 길이 < 1,000
//			-1,000 < common의 원소 < 2,000
//			common의 원소는 모두 정수입니다.
//			등차수열 혹은 등비수열이 아닌 경우는 없습니다.
//			등비수열인 경우 공비는 0이 아닌 정수입니다.
//			입출력 예
//			common	result
//			[1, 2, 3, 4]	5
//			[2, 4, 8]	16
	
			public int Solution(int[] common) {
				int answer = 0;
				
				// 등차수열인지 등비수열인지 알아내기 위한 값을 셋팅.
//				// a의 값과 b의 값이 동일한 경우 등차수열, 아닌 경우 등비수열
//				// 등비수열일 경우 numberArray[2] 값과 numberArray[1] 값을 나눈 몫이 비가 된다.
				
				int a = common[2] - common[1];
				int b = common[1] - common[0];
				
				//배열의 가장 마지막 값 (해당 배열의 length - 1값)
				int lastValue = common[common.length - 1];
				
				if(a == b) {
					answer = common[2] - common[1];
					
					return lastValue + answer;
					
				} else {
					answer = common[2] / common[1];
					return lastValue * answer;
				}
				
		
			}
	
	
	
	
}
