// 「extends Player」でPlayerクラスを継承したYamadaクラスを定義
public class Yamada extends Player {
// 親クラスでコンストラクタを作成しているので子クラスであるYamadaクラスもコンストラクタを作成する
	public Yamada(String name) {
		// superキーワードで親クラスでコンストラクタをそのまま使用する
		super(name);
	}
	
// 親クラスで定義したshowHandメソッドをオーバーライド(上書き)する
	public int showHand() {
		// ジャンケンの手「パー」を戻り値として返す
		return PAPER;
	}
}
