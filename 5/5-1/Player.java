package lesson5;

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
//=================================== 追加箇所　===================================
	// 戦略を格納する tactics_ 変数をアクセス修飾子「private」で外部から変更を加えられないようにして定義
	// 型はインターフェイス
	private Tactics tactics_;

	// setTactics メソッドを定義
	public setTactics(Tactics tactics) {
		// setTactics メソッドの引数を tactics_ 変数に格納
		tactics_ = tactics;
	}
//=================================== 追加箇所　===================================

	// プレイヤークラスの操作
	// プレイヤークラスのコンストラクタ
	// @param name 名前
	public Player(String name) {
		name_ = name;
	}
	
//=================================== 変更箇所 ===================================
// ジャンケンの手を出す
	public int showHand() {
		// tactics_ 変数に格納されている戦略クラスからreadTactics()メソッドを読み込みジャンケンの手を決め hand 変数に格納
		int hand = tactics_.readTactics();
		// 決定した手を戻り値として返す
		return hand;
	}
//=================================== 変更箇所 ===================================
	
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
