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
             System.out.println("   ���� Ÿ�� ���� ����     ");
             System.out.println("===================");
             
             System.out.println("��������������������������������������������");
             System.out.println("������� ���ܾ� Ÿ�� ���α׷�  ��");
             System.out.println("��������������������������������������������");
             System.out.println();
             
             System.out.println("����������������������������������������������������������������������������������������������������������������");
         
             for (int i = 0; i < 2; i++) {
                 System.out.println("                                                       ��");
                  for (int j = 0; j < 5; j++) {
                      System.out.print(a[i * 5 + j] + "\t");  // tab���� ����
                  }
                  
                  System.out.println();  // �� �ٲ�
                  System.out.println("                                                       ��");
          
             }
             
             System.out.println("����������������������������������������������������������������������������������������������������������������");

             char[] grade = { 'A', 'B', 'C', 'D', 'F' };
             int cnt = 0;
             
             while (true) {
               cnt = 0;   
               int score = 0; 
               int c=0;
               int[] achk = new int[a.length];
               String[] fail = new String[5];   
               System.out.print("Start!(enter�� ��������)");
               String b = s.nextLine();  
               System.out.println("���ܾ��� ���縵��  �Է��ϼ���.");

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

               System.out.print("������������" + score + "��");
               if (score >= 150) {
                  System.out.println("A�Դϴ�.");
               } else if (score < 150 && score >= 140) {
                  System.out.println("B�Դϴ�.");
               } else if (score < 140 && score >= 130) {
                  System.out.println("C�Դϴ�.");
               } else if (score < 130 && score > 100) {
                  System.out.println("D�Դϴ�.");
               } else {
                  System.out.println("F�Դϴ�.");
               }

               System.out.println("�׸��ϰ� �ʹٸ� ���Ḧ,�ٽ��ϱ� ���ϽŴٸ� �ٽ��ϱ⸦,Ʋ���ܾ �����Ͻð� �ʹٸ� ������ �Է����ּ���.");
               b = s.nextLine();
               if (b.equals("����")) {
                  break;
               } else if (b.equals("�ٽ��ϱ�")) {
                  continue;
               } else if (b.equals("����")) {
                  if (cnt == 0) {   
                     System.out.println("������ �����ϴ�.�׸��ϰ� �ʹٸ� ���Ḧ,�ٽ��ϱ� ���ϽŴٸ� �ٽ��ϱ⸦ �Է����ּ���");
                     b = s.nextLine();
                     if (b.equals("����")) {
                        break;
                     } else if (b.equals("�ٽ��ϱ�")) {
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
                     System.out.println("�׸��ϰ� �ʹٸ� ���Ḧ,�ٽ��ϱ� ���ϽŴٸ� �ٽ��ϱ⸦ �Է����ּ���");
                     b = s.nextLine();
                     if (b.equals("����")) {
                        break;
                     } else if (b.equals("�ٽ��ϱ�")) {
                        continue;
                     }

                  }
               }

            }



	}

}
