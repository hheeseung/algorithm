package AlgorithmProblem;

// 프로그래머스 - 등굣길 (https://programmers.co.kr/learn/courses/30/lessons/42898)
public class Week09_DynamicProgramming {
  public int solution(int m, int n, int[][] puddles) {
    int[][] path = new int[n+1][m+1];
    path[1][1] = 1; // 출발점

    for (int i = 0; i < puddles.length; i++) {
      path[puddles[i][1]][puddles[i][0]] = -1; // 웅덩이: -1로 설정
    }

    for(int i = 0; i <= n; i++) {
      for(int j = 0; j <= m; j++) {
        if(path[i][j] == -1) {
          path[i][j] = 0; // 웅덩이를 만났다: 값을 0으로 줌
          continue;
        }
        if(i != 0) { // 맨 위가 아니다: 위쪽 값을 더해줌
          path[i][j] += path[i-1][j] % 1000000007;
        }
        if(j != 0) { // 맨 왼쪽이 아니다: 왼쪽 값을 더해줌
          path[i][j] += path[i][j-1] % 1000000007;
        }
      }
    }
    return path[n][m] % 1000000007;
  }
}
