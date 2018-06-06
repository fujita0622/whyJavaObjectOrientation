// グー・チョキ・パーを順番に出す CyclicTactics クラスを定義
// CyclicTactics クラスは Tacticsインターフェイスの実装クラス
public class CyclicTactics implements Tactics {
	//対戦回数を数える cnt 変数を定義(初期値:0)
	int cnt = 0;

	//readTactics 
	public int readTactics() {
		// ジャンケンの手を格納する hand 変数を定義
		int hand = 0;
		
		// 一回戦の場合
		if (cnt == 0) {
		// hand 変数に グーを格納
			hand = Player.STONE;
		// 二回戦の場合
		} else if (cnt == 1) {
		// hand 変数に チョキを格納
			hand = Player.SCISSORS;
		// 三回戦の場合
		} else if (cnt == 2) {
		// hand 変数に パーを格納
			hand = Player.PAPER;
		} 
		
		// cnt変数に1を加える
		cnt++;
		// ジャンケンの手を戻り値として返す
		return hand;
	}
}