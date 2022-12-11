package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			for(int i = input; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= input - 1; i++) {
			sum += i;
			System.out.print(i + " + ");
		}
		
		sum += input;
		
		System.out.print(input +  " = " + sum);
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int one = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int two = sc.nextInt();
		
		if(one <= 0 || two <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if(one > two) {
				for(int i = two; i <= one; i++) {
					System.out.print(i + " ");
				}
			} else if (one < two) {
				for(int i = one; i <= two; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println(one);
			}
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + "단 =====");
		
		for(int num = 1; num <= 9; num++) {
			System.out.println(dan + " * " + num + " = " + dan * num);
		}
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(2 <= input && input <= 9) {
			for(int dan = input; dan <= 9; dan++) {
				
				System.out.println("=====" + dan + "단 =====");
				
				for(int su = 1; su <= 9; su++) {
					System.out.println(dan + " X " + su + " = " + dan * su);
				}
				System.out.println();
			}
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int br = 1; br <= input; br++) {
			for(int i = 1; i <= br; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int br = input; br >= 1; br--) {
			for(int i = 1; i <= br; i++) {
				System.out.print("*");
			}
			
			System.out.println();
		}	
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int br = input; br >= 1; br--) {
			int save = input - ( br - 1);
			
			for(int mt = br - 1; mt >= 1; mt--) {
				System.out.print(" ");
			}
			for(int x = 1; x <= save; x++) {
				System.out.print("*");
			}
			
			System.out.println();
		}	
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int a = 1; a <= i; a++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int x = input - 1; x >= 1; x--) {
			for(int y = x; y >= 1; y--) {
				System.out.print("*");	
			}
			
			System.out.println();
		}
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int br = input; br >= 1; br--) {
			int save = input - (br - 1);
			save = save + (save - 1);
			
			for(int a = 1; a <= br - 1; a++) {
				System.out.print(" ");
			}
			for(int b = 1; b <= save; b++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int br = input - 2; br >= 1; br--) {
			System.out.print("*");
			
			for(int i = 1; i <= input-2; i++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			System.out.println();
		}
		
		for(int i = 1; i <= input; i++) {
			System.out.print("*");
		}		
	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = input / 6;

		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print("count : " + count);
	}

	
	
}
