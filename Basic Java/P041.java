package BasicJava;

class P041 {
    // 백준 15596
    long sum(int[] a) {
        long sum = 0;	// a 배열 정수 합 변수

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
