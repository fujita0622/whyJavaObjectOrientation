// Playerクラスの抽象メソッドの実装クラス OldMaidPlayerクラスを定義 
public class OldMaidPlayer extends Player {
	// OldMaidPlayerクラスのコンストラクタ
	// 引数は 親クラスと同じ
	public OldMaidPlayer(String name, Master master, Table table, Rule rule) {
		// 親メソッドのコンストラクタメソッドにアクセスし引数を与える
		super(name, master, table, rule);
	}

// 順番を指名するまでの手順を playクラスでオーバーライドする
	public void play(Player nextPlayer) {
		// 次のプレイヤー(nextPlayer)の手札をshowHandメソッドで取得し変数nextHand に格納
		Hand nextHand = ((OldMaidPlayer)nextPlayer).showHand();
		// 次のプレイヤーの手札(nextHand)からpickCardメソッドでカードを1枚引き 変数pickCard に格納
		Card pickCard = nextHand.pickCard(0);
		// 引いたカードを表示
		System.out.println(this + "：" + nextPlayer + "から" + pickCard + "を引きました。");
		// receiveCardメソッドに 変数pickCardを指定し引いたカードを手札に加え、同じ数字のカードが手札にあった場合、テーブルにすてる
		receiveCard(pickCard);
		// 手札の枚数(myHand_)が0になった場合
		if(myHand_.getNumberOfCards() == 0) {
			// MasterクラスのdeclareWinメソッドに this(現在順番が回ってきているプレイヤー)を指定し上がりを宣言
			master_.declareWin(this);
		} else {
			// 手札の枚数(myHand_)が0にならなかった場合
			// 残りの手札を表示
			System.out.println("残りの手札は" + myHand_ + "です。");
		}
	}
	
	// カードを受け取り処理する receiveCardメソッドを定義
	public void receiveCard(Card card) {
		// 受け取ったカードを加える
		myHand_.addCard(card);
		// 引いたカードと同じ数字のカードが手札にあるか探し、配列sameCards に格納する
		Card[] sameCards = rule_.findCandidate(myHand_, table_);
		// 配列sameCards が null でない場合
		if (sameCards != null) {
			// OldMaidTableクラスの putCardメソッドの引数に 配列sameCards(捨てるカードのペア)をテーブルに捨てる
			table_.putCard(sameCards);
			// 捨てたカードを表示
			System.out.println(this + "：" + sameCards[0] + " " + sameCards[1] + " " + "を捨てました。");
		}
	}
	
	// Hand型が戻り値のshowHandメソッド(手札を見る)を定義
	public Hand showHand() {
		// 手札の枚数(myHand_.getNumberOfCards() で取得)が 1 の場合
		if(myHand_.getNumberOfCards() == 1) {
			// Masterクラスの declareWinメソッドの引数に this(現在順番のプレイヤー) を指定し、上がりを宣言する
			master_.declareWin(this);
		}
		// Handクラスのshuffleメソッドを実行し、手札をシャッフルする
		myHand_.shuffle();
		// myHand_(シャッフルした手札)を戻り値として返す
		return myHand_;
	}
}