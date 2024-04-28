package btluongvaora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bai2 {
	
	public int nhapSo() throws IOException{
		InputStreamReader ISP = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ISP);
		return Integer.parseInt(br.readLine());
	}
	
	public int tong(int m) {
		int tong = 0;
		while(m > 0) {
			tong += m%10;
			m/=10;
		}
		return tong;
	}
	
	public int dao(int m) {
		String s = "";
		while(m > 0) {
			s += m%10;
			m/=10;
		}
		return Integer.parseInt(s);
	}
	
	public boolean ktFibo(int m) {
		int t1 = 1;
		int t2 = 1;
		int t = t1 + t2;
		while(t <= m) {
			if(t == m) {
				return true;
			}
			t1 = t2;
			t2 = t;
			t = t1 + t2;
		}
		return false;
	}
	
	public boolean ktDx(int m) {
		return m == dao(m);
	}

	public static void main(String[] args) throws IOException {
		bai2 bt = new bai2();
		while(true) {
			int m = bt.nhapSo();
			System.out.println(bt.tong(m));
			System.out.println(bt.dao(m));
			System.out.println(bt.ktFibo(m));
			System.out.println(bt.ktDx(m));
		}

	}

}
