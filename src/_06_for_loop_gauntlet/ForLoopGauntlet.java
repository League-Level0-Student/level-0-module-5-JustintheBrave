package _06_for_loop_gauntlet;

public class ForLoopGauntlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0-100
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		//100-0
		for (int j = 100; j > -1; j--) {
				System.out.println(j);
			}
		//even 2-100
		for (int o = 2; o < 101; o++) {
			if(o%2==0) {
				System.out.println(o);
			}
		}
		
		//odd 1-99
		for (int p = 1; p < 100; p++) {
			if(p%2==1) {
				System.out.println(p);
			}
		}
		
		//1-100(is even/odd)
		for (int l = 0; l < 101; l++) {
			if(l%2==1) {
				System.out.println(l + " is odd");
			}
			else {
				System.out.println(l + " is even");
			}
		}
		
		//7-777 multiples of 7 only
		for (int k = 0; k < 778; k++) {
			if(k%7==0) {
				System.out.println(k);
			}
		}	
		
		//years alive and age then
		for (int u = 2007; u < 2021; u++) {
			System.out.println("In " + u + " I was " + (u-2007) + " years old");
		}
		
		//0000011112222
			for (int q = 0; q < 3; q++) {
				for (int w = 0; w < 3; w++) {
					System.out.println(q + " " + w);
				}
			}
			
		//3x3 123456789
			for (int e = 0; e < ; e++) {
				
			}
			
			
		}
	}


