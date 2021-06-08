
public class Client implements Comparable<Client>{
	private int count;
	private int score;
	private String userName;
	
	Client(String userName){
		this.userName = userName;
		this.score = 20;
		this.count = 0;
	}
	
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public int compareTo(Client o) {
		if (this.score < o.getScore()) {
            return 1;
        } else if (this.score > o.getScore()) {
            return -1;
        }
        return 0;

	}


}
