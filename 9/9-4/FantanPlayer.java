// Playerクラスを継承し七並べ用に実装するクラス
public class FantanPlayer extends Player {
	// パスした回数
	private int pass_;
	
	// コンストラクタ
	// @param name プレイヤーの名前
	// @param master 進行役
	// @param table テーブル
	// @param rule ルール
	public FantanPlayer(String name, Master master, Table table, Rule rule) {
		// 親クラスの変数にコンストラクタの時に指定した引数を格納
		super(name, master, table, rule);
	}
	
	// ①　の部分
	
	// カードを配る
	// @param card 受け取ったカード
	public void receiveCard(Card card) {
		// 受け取ったカードの値(card.getNumber()で取得)が7の場合
		if(card.getNumber() == 7) {
			// テーブルに　putCard　メソッドで 受け取ったカード(card)を置く
			table_.putCard(new Card[] {card});
			// 受け取ったカードの値(card.getNumber()で取得)が7でない場合
		} else {
			// 親クラスのreceiveCard メソッド(引数で受け取ったカードを手札に加える)を実行
			super.receiveCard(card);
		}
	}
	
	// ①　の部分の終わり
	
	// ②　の部分
	
	// 順番を指名
	// @param nextPlayer 次のプレイヤー
	public void play(Player nextPlayer) {
		// FantanRuleクラスの findCandidateメソッド(手札からテーブルに置けるカードを探す)でテーブルに置けるカードを取得し変数 Candidate に格納
		Card[] Candidate = rule_.findCandidate(myHand_, table_);
		// テーブルに置けるカードがある場合
		if(Candidate != null) {
			// FantanTableクラスで定義したputCardメソッド(テーブルにカードを置く)の引数に 変数Candidateを指定しテーブルにカードを置く
			table_.putCard(Candidate);
			// 手札の枚数((myHand_.getNumberOfCards() で手札の枚数を取得)が 0 だった場合
			if (myHand_.getNumberOfCards() == 0) {
				// Master クラスのdeclareWinメソッド(上がりを宣言する)を実行し、引数に this(現在順番のプレイヤー)を指定し、上がりを宣言する
				master_.declareWin(this);
			}
		} else {
			// 変数pass_ に 1 加算する
			pass_++;
			// FantanMasterクラス .passメソッド(パスを宣言する)を実行し、引数に this(現在順番のプレイヤー)を指定し、パスを宣言する。
			((FantanMaster)master_).pass(this);
			// 変数pass_ の値が FantanMasterクラスの 定数PASS_LIMIT(3)を超えた場合
			if(pass_ > FantanMaster.PASS_LIMIT) {
				// 変数 numberOfHand に手札の枚数(myHand_.getNumberOfCards()で取得)を格納
				int numberOfHand = myHand_.getNumberOfCards();
				// 手札の枚数分ループ処理
				for(int position = 0; position < numberOfHand; position++) {
					// FantanTableクラスの putCardメソッド(テーブルにカードを置く)の引数にmyHand_.pickCard(0)で手札から1枚カードを引いてテーブルに置く
					table_.putCard(new Card[] {myHand_.pickCard(0)});
				}
			}
		}
	}
	
	// ②　の部分の終わり

	
	// パス回数を教える
	// @return パス回数
	public int getPass() {
		return pass_;
	}
}
