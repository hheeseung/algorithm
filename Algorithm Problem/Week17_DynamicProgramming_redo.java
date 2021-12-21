package AlgorithmProblem;

// 프로그래머스 - 등굣길 (https://programmers.co.kr/learn/courses/30/lessons/42898)
public class Week17_DynamicProgramming_redo {
  public int solution(int m, int n, int[][] puddles) {
    int[][] route = new int[n+1][m+1];
    route[1][1] = 1;

    for(int i = 0; i < puddles.length; i++) {
      route[puddles[i][1]][puddles[i][0]] = -1;
    }

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= m; j++) {
        if(route[i][j] == -1) {
          continue;
        }
        if(route[i-1][j] >= 0 && route[i][j] >= 0) {
          route[i][j] += route[i-1][j] % 1000000007;
        }
        if(route[i][j-1] >= 0 && route[i][j] >= 0) {
          route[i][j] += route[i][j-1] % 1000000007;
        }
      }
    }

    return route[n][m] % 1000000007;
  }
}