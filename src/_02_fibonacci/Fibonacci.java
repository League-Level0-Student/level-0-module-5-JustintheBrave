package _02_fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int yeet=0;
int fortnite=1;
int haha=0;

System.out.println("0");
System.out.println("1");

for(int i=0;i<10;i++) {
	System.out.println(yeet + fortnite + haha);
	haha=yeet+fortnite;
	yeet=fortnite;
	fortnite=haha;
			
}
	}

}
