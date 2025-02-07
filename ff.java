package javawin01;

import java.util.Random;
import java.util.Scanner;

public class ff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String[] a = { "culture", "experience", "education", "symbol", "effect", "liberty", "affair", "comfort",
                  "tradition", "subject" };
           
            Scanner s = new Scanner(System.in);
            Random r = new Random();
            
             System.out.println("===================");
             System.out.println("   영어 타자 게임 시작     ");
             System.out.println("===================");
             
             System.out.println("┏━━━━━━━━━━━━━━━━━━━━┓");
             System.out.println("┃저장된 영단어 타자 프로그램  ┃");
             System.out.println("┗━━━━━━━━━━━━━━━━━━━━┘");
             System.out.println();
             
             System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
         
             for (int i = 0; i < 2; i++) {
                 System.out.println("                                                       ┃");
                  for (int j = 0; j < 5; j++) {
                      System.out.print(a[i * 5 + j] + "\t");  // tab으로 구분
                  }
                  
                  System.out.println();  // 줄 바꿈
                  System.out.println("                                                       ┃");
          
             }
             
             System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┘");

             char[] grade = { 'A', 'B', 'C', 'D', 'F' };
             int cnt = 0;
             
             while (true) {
               cnt = 0;   
               int score = 0; 
               int c=0;
               int[] achk = new int[a.length];
               String[] fail = new String[5];   
               System.out.print("Start!(enter를 누르세요)");
               String b = s.nextLine();  
               System.out.println("영단어의 스펠링을  입력하세요.");

               for (c = 0; c < 5; c++) {    
                  int num = r.nextInt(a.length);
                  String d = a[num];
                  if(achk[num]!=0) {c--; continue;
                  }else{achk[num]=1;
                  }System.out.println(d);

                  b = s.nextLine();                                                          
                
                  for (int i = 0; i < d.length() ; i++) {   
                     if(i == b.length()) {                       
                        break;  
                     }
                     if (d.charAt(i) == b.charAt(i)) {  
                        score += 5; 
                     }
                  }
                  if (!d.equals(b)) {      
                     cnt++;                     
                     fail[c] = d;               
                                                 
                  }
               }

               System.out.print("게임의점수는" + score + "로");
               if (score >= 150) {
                  System.out.println("A입니다.");
               } else if (score < 150 && score >= 140) {
                  System.out.println("B입니다.");
               } else if (score < 140 && score >= 130) {
                  System.out.println("C입니다.");
               } else if (score < 130 && score > 100) {
                  System.out.println("D입니다.");
               } else {
                  System.out.println("F입니다.");
               }

               System.out.println("그만하고 싶다면 종료를,다시하길 원하신다면 다시하기를,틀린단어를 복습하시고 싶다면 오답을 입력해주세요.");
               b = s.nextLine();
               if (b.equals("종료")) {
                  break;
               } else if (b.equals("다시하기")) {
                  continue;
               } else if (b.equals("오답")) {
                  if (cnt == 0) {   
                     System.out.println("오답이 없습니다.그만하고 싶다면 종료를,다시하길 원하신다면 다시하기를 입력해주세요");
                     b = s.nextLine();
                     if (b.equals("종료")) {
                        break;
                     } else if (b.equals("다시하기")) {
                        continue;
                     }
                  } else {
                     for (int cc = 0; cc < 5; cc++) {
                        if (fail[cc] == null) {
                           System.out.print(" ");
                        } else {
                           System.out.print(fail[cc]);
                           System.out.println();
                        }
                     }
                     System.out.println("그만하고 싶다면 종료를,다시하길 원하신다면 다시하기를 입력해주세요");
                     b = s.nextLine();
                     if (b.equals("종료")) {
                        break;
                     } else if (b.equals("다시하기")) {
                        continue;
                     }

                  }
               }

            }



	}

}
