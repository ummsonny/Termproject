
public class Genre3{   
   String gameName = "음식";
   Choice3 choice3;
   
   Genre3(String choice) {
      this.choice3 = new Choice3(choice);
   }
   
   
}

class Choice3{
   
   String name;
   String hint[];
   
   Choice3(String name){
      if(name.equals("떡볶이")) {
         this.name = name;
         hint = new String[5];
          hint[0]= "우리나라의 음식입니다.";
            hint[1]= "매콤하게도, 매콤하지 않게도 만들 수 있습니다.";
            hint[2]= "국내에 다양한 프랜차이즈가 있습니다.";
            hint[3]= "밀 또는 쌀로 만들 수 있습니다.";
            hint[4]= "보통 튀김, 순대 등과 곁들여 먹습니다.";
      }
      
      else if(name.equals("마라탕")) {
         this.name = name;
         hint = new String[5];
          hint[0]= "국물 요리입니다.";
            hint[1]= "매콤한 편입니다.";
            hint[2]= "호불호가 갈릴 수 있는 음식입니다.";
            hint[3]= "중국에서부터 시작된 요리입니다.";
            hint[4]= "연탄재 발로 차지 OO.";
      }
      
      else if(name.equals("파스타")) {
         this.name = name;
         hint = new String[5];
          hint[0]= "양식입니다.";
            hint[1]= "어렵지 않게 조리해서 먹을 수 있습니다.";
            hint[2]= "유럽 소속 국가가 특히 이 음식으로 유명합니다.";
            hint[3]= "이 음식을 소재로 한 드라마가 존재합니다.";
            hint[4]= "김치가 면 요리이며, 세 글자입니다.";
      }
      
   }
   
   
   
   
}