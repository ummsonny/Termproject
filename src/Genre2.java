
public class Genre2{	
	String gameName = "���� ����";
	Choice2 choice2;
	
	Genre2(String choice2) {
		this.choice2 = new Choice2(choice2);
	}
	
	
}

class Choice2{
	
	String name;
	String hint[];
	
	Choice2(String name){
		if(name.equals("�豸")) {
			this.name = name;
			hint = new String[5];
			 hint[0]= "���� ���θ��װ� �����մϴ�.";
	         hint[1]= "�� ���� ������ 5�� �̻��Դϴ�.";
	         hint[2]= "���� �ַ� ����մϴ�.";
	         hint[3]= "Ű�� ū ����� �����մϴ�.";
	         hint[4]= "������ ������ ���ڼ����� �ֽ��ϴ�.";
		}
		
		else if(name.equals("Ź��")) {
			this.name = name;
			hint = new String[5];
			 hint[0]= "�ַ� �ǳ����� ���� �����Դϴ�.";
	         hint[1]= "���� ũ�Ⱑ ���� ���Դϴ�.";
	         hint[2]= "����� ������ ���մϴ�.";
	         hint[3]= "�ִ� 4��(���� 2��)�̼� �ܷ� �� �ֽ��ϴ�.";
	         hint[4]= "������";
		}
		
		else if(name.equals("�߱�")) {
			this.name = name;
			hint = new String[5];
			 hint[0]= "���ݰ� �������� ������ ���ϴ�..";
	         hint[1]= "���� ���θ��װ� �����մϴ�.";
	         hint[2]= "�̱��� �� ���񿡼� �����մϴ�.";
	         hint[3]= "�ǿ� �������Դϴ�.";
	         hint[4]= "���ѹα��� �ø��ȿ��� ����� ������ �ֽ��ϴ�.";
		}
		
	}
	
	
	
	
}