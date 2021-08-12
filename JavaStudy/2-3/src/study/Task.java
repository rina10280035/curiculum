package study;

//① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator {
	


/**
 * タスクの実行
 * @param plus 
 */

public void doTask() {
	
    // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
    // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること
	 Calculator plus = new  Calculator();
	int plusValue = plus.plus(10);
	int plusValue1 = plus.plus(10,20);
	int plusValue2 = plus.plus(10,20,30);
	 System.out.println("plusメソッドの引数が一つの場合:" + plusValue);
	 System.out.println("plusメソッドの引数が二つの場合:" + plusValue1);
	 System.out.println("plusメソッドの引数が三つの場合:" + plusValue2);
	}
}    
