package practice;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class A04 extends Thread {
	JFrame frame;
	JLabel label;
	
	
	SimpleDateFormat s = new SimpleDateFormat("aa hh시 mm분 ss초");

	public A04() {
		frame = new JFrame("label example");
		Container con = frame.getContentPane();
		label = new JLabel("test label");
		con.add(label);
		Font font = new Font(null, Font.ITALIC, 32);
		label.setFont(font);
		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void run() {
		frame.setVisible(true);
		for (int i = 0;; i++) {
			long time = System.currentTimeMillis();
			label.setText(s.format(time));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class B04 extends A04 {
	long startTime = 0 ;
	long endTime = 0 ;
	SimpleDateFormat ss = new SimpleDateFormat("hh시 mm분 ss초 사용");
	
	public void startTime() {
		Date date = new Date();
		startTime = date.getTime();
	}
	public void endTime() {
		Date date = new Date();
		endTime = date.getTime();
	}
	
	public void run() {
		frame.setVisible(true);
		long usingTime = (endTime)-(startTime);
		
		long usingTotalSec = usingTime/1000;
		
		long usingHour = usingTotalSec/3600;
		long usingMin = (usingTotalSec - (usingHour*3600))/60;
		long usingSec = usingTotalSec -(usingHour*3600 + usingMin*60); 
		
		// 2시간 15분 30초
		// 930 + 7200 8130초
		
		// 8130 초 >> 시간
		// 초/3600 > 시간
		// 8130 - (8130/3600*3600)
		//           2      * 3600 /60 분
		// 전체초 - (시간+분을 초로 바꾼) = 초
		
		
		String s =  usingHour +"시" + usingMin+ "분" +  usingSec + "초 사용";
		label.setText(s);
				
	}
	
}

public class Test01 {
	public static void main(String[] args) {

		A04 a = new A04();
		B04 b = new B04();
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		int choice;
		String id = null;
		String pwd = null;

		while (true) {
			System.out.println("1. 로그인 2. 가 입 3. 종료");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("-----------");
				System.out.println("로그인");
				System.out.println("-----------");

				System.out.print("아이디 입력 : ");
				id = scan.next();
				System.out.print("비밀번호 입력 : ");
				pwd = scan.next();

				if (!map.containsKey(id) || !map.get(id).equals(pwd)) {
					System.out.println("아이디와 비밀번호를 확인해주세요");
				} else {
					System.out.println("로그인 됐습니다");
					a.start();
					b.startTime();

					System.out.println("====환영합니다=====");
					System.out.println("1.기 능");
					System.out.println("2.off");
					System.out.println(">>>");
					int choice2 = scan.nextInt();

					if (choice2 == 2) {
						b.endTime();
						b.run();
						
						System.out.println(b.startTime);
						System.out.println(b.endTime);
						System.out.println("프로그램 종료");
					}

				}
				break;
			case 2:
				System.out.println("-----------");
				System.out.println("가 입");
				System.out.println("-----------");
				System.out.print("아이디 입력 : ");
				id = scan.next();
				while (map.containsKey(id)) {
					System.out.println("이미 존재하는 아이디 입니다");
					System.out.print("아이디 입력 : ");
					id = scan.next();
				}
				if (!map.containsKey(id)) {
					System.out.print("비밀번호 입력 : ");
					pwd = scan.next();

					map.put(id, pwd);
					System.out.println("가입되었습니다");
				}
				break;

			case 3:
				System.out.println("-----------");
				System.out.println("종료");
				System.out.println("-----------");
				System.exit(1);
				break;
			default:
				break;
			}
		}

	}
}
