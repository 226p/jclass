package j0124;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	ArrayList<Stu> list = new ArrayList<Stu>();
	Scanner scan = new Scanner(System.in);
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","순위"};
	
	// 0. 파일 읽어오기
	void fileRead() throws Exception{
		
		FileReader fr = new FileReader("c:/save/studata.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int no=0,kor=0,eng=0,math=0,total=0,rank=0;
		String name="";
		double avg=0;
		
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			rank = Integer.parseInt(str[7]);
			
			list.add(new Stu(no,name,kor,eng,math,total,avg,rank));
		
		}
		br.close();
		fr.close();
	} // 0번 끝
	
	
	// 1. 성적입력
		void input() {
			while(true) {
				System.out.println("[ 성적입력 ]");
				System.out.printf("<< %d번쨰 >>\n",list.size()+1);
				System.out.println("추가할 학생의 이름을 입력하세요. (- : 취소)  >>");
				String name = scan.next();
				
				if(name.equals("-")) {
					break;
				}
				System.out.println("국어점수를 입력하세요.");
				int kor = scan.nextInt();
				System.out.println("영어점수를 입력하세요.");
				int eng = scan.nextInt();
				System.out.println("수학점수를 입력하세요.");
				int math = scan.nextInt();
				list.add(new Stu(name, kor, eng, math));  // 최초 삽입하는 데이터는 set 안 써도 됨.
				
				System.out.printf("%d번째 학생의 데이터가 저장되었습니다.\n",list.size()+1);
				
			}
			
		} // 1번 끝
	
	
	// 2. list출력
	void listPrint() {
		System.out.println("\t\t         [ 성적출력 ]");
		System.out.println("-----------------------------------------------------------");
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),
					s.getEng(),s.getMath(),s.getTotal(),
					s.getAvg(),s.getRank());
		}
		System.out.println();
	} // 2번 끝
	
	
	// 3. 성적수정
		void stuUpdate() {
			int searchNo = 0;
			int temp = 0;
			System.out.println("[ 성적수정 ]");
			System.out.println("수정할 학생의 이름을 입력하세요.(- : 취소)");
			String input = scan.next();
			
			for(int i=0;i<list.size();i++) {
				Stu s = list.get(i);
				if(input.equals(s.getName())) {
					temp = 1;
					searchNo = i;
					
					if(temp==1) {
						System.out.printf("%s 님의 데이터를 찾았습니다.\n",input);
						System.out.println("1. 국어성적 수정");
						System.out.println("2. 영어성적 수정");
						System.out.println("3. 수학성적 수정");
						System.out.println("수정할 과목을 정해주세요.  >>");
						System.out.println("----------------------------------------------");
						int up_n = scan.nextInt();
						
							if(up_n==1) {
								System.out.println("[ 국어점수 수정 ]");
								System.out.printf("기존 국어점수 : %d\n",s.getKor());
								System.out.print("변경 국어점수 : ");
								s.setKor(scan.nextInt());
							}
							else if(up_n==2) {
								System.out.println("[ 영어점수 수정 ]");
								System.out.printf("기존 영어점수 : %d\n",s.getEng());
								System.out.print("변경 영어점수 : ");
								s.setEng(scan.nextInt());
							}
							else if(up_n==3) {
								System.out.println("[ 수학점수 수정 ]");
								System.out.printf("기존 수학점수 : %d\n",s.getMath());
								System.out.print("변경 수학점수 : ");
								s.setMath(scan.nextInt());
							}// 국영수 if문
							
							System.out.println("수정이 완료되었습니다.");
							
							s.setTotal(s.getKor()+s.getEng()+s.getMath());
							s.setAvg(s.getTotal()/3.0);
							
							break;
							
						} // temp if문
					} // equals if문
			} // for문
			if(temp==0){
				System.out.printf("%s 님의 데이터가 없습니다. 다시 확인하세요.\n",input);
			}
		} // 3번 끝
	
		
	// 4. 성적삭제
	void stuDelete() {
		int searchNo = 0;
		int temp = 0;
		System.out.println("[ 성적삭제 ]");
		System.out.println("삭제할 학생의 이름을 입력하세요. (- : 취소)");
		String input = scan.next();
		
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(input.equals(s.getName())) {
				temp = 1;
				searchNo = i;
				
				if(temp==1) {
					System.out.printf("%s 님의 데이터를 찾았습니다. 정말로 삭제하겠습니까? (삭제 : 1, 취소 : 0)\n",input);
					int agree = scan.nextInt();
					if(agree==1) {
						System.out.println("정상적으로 삭제되었습니다.");
						list.remove(i);
					}else if(agree==0) {
						System.out.println("이전화면으로 돌아갑니다.");
						break;
					}
					
				} // temp if문
			} // equals if문
		} // for문
		if(temp==0){
			System.out.printf("%s 님의 데이터가 없습니다. 다시 확인하세요.\n",input);
		}
	} // 4번 끝
	
	
	// 5. 성적검색
	void search() {
		int searchNo = 0;
		int temp = 0;
		System.out.println("[ 성적검색 ]");
		System.out.println("검색할 학생의 이름을 입력하세요. (- : 취소)");
		String input = scan.next();
		
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(input.equals(s.getName())) {
				temp = 1;
				searchNo = i;
				for(int j=0;j<title.length;j++) {
					System.out.printf("%s\t",title[j]);
				}
//				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s[i]);   // 여기서부터 하기
			}
		}
	} // 5번 끝
	
	
	// 6. 등수정렬 
		void orderByrank() {
			System.out.println("[ 등수정렬 ]");
		} // 6번 끝
		
		
	// 7. 이름정렬 
		void orderByName() {
			System.out.println("[ 이름정렬 ]");
		} // 7번 끝
	
		
	// 8. 등수처리
	void ranking() {
		System.out.println("[ 등수처리 ]");
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			int rankC = 1;
			for(int j=0;j<list.size();j++) {
				Stu s2 = list.get(j);
				if(s.getTotal()<s2.getTotal()) {
					rankC++;
				}
			}
			s.setRank(rankC);
		}
		System.out.println("등수처리가 완료되었습니다.");
	} // 8번 끝
	
	
	// 9. 파일저장
	void filesave() throws Exception {
		FileWriter fw = new FileWriter("c:/save/studata.txt");  // false(기본) 덮어쓰기, true 이어쓰기
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			String stu = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n", s.getNo(),
						s.getName(),s.getKor(),s.getEng(),
						s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
			bw.write(stu);
		}
		System.out.println("파일이 정상적으로 저장되었습니다.");
		
		bw.close();
		fw.close();
	} // 9번 끝
	
	
	
	
	
	
	
	
	
	
	
	
}
