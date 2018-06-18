// utilパッケージを読み込みArrayListクラスを使用できるようにする
import java.util.ArrayList;

// Tableインターフェイスを実装した
public class OldMaidTable implements Table {
	// 捨てるカードを格納するArrayList型の配列disposedCard を生成
	private ArrayList<Card> disposedCard_ = new ArrayList<Card>();
	
	//　カードを置く
	// サブクラスで実装
	//　@param card カード
	public void putCard(Card[] card) {
		// 引数cardがnullでなかった場合
		if(card != null) {
			// 引数card　の要素数分ループ処理
			for (int index = 0; index < card.length; index++) {
				// 配列disposedCard_ に捨てるカードを表示
				// addメソッドで 配列disposedCard_ に引数(捨てるカード)を追加
				disposedCard_.add(card[index]);
			}
		} 
	}
}
