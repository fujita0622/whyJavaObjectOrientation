public class Player {
	// ジャンケンのプレイヤーを表すクラス
	public static final int STONE = 0; //グー
	public static final int SCISSORS = 1; //チョキ
	public static final int PAPER = 2; //パー

// プレイヤークラスの属性
	// プレイヤーの名前
	private String name_;
	// プレイヤーの勝った回数
	private int winCount_ = 0;
	
	//与えられる戦略
	private Tactics tactics_;
	
	void setTactics(Tactics tactics) {
		tactics_ = tactics;
	}

	// プレイヤークラスの操作
	// プレイヤークラスのコンストラクタ
	// @param name 名前
	public Player(String name) {
		name_ = name;
	}
	
// ジャンケンの手を出す
	public int showHand() {
		// プレイヤーの手
		int hand = tactics_.readTactics();
		// 決定した手を戻り値として返す
		return hand;
	}
	
	// 審判から勝敗を聞く
	// @param result true:勝ち、false:負け
	public void notifyResult(boolean result) {
		if (result == true) {
			// 勝った場合は勝ち数を加算する
			winCount_ += 1;
		}
	}
	
	// 自分の勝った回数を答える
	// @return 勝った回数
	public int getWinCount() {
		return winCount_;
	}
	
	// 自分の名前を答える
	// return 名前
	public String getName() { 
		return name_;
	}
}
