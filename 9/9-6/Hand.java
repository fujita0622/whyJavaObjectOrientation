import java.util.ArrayList;

public class Hand {
	// カードを手札として保持するためのリスト
	protected ArrayList<Card> hand_ = new ArrayList<Card>();
	
	// カードを加える
	// param card 加えるカード
	public void addCard(Card card) {
		//　リストの最後に追加
		hand_.add(card);
	}
	
	// カードを見る
	// position は 0 から getNumberOfCards() の範囲で指定すること
	// @param position
	public Card lookingCard(int position) {
		Card lookingCard = null;
		
		// 適切な範囲はチェック
		if((0 <= position) && (position <= 	hand_.size())) { 
			lookingCard = hand_.get(position);
		}
		return lookingCard;
	}
	
	// カードを引く
	// 引いたカードは手札から削除される
	// @param position
	// @return で指定された位置のカード。範囲外はnullで返す
	public Card pickCard(int position) {
		Card pickedCard = null;
		if ((0 <= position) && (position <= hand_.size())) {
			pickedCard = hand_.remove(position);
		}
		return pickedCard;
	}
	
	public void shuffle() {
		// 手札の枚数を取得
		int number = hand_.size();
		// カードを抜きだす位置
		int pos;
		
		//カードをランダムに抜き取って最後に加える動作を繰り返す
		for(int count = 0; count < number * 2; count++) {
			pos = (int)(Math.random() * number);
			Card pickCard = hand_.remove(pos);
			
			// 最後にカードを追加する
			hand_.add(pickCard);
			// addCard(pickCard);
		}
	}
	
	public int getNumberOfCards() {
		return hand_.size();
	}
	
// 手札にあるカードを文字列表示する
// ObjectクラスのtoStringメソッドをオーバーライドしたメソッド
// @return 手札にあるカードの文字列表現
	public String toString() {
		StringBuffer string = new StringBuffer();
		int size = hand_.size();
		if(size > 0) {
			for(int count = 0; count < size; count++) {
				Card card = hand_.get(count);
				string.append(card);
				string.append(" ");
			}
		}
		return string.toString();
	}
}