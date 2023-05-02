package gugudan;

import java.util.Scanner;

class exception {
	int num;
	
	
	public void exception(int dan) {
//		
//		while(true) { //예외 처리 
//			if(num <= 0 || num > 999) {
//				System.out.println("단 수를 다시 입력하세요");
//				num = in.nextInt();
//			}
//			else
//				break;
//		}
		for(int i=1; i<=9; i++){
			System.out.println(dan+"단 : "+dan+" X "+i+" = "+(dan*i));
		}
	}
	}
}
}

public class gugudanUpdate {
	public static void main(String[] args) {
//		int num = 0;
//		System.out.println("단 수를 입력하세요");
//		Scanner in = new Scanner(System.in); 
//		num = in.nextInt();
		Gugudan gu = new Gugudan();
		gu.makeGugudan(8); //원하는 단을 입력해도 된다
		
	}
	
	
