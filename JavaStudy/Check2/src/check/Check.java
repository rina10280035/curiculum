package check;


public class Check {
	
	private static String firstName ="さとう";
	private static String lastName = "りな";
	
	private static String CHECK_CLASS_JAVA = "java吉";
	private static String CHECK_CLASS_HOGE = "hoge";
	private static String CHECK_CLASS_R2D2 = "R2D2";
	private static String CHECK_CLASS_LUKE = "ルーク";

	
	public static void main(String[] args) {
		Check printName = new Check();
		printName.printName();
		
		Pet introduce = new Pet(CHECK_CLASS_JAVA,CHECK_CLASS_HOGE);
		introduce.introduce();
        
		RobotPet pet = new RobotPet(CHECK_CLASS_R2D2,CHECK_CLASS_LUKE);
         pet.introduce();
        
	}
	
	
	private void printName() {
		System.out.println("printNameメソッド → " + firstName +lastName);
	}
	
         }

