import java.util.ArrayList;
import java.util.Scanner;


public class WhitePages {
	
	ArrayList<WhitePagesObj> whitePageList = new ArrayList<WhitePagesObj>();
	ArrayList<WhitePagesOvl> whitePageListovl = new ArrayList<WhitePagesOvl>();
	
	//생성자
	public WhitePages() {
		whitePageList.add(new WhitePagesObj("김종현", "010-1111-1111"));
        whitePageList.add(new WhitePagesObj("곽영민", "010-2222-2222"));
        whitePageList.add(new WhitePagesObj("강동호", "010-3333-3333"));
        whitePageList.add(new WhitePagesObj("황민현", "010-4444-4444"));
        whitePageList.add(new WhitePagesObj("최민기", "010-5555-5555"));
        whitePageList.add(new WhitePagesObj("김남준", "010-6666-6666"));
        whitePageList.add(new WhitePagesObj("차은우", "010-7777-7777"));
        whitePageList.add(new WhitePagesObj("윤산하", "010-8888-8888"));
	}
	//전화번호 출력 메서드
	public void showList() {
		 System.out.println("\n============ 전화번호부   ===========");
	        System.out.println("=======================총 "+whitePageList.size()+"명");
	        for(WhitePagesObj item : whitePageList ){
	            System.out.println(item);
	        }
	        System.out.println("==========================END");
	}
	
	public void showListovl() {
		int i = 1;
		System.out.println("=======================총 "+whitePageListovl.size()+"명");
		 for(WhitePagesOvl item : whitePageListovl ){
	            System.out.println(i+". "+item);
	            i++;
	        }
		 System.out.println("==========================END");
	}
	
	//전화번호 추가
	public boolean addWhitePage(){ 
	       
        Scanner scn = new Scanner(System.in);
        System.out.print("이름을 입력해주세요:");
        String name = scn.nextLine();
        System.out.print("전화번호를 입력해주세요:");
        String teleNum = scn.nextLine();
       
        //System.out.println((whitePageList.contains(teleNum)));
        boolean booTeleChk = false;
        //전화번호 중복체크
        for(WhitePagesObj item : whitePageList){  //리스트에 있는 항목을 하나씩 가져옴
            if((item.getTeleNum().equals(teleNum))){ //전화번호 비교
                booTeleChk = true; //중복값이 있으면 다시 입력을 받습니다.
                System.out.println("입력하신 전화번호 [ "+ item.getTeleNum() + " ] 는 이미 존재하는 전화번호입니다.");
                System.out.println("해당 정보를 다시 입력해주세요 =>");
                break;
            }
        }
       
        if(!booTeleChk) whitePageList.add(new WhitePagesObj(name, teleNum));
       
        return booTeleChk;
    }
	//전화번호 삭제
	public boolean deleteWhitePage() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String Name = sc.nextLine();
		int count = 0;
		
		for(WhitePagesObj item : whitePageList) {
			if((item.getName().equals(Name))) {
				count++;
				whitePageListovl.add(new WhitePagesOvl(item.getName(), item.getTeleNum()));
			}
		}
		
		
		if(count == 0) {
			System.out.println("입력하신 정보가 없습니다.");
		}
		else if(count>1) {
			String num = overlap();
		
			for(WhitePagesObj item : whitePageList) {
				if((item.getTeleNum().equals(num))) {
					whitePageList.remove(item);
					break;
				}
			}
		}
		else if(count == 1) {
			for(WhitePagesObj item : whitePageList) {
				if((item.getName().equals(Name))) {
					whitePageList.remove(item);
					break;
				}
			}
		}
		
		whitePageListovl.clear();
		if(count == 0)
			return false;
		else
			return true;
	}
	
	//중복 이름
	public String overlap() {
		Scanner sc = new Scanner(System.in);
		showListovl();
		System.out.print("지울 사람의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		String TeleNum ="";
		int i = 0;
		
		for(WhitePagesOvl item : whitePageListovl) {
			if(i == num-1) {
				TeleNum = item.getTeleNum();
				break;
			}
			i++;
		}
		
		return TeleNum;
	}
	
	//전화번호 찾기
	public void searchWhitePage() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String Name = sc.nextLine();
		
		boolean booTeleChk = false;
		for(WhitePagesObj item : whitePageList) {
			if((item.getName().equals(Name))) {
				booTeleChk = true;
				System.out.println(item);
			}
		}
		if(!(booTeleChk)) {
			System.out.println("입력하신 정보가 없습니다.");
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체생성
		WhitePages whitepage = new WhitePages();
		
		//메뉴 반복
		while(true) {
			Scanner scn = new Scanner(System.in);
			System.out.println();
            System.out.println("======White Pages======");
            System.out.println("1. All list print ");
            System.out.println("2. White Pages Input ");
            System.out.println("3. White Pages Delete");
            System.out.println("4. White Pages Search");
            System.out.println("5. End White Pages   ");
            System.out.println("=======================");
            System.out.print("메뉴를 선택해주세요 :");
            int menuNum = scn.nextInt();
            
            
            switch (menuNum) {
            case 1:
                // 전화번호 리스트 보기 메서드 호출
                whitepage.showList();
               // System.out.println(" 계속 하려면 아무 키나 누르시오.");
                break;
            case 2:
                // 전화번호 입력하기 메서드 호출
               
                while(whitepage.addWhitePage()){ }; //전화번호 중복 안되면 반복문 나오기
                System.out.println("SUCCESS!!");
               
                break;
            case 3:
            	if(whitepage.deleteWhitePage()) {
            		System.out.println("SUCCESS!!");
            	}
            	break;
            case 4:
            	whitepage.searchWhitePage();
            	break;
            case 5:
                System.out.println("End program");
                System.exit(0); //정상 종료 처리
                break;
            }//switch end
            
         }//while end
		
		}//main end
	}
