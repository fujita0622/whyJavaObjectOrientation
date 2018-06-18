// ジョーカーを表すクラス
// Cardクラスを継承している
// setNumber(), setSuit()メソッドを利用することで,どのようなカードとしても扱うことができる
public class Joker extends Card {

	// コンストラクタ
	// デフォルトでは、ジョーカーは何の値・スートも表さない
	public Joker() {
		super(0, 0);
	}
	
	// スートを変更する
	// @param suit スート
	public void setSuit(int suit) {
		suit_ = suit;
	}
	
	// 数を変更する
	// @param number 数
	public void setNumber(int number) {
		number_ = number;
	}
	
	// カードを文字列で表現
	// ObjectクラスのtoStringメソッドをオーバーライドしたメソッド
	public String toString() {
		return "JK";
	}
}