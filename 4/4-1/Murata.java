public class Murata {
	// 「static final」でジャンケンの手を表す定数を定義
	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;

//プレイヤークラスの属性
	//プレイヤーの名前
	private String name_;
	// プレイヤーの勝った回数
	private int winCount_;

	public Murata(String name) {
		name_ = name;
	}
	
	public String getName() { 
		return name_;
	}
	
// [ジャンケンの手を出す]
	public int showHand() {
		// プレイヤー手を格納するための変数
		int hand = 0;
		// 0以上3未満の少数として乱数を得て変数randomNumに格納する
		double randomNum = Math.random() * 3;
		if(randomNum < 1) {
			hand = STONE;
		} else if (randomNum < 2) {
			hand = SCISSORS;
		} else if (randomNum < 3) {
			hand = PAPER;
		}
		return hand;
	}
	
	public void notifyResult(boolean result) {
		if (result == true) {
			winCount_++;
		} 
	}
	
	public int getWinCount() {
		return winCount_;
	}
}
