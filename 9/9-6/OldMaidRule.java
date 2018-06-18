// Ruleインターフェイスを実装する OldMaidRuleクラスを定義
public class OldMaidRule implements Rule {
	// 手札のカードからテーブルに捨てられるカードを探す
	public Card[] findCandidate(Hand hand, Table table) {
		// テーブルに捨てられるカードを格納する配列candidate を定義
		// 捨てられるカードがない場合は null で返すので初期値は null を格納
		Card[] candidate = null;
		// 手札の枚数を取得し,変数numberOfHandに格納
		int numberOfHand = hand.getNumberOfCards();
		// 引いたカードの位置を取得
		// 引いたカードは最後に追加されるので手札の最後(numberOfHand(手札の枚数) - 1)の位置を取得する
		int lastPosition = numberOfHand -1;
		// 引いたカードを取得
		Card lastValue = hand.lookingCard(lastPosition);
		// 引いたカードの数を取得
		int lastValueNumber = lastValue.getNumber();
		// 手札の最後を除いた枚数分ループ処理
		for(int position = 0; position < lastPosition; position++) {
			// 手札のから 変数position の値の位置のカードを取得
			Card positionValue = hand.lookingCard(position);
			// 上記で取得したカードの数を取得
			int positionValueNumber = positionValue.getNumber();
			// 引いたカード(lastValue)の中で同じ数のカードが手札にあった場合
			if (lastValueNumber == positionValueNumber) {
				// new Card[2] で 2個のCard型要素をもつ配列candidate を生成
				candidate = new Card[2];
				// candidate[0] に 引いたカードを格納
				candidate[0] = hand.pickCard(lastPosition);
				// candidate[1] に 引いたカードと同じ数のカードを格納
				candidate[1] = hand.pickCard(position);
				// 1組見つかった場合、ループを終了
				break;
			}
		}
		// 見つからなかった場合、配列candidate の値はそのまま null
		// 結果を返す
		return candidate;
	}
}
