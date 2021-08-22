package check;

import constants.Constants;

public class Check {
	
	private static String firstName ="さとう";
	private static String lastName = "りな";
	
	
	public static void main(String[] args) {
		Check.printName(firstName, lastName);
		
		
		Pet introduce = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		introduce.introduce();
        
		RobotPet pet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
         pet.introduce();
        
	}
	
	
	private static void printName(String firstName,String lastName) {
		
		System.out.println("printNameメソッド → " + (firstName+lastName));
	}
}

	