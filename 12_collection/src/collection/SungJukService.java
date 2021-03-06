package collection;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("##.###");
	public void menu() {
		while (true) {
			System.out.println("*****************");
			System.out.println(" 1.입력");
			System.out.println(" 2.출력");
			System.out.println(" 3.검색");
			System.out.println(" 4.삭제");
			System.out.println(" 5.정렬");
			System.out.println(" 6.끝");
			System.out.println("*****************");
			int choice = sc.nextInt();
			if (choice < 1 || choice > 6) {
				System.out.println("1~6중에 선택하세요");
				continue;
			}//if
			else if(choice==6) {System.out.println("끝");break;}
			else if(choice==1) insertArticle();
			else if(choice==2) printArticle();
			else if(choice==3) searchArticle();
			else if(choice==4) deleteArticle();
			else if(choice==5) sortArticle();
		}//while
	}

	private void insertArticle() {
		//입력
		SungJukDTO dto = new SungJukDTO();
		System.out.print("번호 입력 :");
		dto.setNumber(sc.nextInt());
		System.out.print("이름 입력 :");
		dto.setName(sc.next());
		System.out.print("국어 입력 :");
		dto.setKor(sc.nextInt());
		System.out.print("영어 입력 :");
		dto.setEng(sc.nextInt());
		System.out.print("수학 입력 :");
		dto.setMath(sc.nextInt());

		list.add(dto);
	}

	private void printArticle() {
		//출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO data: list) {
			System.out.println(data.getNumber()+"\t"+data.getName()+"\t"+data.getKor()+"\t"+data.getEng()+"\t"+data.getMath()+"\t"+data.getTot()+"\t"+data.getAvg());
		}
	}

	private void searchArticle() {
		//검색
		System.out.print("검색 할 이름 입력 : ");
		String inputName = sc.next();
		int count=0;
		for(int i=0;i<list.size();i++) {
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			if(list.get(i).getName().equals(inputName)) {
				System.out.println(list.get(i).getNumber()+"\t"+list.get(i).getName()+"\t"+list.get(i).getKor()+"\t"+list.get(i).getEng()+"\t"+list.get(i).getMath()+"\t"+list.get(i).getTot()+"\t"+list.get(i).getAvg());
				//System.out.println(list);
				count++;
			}
		}
		if(count==0)System.out.println("찾고자 하는 사람이 없습니다.");
		//for
	}

	private void deleteArticle() {
		//삭제
		System.out.print("삭제 할 이름 입력 : ");
		String inputName = sc.next();
		int count=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(inputName)) {
				list.remove(i);
				count++;
				i--;
			}
		}
		if(count==0) System.out.println("삭제할 데이터가 없습니다.");
		else if(count!=0) System.out.println("데이터를 "+count+"개 삭제하였습니다.");
	}

	private void sortArticle() {
		//정렬
		System.out.println("1. 이름으로 오름차순");
		System.out.println("2. 총점으로 내림차순");
		System.out.println("3. 이전메뉴");
		System.out.print("번호 입력: ");
		int choice = sc.nextInt();
		if(choice==3)return;
		else if(choice==1) {//1. 이름으로 오름차순
			
			Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
				@Override
				public int compare(SungJukDTO o1, SungJukDTO o2) {
					return o1.getName().compareTo(o2.getName());//문자열 비교 - 오름차순
				}
			};	
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			for(SungJukDTO data : list) {
				System.out.println(data);
				//System.out.println(data.getNumber()+"\t"+data.getName()+"\t"+data.getKor()+"\t"+data.getEng()+"\t"+data.getMath()+"\t"+data.getTot()+"\t"+data.getAvg());
			}
		}else if(choice==2) {//2. 총점으로 내림차순
			Collections.sort(list,Collections.reverseOrder());
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			for(SungJukDTO data : list) {
				System.out.println(data);
				//System.out.println(data.getNumber()+"\t"+data.getName()+"\t"+data.getKor()+"\t"+data.getEng()+"\t"+data.getMath()+"\t"+data.getTot()+"\t"+data.getAvg());
			}
		}
	}
	
}//class
