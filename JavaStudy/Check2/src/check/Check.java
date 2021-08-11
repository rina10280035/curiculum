package check;

public class Check {
	
	public static void main(String[] args) {
		Check printName = new Check("さとう","りな");
		printName.printName();
		
		 Pet introduce = new Pet("java吉","hoge");
         RobotPet pet = new RobotPet("R2D2","ルーク");
       
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

