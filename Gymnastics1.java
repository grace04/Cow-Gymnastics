import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gymnastics1 {
	BufferedReader reader;
	PrintWriter out;
	String line;
	File file = new File("gymnastics.in");
	
	int n;
	int k;
	int arr[][] = new int[10][20];
	
	public static void main(String[] args) {
		Gymnastics1 gym = new Gymnastics1();
		gym.run();
	}
	
	void run() {
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(file.exists());
		System.out.println(file.canRead());
		
		try {
			reader = new BufferedReader(new FileReader(file));
			line = reader.readLine();
			String[] firstLine = line.split(" ");
			System.out.println(firstLine[0]);
			n = Integer.parseInt(firstLine[0]);
			k = Integer.parseInt(firstLine[1]);
			String s;
			String[] str;
			for(int i=0;i<k;i++) {
				for(int j=0;j<n;j++) {
					s = reader.readLine();
					str = s.split(" ");
					for(int l=0;l<str.length;l++) {
						arr[i][j] = Integer.parseInt(str[l]);
					}
				}
			}
			
			int ans = 0;
			for (int i=1;i<=n;i++) {
			    for (int j=1;j<=n;j++) {
			      if (nBetter(i,j)==k)
			    	  ans++;
				}
			}
			System.out.println(ans);
			
			out = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));
			out.write(ans);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	boolean isBetter(int x, int y, int ses) {
		int a = -1;
		int b = -1;
		for(int i=0;i<n;i++) {
			if(arr[ses][i]==a)
				a = i;
			if(arr[ses][i]==b)
				b = i;
		}
		return a<b;
	}
	
	int nBetter(int a, int b) {
		int total = 0;
		for(int i=0;i<k;i++) {
			if(isBetter(a,b,i))
				total++;
		}
		return total;
	}
}