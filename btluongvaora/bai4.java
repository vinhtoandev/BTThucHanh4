package btluongvaora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bai4 {

	private int[][] a = new int[100][100];
	private int n, m;
	
	public static int nhapSo() throws NumberFormatException, IOException {
		InputStreamReader ISP = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ISP);
		return Integer.parseInt(br.readLine());
	}
	
	public void nhapMaTran() throws NumberFormatException, IOException {
		System.out.println("Nhap so hang : ");
		n = nhapSo();
		System.out.println("Nhap so cot: ");
		m = nhapSo();
		for (int i = 0; i < n ; i++) {
			for (int j = 0 ; j < m ; j++) {
				a[i][j] = nhapSo();
			}
		}
	}
	
	
	
	public int tichBoi3() {
		int p = 1;
		int i = 0;
		for (int j = 0; j < m ; j++) {
			if(a[i][j] % 3 == 0) {
				p = p * a[i][j];
			}
		}
		if (p == 1) return -1;
		return p;
	}
	
	public int[] taoMang() {
		int b[] = new int[n];
		for(int i = 0; i < n ;i++) {
			int max = a[i][0];
			for (int j = 0 ; j < m ; j++) {
				if(a[i][j] > max) {
					max = a[i][j];
				}
			}
			b[i] = max;
		}
		return b;
	}
	public void xoa(int b[]) {
		int tam;
		for (int i = 0; i < n - 1 ; i++ ) {
			tam = b[i + 1];
			b[i] = b[i + 1];
		}
		for (int i = 0 ; i <  n - 1; i ++) {
			System.out.print(b[i] + " ");
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		bai4 bt = new bai4();
		
		bt.nhapMaTran();
		System.out.println(bt.tichBoi3());
		int[] b = bt.taoMang();
		for (int i = 0; i < bt.n ; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		bt.xoa(b);

	}

}
