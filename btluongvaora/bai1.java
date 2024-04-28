package btluongvaora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class bai1 {
	
	public String nhapChuoi() throws IOException{
		InputStreamReader ISP = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ISP);
		String s = br.readLine();
		return s;
	}
	
	public String inHoa(String s) {
		String r = "";
		for(char c : s.toCharArray()) {
			if(c >= 'a' && c <= 'z') {
				c -= 32;
			}
			r += c ;
			
		}
		return r;
	}
	
	public String inThuong(String s) {
		String r = "";
		for(char c : s.toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				c += 32;
			}
			r += c ;
		}
		return r;
	}
	public String hoaThuong(String s) {
		String r = "";
		for(char c : s.toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				c += 32;	
			}
			else if (c >= 'a' && c <= 'z'){
				c -= 32;
			}
			r+=c;
		}
		return r;
	}
	
	public String dao(String s) {
		String r ="";
		for (int i = s.length() - 1; i >= 0 ;i-- ) {
			r += s.charAt(i);
		}
		return r;
	}
	
	public void tanSuat(String s) {
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		for(char c : s.toCharArray()) {
			mp.put(c, mp.getOrDefault(c, 0) + 1 );
		}
		for(char c : mp.keySet()) {
			System.out.println(c +":" + mp.get(c));
		}
	}
	
	public int demTu(String s) {
		int count = 0;
		for(char c : s.toCharArray()) {
			if(c == ' ') {
				count ++;
			}
		}
		return count + 1;
	}

	public static void main(String[] args) throws IOException {
		bai1 bt = new bai1();
		while(true) {
			String s = bt.nhapChuoi();
			System.out.println(bt.inThuong(s));
			System.out.println(bt.inHoa(s));
			System.out.println(bt.dao(s));
			System.out.println(bt.hoaThuong(s));
			System.out.println(bt.demTu(s));
			bt.tanSuat(s);
		}

	}

}
