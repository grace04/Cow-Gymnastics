import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Gymnastics {
	BufferedReader reader;
	PrintWriter out;
	String line;
	String[] l;
	int k;
	int n;
	String[] s;
	ArrayList<Integer> x = new ArrayList<Integer>();
	ArrayList<String> p1 = new ArrayList<String>();
	ArrayList<String> p2 = new ArrayList<String>();
	ArrayList<String> p3 = new ArrayList<String>();
	ArrayList<String> p4 = new ArrayList<String>();
	ArrayList<String> p5 = new ArrayList<String>();
	ArrayList<String> p6 = new ArrayList<String>();
	ArrayList<String> p7 = new ArrayList<String>();
	ArrayList<String> p8 = new ArrayList<String>();
	ArrayList<String> p9 = new ArrayList<String>();
	ArrayList<String> p10 = new ArrayList<String>();
	ArrayList<String> pf = new ArrayList<String>();
	
	public static void main(String[] args) {
		Gymnastics gym = new Gymnastics();
		gym.run();
	}
	
	void run() {
		try {
			reader = new BufferedReader(new FileReader("gymnastics.in"));
			line = reader.readLine();
			l = line.split(" ");
			k = Integer.parseInt(l[0]);
			n = Integer.parseInt(l[1]);
			
			s = reader.readLine().split(" ");
			p1();
			s = reader.readLine().split(" ");
			p2();
			s = reader.readLine().split(" ");
			p3();
			s = reader.readLine().split(" ");
			p4();
			s = reader.readLine().split(" ");
			p5();
			s = reader.readLine().split(" ");
			p6();
			s = reader.readLine().split(" ");
			p7();
			s = reader.readLine().split(" ");
			p8();
			s = reader.readLine().split(" ");
			p9();
			s = reader.readLine().split(" ");
			p10();
			
			out = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));
			out.write(pfinal());
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void p1() {
		for(int j=0;j<n;j++) {
			x.add(Integer.parseInt(s[j]));
		}
		for(int j=0;j<x.size();j++) {
			for(int m=j+1;m<x.size();m++) {
				p1.add(""+x.get(j)+x.get(m));
			}
		}
	}
	void p2() {
		for(int j=0;j<n;j++) {
			x.add(Integer.parseInt(s[j]));
		}
		for(int j=0;j<x.size();j++) {
			for(int m=j+1;m<x.size();m++) {
				p2.add(""+x.get(j)+x.get(m));
			}
		}
	}
	void p3() {
		for(int j=0;j<n;j++) {
			x.add(Integer.parseInt(s[j]));
		}
		for(int j=0;j<x.size();j++) {
			for(int m=j+1;m<x.size();m++) {
				p3.add(""+x.get(j)+x.get(m));
			}
		}
	}
	void p4() {
		for(int j=0;j<n;j++) {
			x.add(Integer.parseInt(s[j]));
		}
		for(int j=0;j<x.size();j++) {
			for(int m=j+1;m<x.size();m++) {
				p4.add(""+x.get(j)+x.get(m));
			}
		}
	}
	void p5() {
		for(int j=0;j<n;j++) {
			x.add(Integer.parseInt(s[j]));
		}
		for(int j=0;j<x.size();j++) {
			for(int m=j+1;m<x.size();m++) {
				p5.add(""+x.get(j)+x.get(m));
			}
		}
	}
	void p6() {
		for(int j=0;j<n;j++) {
			x.add(Integer.parseInt(s[j]));
		}
		for(int j=0;j<x.size();j++) {
			for(int m=j+1;m<x.size();m++) {
				p6.add(""+x.get(j)+x.get(m));
			}
		}
	}
	void p7() {
		for(int j=0;j<n;j++) {
			x.add(Integer.parseInt(s[j]));
		}
		for(int j=0;j<x.size();j++) {
			for(int m=j+1;m<x.size();m++) {
				p7.add(""+x.get(j)+x.get(m));
			}
		}
	}
	void p8() {
		for(int j=0;j<n;j++) {
			x.add(Integer.parseInt(s[j]));
		}
		for(int j=0;j<x.size();j++) {
			for(int m=j+1;m<x.size();m++) {
				p8.add(""+x.get(j)+x.get(m));
			}
		}
	}
	void p9() {
		for(int j=0;j<n;j++) {
			x.add(Integer.parseInt(s[j]));
		}
		for(int j=0;j<x.size();j++) {
			for(int m=j+1;m<x.size();m++) {
				p9.add(""+x.get(j)+x.get(m));
			}
		}
	}
	void p10() {
		for(int j=0;j<n;j++) {
			x.add(Integer.parseInt(s[j]));
		}
		for(int j=0;j<x.size();j++) {
			for(int m=j+1;m<x.size();m++) {
				p10.add(""+x.get(j)+x.get(m));
			}
		}
	}
	
	Integer pfinal() {
		for(int i=0;i<p1.size();i++) {
			if(p2.contains(p1.get(i))&&p3.contains(p1.get(i))&&p4.contains(p1.get(i))
					&&p5.contains(p1.get(i))&&p6.contains(p1.get(i))&&p7.contains(p1.get(i))
					&&p8.contains(p1.get(i))&&p9.contains(p1.get(i))&&p10.contains(p1.get(i))){
				pf.add(p1.get(i));
			}
		}
		return pf.size();
	}
}
