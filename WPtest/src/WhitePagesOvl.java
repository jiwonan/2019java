
public class WhitePagesOvl {
	public String name;
	public String teleNum;
	
	public WhitePagesOvl() {
		
	}
	
	public WhitePagesOvl(String name, String teleNum) {
		this.name = name;
		this.teleNum = teleNum;		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTeleNum() {
		return teleNum;
	}
	
	public void setTeleNum(String teleNum) {
		this.teleNum = teleNum;
	}
	
	@Override
	public String toString() {
		
		return "["+name+"]" + teleNum;
	}

}
