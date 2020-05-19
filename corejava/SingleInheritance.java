class Sport{
	void player(){
		System.out.println("There are more than one player in game.");
		
	}
}
class Basketball extends Sport{
	void basketball(){
		System.out.println("5 players in basketball game");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Basketball obj=new Basketball();
		obj.player();
		obj.basketball();
	}

}
