package programmers.lv0;

public class squareNumberDiscrimination {
	
//	[제곱수 판별하기]
//	문제 설명
//	어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
//
//	제한사항
//	1 ≤ n ≤ 1,000,000
//	입출력 예
//	n	result
//	144	1
//	976	2
//	입출력 예 설명
//	입출력 예 #1
//
//	144는 12의 제곱이므로 제곱수입니다. 따라서 1을 return합니다.
//	입출력 예 #2
//
//	976은 제곱수가 아닙니다. 따라서 2를 return합니다.
	
//	[문제풀이 계획]
//	제곱수의 특징 : 주어진 값과 나누었을 때 몫이 주어진 값과 동일함.
//	이 특성을 활용하여 주어진 값 n을 i로 나누었을때, 몫이 i와 동일한 값이라면 해당 수를 제곱수로 판별하기로 함.
//	단, i * i 가 주어진 값 n을 넘어갔을 경우에는 이미 제곱수가 아니므로,
//	반복문이 종료될 수 있도록 break 조건을 추가해둠.
	
	public int solution(int n) {
        int value = 2;
        
        for(int  i = 1; i <= n; i++){
            
            if(i * i > n){
                break;
            }
            
            double squareNumber = n / ( i + 0.0);
            
            if(squareNumber == i){
                value = 1;
                break;
            } else {
                continue;
            }
            
        }
        
        return value;
    }
	

}
