package study;
//①FruitsConstants.javaをインポートしなさい。
import constants.FruitsConstans;
//②Fruits.javaをインポートしなさい。
import fruits.Fruits;
/**
* 本課題では、基本的なJavaの構造と、importについて理解を深めていきましょう。
*
* 問①〜問③まであります。
* 全て回答し、課題にある画像と同じ表示になるようにしてください。
*
*/

public class Study {

	public static void main(String[] args) {
		printFruits("レモン",20);
	
		
		
	}// TODO 自動生成されたメソッド・スタブ
		 /* ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。
         *     また、課題の画像と同じ表示になるように
         *     printFruitsの引数にはFruitsConstantsに指定されている定数を設定してください。
         */
	FruitsConstans comstans = new FruitsConstans();
	Fruits printFruits = new Fruits();
	
	public static void printFruits(String fruits, int count) {
        	        	 
        	 System.out.println("食べ物は" + fruits);
       		System.out.println(count +"です"); 
		}

}