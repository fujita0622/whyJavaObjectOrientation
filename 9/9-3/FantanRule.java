// Ruleインターフェイスを七並べ用に実装するクラス
public class FantanRule implements Rule {
	
	//　手札に置けるカードを探す。手札とテーブルから出しうるカードの組み合わせを探す
	// @param hand 手札
	// @param table テーブル
	// @return 見つかったカードの組み合わせ。見つからなかったカードは null で返す
	public Card[] findCandidate(Hand hand, Table table) {
		// 変数 Candidate に null を格納
		// Candidateはテーブルに置けるカードを格納する変数
		Card[] Candidate = null;
		
		// 手札の枚数を取得
		int numberOfHand = hand.getNumberOfCards();
		// 手札の枚数だけループ処理
		for (int position = 0; position < numberOfHand; position++) {
			// 手札から position の数値の位置のカードを取得し、変数 handOfCards に格納
			Card handOfCards = hand.lookingCard(position);
			// 変数 handOfCards　に格納したカードのスートを取得し 変数 suit に格納
			int suit = handOfCards.getSuit();
			// 変数 handOfCards　に格納したカードの数字を取得し 変数 number に格納
			int number = handOfCards.getNumber();
			// 変数 leftNumber に カードの数字から 1 引いた値を格納
			// カードの数字が 1 の場合は Cardクラスの 定数CARD_NUM (13) を格納
 			int leftNumber = (number != 1) ? number - 1 : Card.CARD_NUM;
			// 変数 rigntNumber に カードの数字から 1 足した値を格納
			// カードの数字が 13(Card.CARD_NUM) の場合は 1 を格納
			int rigntNumber = (number != Card.CARD_NUM) ? number + 1 : 1;

			// 手札のカードの左右の数字がテーブルにあった場合
			if (
				(cardsOnTheTable(table, suit, leftNumber) == true)
				|| (cardsOnTheTable(table, suit, rigntNumber) == true)
			) {
				// Cardクラスをインスタンス化し,変数Candidate に格納
				Candidate = new Card[1];
				// 変数Candidate に テーブルにおける手札のカード(変数handOfCards)を格納
				Candidate[0] = handOfCards;
				// ループを終了する
				// ※ おけるカードが1枚の為
				break;
			}
		}
		// テーブルにおけるカードを格納した変数 Candidateを戻り値として返す
		return Candidate;
	}
	
	// テーブルに置かれているカードを確認する cardsOnTheTable クラス を定義
	public boolean cardsOnTheTable(Table table, int suit, int number) {
		// 置かれているカードを真偽値で返すための変数putCard を定義
		boolean putCard;
		// テーブルに置かれているカードを確認するための変数lookTable を定義
		Card[][] lookTable = table.getCards();
		// 変数lookTableにスートと値を指定し、指定したカードがテーブルに置かれているか確認
		// 指定したカードが置かれている場合
		if(lookTable[suit][number] != null) {
		// 変数putCardに true を格納
			putCard = true;
			// 指定したカードが置れていない場合
		} else {
		// 変数putCard に false を格納
			putCard = false;
		}
		// 真偽値が格納されている変数putCardを戻り値として返す
		return putCard;
	}
}
