package algorithm;

import java.util.Scanner;

public class IfQuestion {
	/**
	 * ���� ��ó: ���� �˰��� if�� - ��и� ����
	 * x, y��ǥ�� ���� �Է����� �� ��� ��и鿡 ��ġ�ϴ��� �˾Ƴ��� ���α׷� �����
	 * 
	 */
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println(1);
		} else if(x < 0 && y > 0) {
			System.out.println(2);
		} else if(x < 0 && y < 0) {
			System.out.println(3);
		} else if(x > 0 && y < 0) {
			System.out.println(4);
		} else {
			System.out.println("���� �ʰ�");
		}

	}

}
