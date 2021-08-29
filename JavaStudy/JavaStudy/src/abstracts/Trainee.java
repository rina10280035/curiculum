package abstracts;
//「Javaのカリキュラムだけこなせよ！って決まりごとがある抽象クラス」を継承した研修生クラス
public class Trainee extends JavaCurriculumTrainee {

	public Trainee(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void doJavaCurriculum() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("わたくし、" + super.getName() + "は、Javaカリキュラムをこなします(｀･ω･´)ゞ！");
	}

}
 