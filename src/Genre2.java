
public class Genre2{	
	String gameName = "구기 종목";
	Choice2 choice2;
	
	Genre2(String choice2) {
		this.choice2 = new Choice2(choice2);
	}
	
	
}

class Choice2{
	
	String name;
	String hint[];
	
	Choice2(String name){
		if(name.equals("배구")) {
			this.name = name;
			hint = new String[5];
			 hint[0]= "국내 프로리그가 존재합니다.";
	         hint[1]= "각 팀당 선수가 5인 이상입니다.";
	         hint[2]= "손을 주로 사용합니다.";
	         hint[3]= "키가 큰 사람이 유리합니다.";
	         hint[4]= "국내에 유명한 여자선수가 있습니다.";
		}
		
		else if(name.equals("탁구")) {
			this.name = name;
			hint = new String[5];
			 hint[0]= "주로 실내에서 즐기는 종목입니다.";
	         hint[1]= "공의 크기가 작은 편입니다.";
	         hint[2]= "동양권 국가가 강합니다.";
	         hint[3]= "최대 4명(팀당 2명)이서 겨룰 수 있습니다.";
	         hint[4]= "제빵왕";
		}
		
		else if(name.equals("야구")) {
			this.name = name;
			hint = new String[5];
			 hint[0]= "공격과 수비측이 나뉘어 집니다..";
	         hint[1]= "국내 프로리그가 존재합니다.";
	         hint[2]= "미국이 이 종목에서 유명합니다.";
	         hint[3]= "실외 스포츠입니다.";
	         hint[4]= "대한민국이 올림픽에서 우승한 전적이 있습니다.";
		}
		
	}
	
	
	
	
}