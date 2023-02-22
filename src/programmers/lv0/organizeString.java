package programmers.lv0;

import java.util.Arrays;

public class organizeString {

//	[문제 설명]
//	영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
//
//	제한사항
//	0 < my_string 길이 < 100
//	입출력 예
//	my_string	result
//	"Bcad"	"abcd"
//	"heLLo"	"ehllo"
//	"Python"	"hnopty"
	
	// 매개변수를 문자열 객체에 저장하면서 전체를 소문자화 시키는 toLowerCase() 함수를 수행시킴
	// 그 다음에 하나의 문자열을 split() 함수를 이용하여 알파벳 하나씩으로 나눠 배열에 저장
	// Arrays.sort() 함수를 이용하여 알파벳 순서대로 배열 인덱스를 정리시킴
	// array 배열에 반복문을 사용하고 초기화한 answer 문자열 객체에 인덱스 하나씩을 저장 후 최종 값을 return.
	
	class Solution {
	    public String solution(String my_string) {
	        String answer = my_string.toLowerCase();
	        
	        String[] array = answer.split("");    
	        Arrays.sort(array);
	        
	        answer = "";
			
			for(int i = 0; i < array.length; i++){
	            answer += array[i];
	        }
	        
	        return answer;
	    }
	}
	
}
