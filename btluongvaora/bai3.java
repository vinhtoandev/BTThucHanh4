package btluongvaora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bai3 {
	private int[] a = new int[100];
	private int n;
	
	public static int nhapSo() throws NumberFormatException, IOException {
		InputStreamReader ISP = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ISP);
		return Integer.parseInt(br.readLine());
	}
	
	public void nhapMang() throws NumberFormatException, IOException {
		System.out.println("Nhap so phan tu : ");
		n = nhapSo();
		for (int i = 0; i < n ; i++) {
			System.out.println("Nhap phan tu a[" + i + "] = ");
			a[i] = nhapSo();
		}
	}
	
	public int tongLe() {
		int sum = 0;
		for(int i : a) {
			if(i % 2 == 1) {
			sum += i;
			}
		}
		return sum;
	}
	
	public int timKiem(int k) {
		for(int i = 0; i < n; i++) {
			if(a[i] == k) return i;
		}
		return -1;
	}
	
	public void sapXep() {
		for (int i = 0 ;i < n; i++) {
			for (int j = i + 1; j < n ;j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public void chenPhanTu(int p) {
		int pivot =  0 ;
		int ok = 0;
		for (int i = 0; i < n; i++) {
			if(a[i] > p) {
				pivot = i;
				ok = 1;
				break;
			}
		}
		if(ok == 0) {
			pivot = n;
		}
		n++;
		for (int i = n + 1; i >= pivot + 1 ;i--) {
			a[i] = a[i - 1];
		}
		a[pivot] = p;
	}
	
	public void show() {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		bai3 bt = new bai3();
		
			bt.nhapMang();
			System.out.println(bt.tongLe());
			int k = nhapSo();
			System.out.println(bt.timKiem(k));
			bt.sapXep();
			bt.show();
			bt.chenPhanTu(0);
			bt.show();
			
		

	}

}
