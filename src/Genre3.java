
public class Genre3{   
   String gameName = "����";
   Choice3 choice3;
   
   Genre3(String choice) {
      this.choice3 = new Choice3(choice);
   }
   
   
}

class Choice3{
   
   String name;
   String hint[];
   
   Choice3(String name){
      if(name.equals("������")) {
         this.name = name;
         hint = new String[5];
          hint[0]= "�츮������ �����Դϴ�.";
            hint[1]= "�����ϰԵ�, �������� �ʰԵ� ���� �� �ֽ��ϴ�.";
            hint[2]= "������ �پ��� ��������� �ֽ��ϴ�.";
            hint[3]= "�� �Ǵ� �ҷ� ���� �� �ֽ��ϴ�.";
            hint[4]= "���� Ƣ��, ���� ��� ��鿩 �Խ��ϴ�.";
      }
      
      else if(name.equals("������")) {
         this.name = name;
         hint = new String[5];
          hint[0]= "���� �丮�Դϴ�.";
            hint[1]= "������ ���Դϴ�.";
            hint[2]= "ȣ��ȣ�� ���� �� �ִ� �����Դϴ�.";
            hint[3]= "�߱��������� ���۵� �丮�Դϴ�.";
            hint[4]= "��ź�� �߷� ���� OO.";
      }
      
      else if(name.equals("�Ľ�Ÿ")) {
         this.name = name;
         hint = new String[5];
          hint[0]= "����Դϴ�.";
            hint[1]= "����� �ʰ� �����ؼ� ���� �� �ֽ��ϴ�.";
            hint[2]= "���� �Ҽ� ������ Ư�� �� �������� �����մϴ�.";
            hint[3]= "�� ������ ����� �� ��󸶰� �����մϴ�.";
            hint[4]= "��ġ�� �� �丮�̸�, �� �����Դϴ�.";
      }
      
   }
   
   
   
   
}