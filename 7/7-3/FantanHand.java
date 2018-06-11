// 「extends Hand」で Hand クラスを継承した FantanHand クラスを定義
public class FantanHand extends Hand {
  // voidで戻り値なしの lookCard メソッドを定義
	public void lookCard() {
		// カードを見る処理を記述
	}

  // Handクラスの[カードを引く]操作をオーバーライド(上書きする)
  public Card pickCard() {
    // 手札の中の先頭の一枚を pickedCard 変数に格納
    Card pickedCard = (Card) hand_.remove(0);
    // pickedCard 変数を戻り値として返す
    return pickedCard;
  }
}