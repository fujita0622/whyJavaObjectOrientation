public class Card {
	// スペードを表す定数
	public static final int SUIT_SPADE = 1;
	// ダイヤを表す定数
	public static final int SUIT_DIAMOND = 2;
	// クラブを表す定数
	public static final int SUIT_CLUB = 3;
	// ハートを表す定数
	public static final int SUIT_HEART = 4;
	// スートの数
	public static final int SUIT_NUM = 4;
	// 値の数
	public static final int CARD_NUM = 13;
	// カードを示すスート
	protected int suit_;
	// カードを示す数
	protected int number_;
	
	//　コンストラクタ
	// スートと数を指定して新しいカードのインスタンスを生成する。
	// スートはSUIT_SPADE,SUIT_DIAMOND,SUIT_CLUB,SUIT_HEARTのいずれかを指定する
	// @param suit スート
	// @param number 数
	public Card(int suit, int number) {
		this.suit_ = suit;
		this.number_ = number;
	}
	
	// スートを見る
	public int getSuit(){
		return suit_;
	}

	// 数を見る
	public int getNumber() {
		return number_;
	}
	
	public String toString() {
		StringBuffer string = new StringBuffer();
		
		// スートの表示
		switch(suit_) {
		case SUIT_SPADE :
			string.append("S");
			break;
		case SUIT_DIAMOND :
			string.append("D");
			break;
		case SUIT_CLUB :
			string.append("C");
			break;
		case SUIT_HEART :
			string.append("H");
			break;
		default :
			break;
		}
		
		// スートの表示
		switch(number_) {
		case 1 :
			string.append("A");
			break;
		case 10 :
			string.append("T");
			break;
		case 11 :
			string.append("J");
			break;
		case 12 :
			string.append("Q");
			break;
		case 13 :
			string.append("K");
			break;
		default :
			string.append(number_);
			break;
		}
		return string.toString();
	}
}
