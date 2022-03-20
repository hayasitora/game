package home_work;
import java.util.Scanner;
public class homework {

	public static void main(String[] args) {
	// make text fantasy game
		/* 먼저 게임룰 게임 이름 설정 
			캐릭터 이름 직업 스테이터스 
			장비 이름 장착 
			몬스터 
		*/
		int hp= 0, mp=0;
		int str,def,spd,pose;
		boolean knight = true;
		boolean magician= true;
		boolean guardian= true;
		Scanner sc= new Scanner(System.in);
		System.out.println("당신의 이름을 입력해주세요");
		
		int naem =sc.nextInt();
		
		System.out.println("당신의 직업을 선택해주세요");
		boolean job = sc.nextBoolean();
		
		if (job= knight) {
			hp= 120;
			mp= 100;
			str= 30;
			def= 20;
			spd= 15;
			pose=20;
			
			
		}
		else if(job= magician) {
			hp=100;
			mp=200;
			str=12;
			def=15;
			spd=20;
			pose=50;
		}
		else if(job= guardian) {
			hp=200;
			mp=100;
			str=20;
			def=50;
			spd=5;
			pose=10;
		}
		
	}

}
