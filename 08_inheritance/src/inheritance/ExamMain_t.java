package inheritance;

import java.util.Scanner;

public class ExamMain_t {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수 입력 : ");
		int size = sc.nextInt();
		Exam_t[] exam = new Exam_t[size]; //객체배열
		for(int i =0; i<size; i++) {
			exam[i] = new Exam_t(); //클래스 생성 + 생성자 호출
			exam[i].compare();
		}
		System.out.println("이름\t1 2 3 4 5\t점수");
		for(int i =0; i<size; i++) {
			System.out.print(exam[i].getName()+"\t");
			for(int j=0; j<exam[i].getOx().length; j++) {
				System.out.print(exam[i].getOx()[j]+" ");
			}
			System.out.println("\t"+exam[i].getScore());
		}//for
		
	}//main

}//ExamMain
