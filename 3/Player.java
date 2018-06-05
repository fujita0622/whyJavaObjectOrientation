// work3-2 lesson2で作成したSimpleJanken.javaを参考にして、リスト3-1の各メソッドの中身(①〜③の部分)を作成し、Playerクラスを完成させなさい。

// [リスト3-1]
// ジャンケンのプレイヤーを表すクラス
// public class Player {
// 	public static final int STONE = 0; グー
// 	public static final int SCISSORS = 1; チョキ
// 	public static final int PAPER = 2; パー

// ================
// プレイヤーの属性
// ================
// プレイヤーの名前
// 	private String name_ = 0;
// 	プレイヤーの勝った回数
// 	private int winCount_ = 0;

// ========================
// プレイヤーのクラスの操作
// ========================
// ジャンケンの手を出す
// @return ジャンケンの手
// 	public int showHand() {
// 		① 実際の処理
// 	}

// 審判から勝敗を聞く
// @param result true:勝ち, false:負け
// 	public void notifyResult(boolean result) {
// 		② 実際の処理
// 	}

// 自分の勝った回数を答える
// @return 勝った回数
// 	public int getWinCount() {
// 		③ 実際の処理
// 	}
// }


// [回答]

// プレイヤークラスの定義
public class Player {
	// 「static final」でジャンケンの手を表す定数を定義
	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;

//[プレイヤークラスの属性]
	//アクセス修飾子「private」で外部のオブジェクトからアクセスできない「プレイヤーの名前」の変数を空で定義
	private String name_;
	//アクセス修飾子「private」で外部のオブジェクトからアクセスできない「プレイヤーの勝った回数」の変数を空で定義
	private int winCount_;
	
// [ジャンケンの手を出すメソッド]
	public int showHand() {
		// プレイヤー手を格納するための変数を定義
		int hand = 0;
		// 0以上3未満の少数として乱数を得て変数randomNumに格納する
		double randomNum = Math.random() * 3;
		// 変数randomNumが0.0以上1.0未満の場合
		if(randomNum < 1) {
		// 変数handに定数STONEを格納する
			hand = STONE;
		// 変数randomNumが1.0以上2.0未満の場合
		} else if (randomNum < 2) {
		// 変数handに定数SCISSORSを格納する
			hand = SCISSORS;
		// 変数randomNumが2.0以上3.0未満の場合
		} else if (randomNum < 3) {
		// 変数handに定数PAPERを格納する
			hand = PAPER;
		}
		// 「return」で変数handの値を戻り値として返す
		return hand;
	}
	
	// [審判が勝敗を聞くメソッド]
	// 「void」で戻り値なしに設定
	// ()内の引数の型は「boolean(真偽値)」を指定
	public void notifyResult(boolean result) {
		// 引数が「true」	の場合
		if (result == true) {
		//変数winCount_(プレイヤーの勝った回数)に1を加算
			winCount_++;
		} 
	}
	
	// [勝った回数を取り出すメソッド]

	public int getWinCount() {
	// 変数winCount_(プレイヤーの勝った回数)を戻り値として返す
		return winCount_;
	}
}
