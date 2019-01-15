/*
 * 여러 개의 쇠막대기를 레이저로 절단하려고 합니다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고, 레이저를 위에서 수직으로 발사하여 쇠막대기들을 자릅니다. 쇠막대기와 레이저의 배치는 다음 조건을 만족합니다.
 * - 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있습니다.
 * - 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치지 않도록 놓습니다.
 * - 각 쇠막대기를 자르는 레이저는 적어도 하나 존재합니다.
 * - 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않습니다.
 * 이러한 레이저와 쇠막대기의 배치는 다음과 같이 괄호를 이용하여 왼쪽부터 순서대로 표현할 수 있습니다.
 * (a) 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍 '()'으로 표현합니다. 또한 모든 '()'는 반드시 레이저를 표현합니다.
 * (b) 쇠막대기의 왼쪽 끝은 여는 괄호 '('로, 오른쪽 끝은 닫힌 괄호 ')'로 표현됩니다.
 * 예시 "()(((()())(())()))(())"
 * 쇠막대기는 레이저에 의해 몇 개의 조각으로 잘리는데, 위 예에서 가장 위에 있는 두 개의 쇠막대기는 각각 3개와 2개의 조각으로 잘리고, 이와 같은 방식으로 주어진 쇠막대기들은 총 17개의 조각으로 잘립니다.
 * 쇠막대기와 레이저의 배치를 표현한 문자열 arrangement가 매개변수로 주어질 때, 잘린 쇠막대기 조각의 총 개수를 return 하도록 solution 함수를 작성해주세요.
 * 제한사항
 * arrangement의 길이는 최대 100,000입니다.
 * arrangement의 여는 괄호와 닫는 괄호는 항상 쌍을 이룹니다.
 */
package programmers.stack_queue.psq1;

import java.util.ArrayList;

// 레이저 배치(괄호)를 문자열로 저장하는 객체.
class Arrangements{
	private String[] arrangements;
	
	public Arrangements(int N) {
		arrangements = new String[N];
	}
	
	public String getArrangements(int i ) {
		return arrangements[i];
	}
	
	public void setArrangements(int i, String arrangement) {
		this.arrangements[i] = arrangement; 
	}
}

class Solution{
	public int solution(String arrangement) {
		int answer = 0;
		return answer;
	}
}

public class PSQ1 {
	public static void main(String[] args) {
		ArrayList<String> arrangement = new ArrayList<>();
		arrangement.add("()(((()())(())()))(())");
		
		Arrangements arrmnt = new Arrangements(arrangement.size());
		
		for(int i = 0; i < arrangement.size(); i++) {
			arrmnt.setArrangements(i, arrangement.get(i));
		}

		Solution sol = new Solution();
		for(int i = 0; i < arrangement.size(); i++) {
			System.out.println(sol.solution(arrmnt.getArrangements(i)));
		}
	}
}
