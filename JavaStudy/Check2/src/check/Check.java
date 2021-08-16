package check;


public class Check {
	
	public static final String CHECK_CLASS_JAVA = "java吉";
    public static final String CHECK_CLASS_HOGE = "hoge";
    public static final String CHECK_CLASS_R2D2 = "R2D2";
    public static final String CHECK_CLASS_LUKE = "ルーク";

	
	public static void main(String[] args) {
		Check printName = new Check("さとう","りな");
		printName.printName();
		
		Pet introduce = new Pet(CHECK_CLASS_JAVA,CHECK_CLASS_HOGE);
		
        
		RobotPet pet = new RobotPet(CHECK_CLASS_R2D2,CHECK_CLASS_LUKE);
         
		introduce.introduce();
         pet.introduce();
        
	}
	
	private String firstName;
	private String lastName;
	
	private Check(String firstName,String lastName) {
		this.firstName = "さとう";
		this.lastName = "りな";
	}

	private void printName() {
		System.out.println("printNameメソッド → " + firstName +lastName);
	}
	
         }

