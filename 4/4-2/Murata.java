// 「extends Player」でPlayerクラスを継承したMurataクラスを定義
public class Murata extends Player {
// 親クラスでコンストラクタを作成しているので子クラスであるMurataクラスもコンストラクタを作成する
	public Murata(String name) {
		// superキーワードで親クラスでコンストラクタをそのまま使用する
		super(name);
	}
	
	// 親クラスで定義したshowHandメソッドをオーバーライド(上書き)する
	public int showHand() {
		// ジャンケンの手「グー」を戻り値として返す
		return STONE;
	}
}
