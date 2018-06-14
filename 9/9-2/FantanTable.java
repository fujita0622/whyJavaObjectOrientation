// Tableインターフェイスの実装クラス FantanTableクラス
public class FantanTable implements Table {
	// カードを並べるテーブルを表す2次元配列
	private Card[][] table_ = new Card[Card.SUIT_NUM][Card.CARD_NUM];
	
	// カードを置く
	// @param card カード
	public void putCard(Card[] card) {
		// ① この部分を実装
		// 引数のCardの配列から最初の列のスートを getSuit()メソッドで取得し 変数 suit に格納
 		int suit = card[0].getSuit();
 		// 引数のCardの配列から最初の列の数字を getNumber()メソッドで取得し 変数 number に格納
		int number = card[0].getNumber();
		// 二次元配列 table_ に スート(変数 suit)と数字(変数 number)を指定し、置くカードを格納
		table_[suit - 1][number - 1] = card[0];
	}
	
	// カードを見る
	// @return テーブルに置かれたカードを表す配列
	public Card[][] getCards() {
		// テーブルに置かれたカードを表す配列 table_ を戻り値として返す
		return table_;
	}
	
	// テーブルを文字列で表現する
	// ObjectクラスのtoStringメソッドをオーバーライドしたメソッド
	// @return テーブルの文字列表現
	// 
	public String toString() {
		// StringBufferクラスをインスタンス化した変数 string を定義
		StringBuffer string = new StringBuffer();
		// スートの数だけループ処理 
		// スートの数は Card.SUIT_NUM でカードクラスの定数 SUIT_NUM から取得
		for(int suit = 0; suit < Card.SUIT_NUM; suit++) {
		// トランプの数字の分だけループ処理
			for (int number = 0; number < Card.CARD_NUM; number++){
				// table_[suit][number]に値が格納されてた場合
				if(table_[suit][number] != null) {
					// 変数 string に table_[suit][number]に格納されている文字列を追加
					string.append(table_[suit][number]);
					// table_[suit][number]に値が格納されていない場合
				} else {
					// 変数 string に ".." と追加
					string.append("..");
				}
				// 変数 string に " "(半角スペース) を追加
				string.append(" ");
			}
			// 変数 string に "\n"(改行) を追加
			string.append("\n");
		}
		//変数stringをtoString()で文字列変換して返す
		return string.toString();
	}
}