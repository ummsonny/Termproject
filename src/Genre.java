
public class Genre{	
	String gameName = "나라";
	Choice choice;
	
	Genre(String choice) {
		this.choice = new Choice(choice);
	}
	
	
}

class Choice{
	
	String name;
	String hint[];
	
	Choice(String name){
		if(name.equals("독일")) {
			this.name = name;
			hint = new String[5];
			 hint[0]= "유럽 국가입니다.";
	         hint[1]= "우라니라보다 인구가 많습니다.";
	         hint[2]= "공업이 발전한 국가입니다.";
	         hint[3]= "축구 강국입니다.";
	         hint[4]= "분단국가였던 역사가 있습니다.";
		}
		
		else if(name.equals("러시아")) {
			this.name = name;
			hint = new String[5];
			 hint[0]= "영토가 넓은 나라입니다.";
	         hint[1]= "성장 가능성이 무궁무진합니다.";
	         hint[2]= "일본과 전쟁을 치룬 역사가 있습니다.";
	         hint[3]= "영토 대비 인구수는 적은 편입니다.";
	         hint[4]= "추운 기후로 유명합니다.";
		}
		
		else if(name.equals("한국")) {
			this.name = name;
			hint = new String[5];
			 hint[0]= "아시아입니다.";
	         hint[1]= "인구수가 1억 미만입니다.";
	         hint[2]= "반도국가입니다.";
	         hint[3]= "된장이 유명합니다.";
	         hint[4]= "김치가 유명합니다.";
		}
		
	}
	
	
	
	
}