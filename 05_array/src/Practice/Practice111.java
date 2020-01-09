package Practice;

public class Practice111 {

	public static void main(String[] args) {
		int num[]= new int[50];
		int alpha[]=new int[26];
		for(int i =0;i<num.length;i++) {
			char ch = (char)(Math.random()*26+65);
			alpha[ch-'A']++;
			System.out.print(ch);
			if(i%10==0)System.out.println();
		}
	}

}
