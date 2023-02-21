package programmers.lv0;

public class cutAndStoreAsArray {
	
	//	문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
	//
	//	제한사항
	//	1 ≤ my_str의 길이 ≤ 100
	//	1 ≤ n ≤ my_str의 길이
	//	my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
	//	입출력 예
	//	my_str	n	result
	//	"abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
	//	"abcdef123"	3	["abc", "def", "123"]
	
	public String[] solution(String str, int n) {
        
        
        // 반복문의 횟수 :
        // 1. str의 길이와 n 값의 나머지가 0 일때
        // 2. str의 길이와 n 값의 나머지가 0 이 아닐때
        
        int strN = str.length();
        
        int loop = 0;
        
        if(strN % n != 0) {
			loop = (strN / n) + 1;
		} else {
			loop = (strN / n);
		}
        
        
        // 배열의 길이는 위에서 계산한 반복문의 크기 만큼 지정
        String[] array = new String[loop];
        
        // 문자열 str의 인덱스 값 설정.
        int index = 0;
        
        for(int i = 0; i < array.length; i++) {
			
				
				if(index + n <= strN) { // 인덱스 값 + 잘라야하는 문자열의 길이가 최대문자열 보다 작은 경우
					array[i] = str.substring(index, index + n);
					index += n;
				} else { // 인덱스 값 + 잘라야하는 문자열의 길이가 최대문자열 보다 큰 경우
					array[i] = str.substring(index); // 해당 인덱스부터 가장 마지막 인덱스까지 자른 후 배열에 저장
				}

			
		}
        
        return array;
    }

}
