
public class Genre{	
	String gameName = "����";
	Choice choice;
	
	Genre(String choice) {
		this.choice = new Choice(choice);
	}
	
	
}

class Choice{
	
	String name;
	String hint[];
	
	Choice(String name){
		if(name.equals("����")) {
			this.name = name;
			hint = new String[5];
			 hint[0]= "���� �����Դϴ�.";
	         hint[1]= "���϶󺸴� �α��� �����ϴ�.";
	         hint[2]= "������ ������ �����Դϴ�.";
	         hint[3]= "�౸ �����Դϴ�.";
	         hint[4]= "�дܱ������� ���簡 �ֽ��ϴ�.";
		}
		
		else if(name.equals("���þ�")) {
			this.name = name;
			hint = new String[5];
			 hint[0]= "���䰡 ���� �����Դϴ�.";
	         hint[1]= "���� ���ɼ��� ���ù����մϴ�.";
	         hint[2]= "�Ϻ��� ������ ġ�� ���簡 �ֽ��ϴ�.";
	         hint[3]= "���� ��� �α����� ���� ���Դϴ�.";
	         hint[4]= "�߿� ���ķ� �����մϴ�.";
		}
		
		else if(name.equals("�ѱ�")) {
			this.name = name;
			hint = new String[5];
			 hint[0]= "�ƽþ��Դϴ�.";
	         hint[1]= "�α����� 1�� �̸��Դϴ�.";
	         hint[2]= "�ݵ������Դϴ�.";
	         hint[3]= "������ �����մϴ�.";
	         hint[4]= "��ġ�� �����մϴ�.";
		}
		
	}
	
	
	
	
}