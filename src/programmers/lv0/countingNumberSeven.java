package programmers.lv0;

public class countingNumberSeven {
	
//	7의 개수
//	문제 설명
//	머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
//
//	제한사항
//	1 ≤ array의 길이 ≤ 100
//	0 ≤ array의 원소 ≤ 100,000
//	입출력 예
//	array	result
//	[7, 77, 17]	4
//	[10, 29]	0
//	입출력 예 설명
//	입출력 예 #1
//
//	[7, 77, 17]에는 7이 4개 있으므로 4를 return 합니다.
//	입출력 예 #2
//
//	[10, 29]에는 7이 없으므로 0을 return 합니다.
	
	public int solution(int[] array) {
		
//		[풀이 계획]
//		배열안에 저장된 문자열을
//		빈 문자열(arrayString)에 전부 합하여 하나의 문자열을 만든 다음,
//		split() 함수를 사용하여 문자열을 1자리씩 나누고
//		해당 배열에 반복문을 사용하여
//		주어진 array에 포함된 7의 개수를 찾아내기.
		
		// 단, 주어지는 array의 데이터 타입이 int 이므로 arrayString으로 합산할 때에 데이터 타입 변경이 필요함!
		
		int answer = 0;
		        
        String arrayString = "";
        
        for(int i = 0; i < array.length; i++){
            String intString = String.valueOf(array[i]);
            arrayString += intString;
        }
        
        String[] numberArray = arrayString.split("");
        
        
        for(int i = 0; i < numberArray.length; i++){
            if(numberArray[i].equals("7")){
                answer++;
            }
        }
        
        return answer;
	}

}
