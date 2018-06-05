// work2-2 リスト2-1〜2-8を1つのJavaプログラムとしてまとめ、ジャンケンプログラムを完成させてください。プログラムは「SimpleJanken.java」というファイル名で保存しなさい。

// [リスト2-1]
// ①プログラムが開始したことを表示する
// プログラム開始メッセージを表示する

// System.out.println("【ジャンケン開始】\n");


// [リスト2-2]
// ジャンケンの手を表す定数
// public static final int STONE = 0;
// public static final int SCISSORS = 1;
// public static final int PAPER = 2;


// [リスト2-3]
// 乱数を格納するための変数
// double randomNum = 0;

// ② プレイヤー1が何を出すか決める
// int player1Hand = 0;

// 0以上3未満の少数として乱数を得る
// randomNum = Math.random() * 3;
// if (randomNum < 1) {
// 	randomNumが0.0以上1.0未満の場合,グー
// 	player1Hand = STONE;

// 	プレイヤー1の手を表示する
// 	System.out.print("グー");
// }
// else if (randomNum < 2) {
// 	randomNum が 1.0 以上 2.0 未満の場合、チョキ
// 	player1Hand = SCISSORS;

// 	プレイヤー1の手を表示する
// 	System.out.print("チョキ");
// }
// else if (randomNum < 3) {
// 	randomNum が 2.0 以上 3.0 未満の場合、パー
// 	player1Hand = PAPER;

// 	プレイヤー1の手を表示する
// 	System.out.print("パー");
// }


// [リスト2-4]
// ③プレイヤー2が何を出すか決める
// int player2Hand = 0;

// 0以上3未満の少数として乱数を得る
// randomNum = Math.random() * 3;
// if (randomNum < 1) {
// 	randomNumが0.0以上1.0未満の場合,グー
// 	player2Hand = STONE;

// 	プレイヤー2の手を表示する
// 	System.out.print("グー");
// }
// else if (randomNum < 2) {
// 	randomNum が 1.0 以上 2.0 未満の場合、チョキ
// 	player2Hand = SCISSORS;

// 	プレイヤー2の手を表示する
// 	System.out.print("チョキ");
// }
// else if (randomNum < 3) {
// 	randomNum が 2.0 以上 3.0 未満の場合、パー
// 	player2Hand = PAPER;

// 	プレイヤー2の手を表示する
// 	System.out.print("パー");
// }


// [リスト2-5]
// プレイヤー1の勝ち数
// int player1WinCount = 0;

// プレイヤー2の勝ち数
// int player2WinCount = 0;

// ④ どちらが勝ちかを判定し、結果を表示する
// プレイヤー1が勝つ場合
// if (
// 		(player1Hand == STONE && player2Hand == SCISSORS)
// 		|| (player1Hand == SCISSORS && player2Hand == PAPER)
// 		|| (player1Hand == PAPER && player2Hand == STONE)
// 		) {
	// プレイヤー1の勝った回数を加算する
	// player1WinCount++;

	// ジャンケンの結果を表示する
	// System.out.println("\nプレイヤー1が勝ちました!\n");
// }

// プレイヤー2が勝つ場合
// else if (
// 	(player1Hand == STONE && player2Hand == PAPER)
// 	|| (player1Hand == SCISSORS && player2Hand == STONE)
// 	|| (player1Hand == PAPER && player2Hand == SCISSORS)
// 	) {
// プレイヤー2の勝った回数を加算する
	// player2WinCount++;
	// ジャンケンの結果を表示
// 	System.out.println("\nプレイヤー2が勝ちました！\n");
// } else {
// 引き分けの場合
// 	System.out.println("\n引き分けです\n");
// }


// [リスト2-6]
// ジャンケンを3回実施する
// ⑥勝負した回数を加算する
// ⑦3回勝負が終わったのか?
// for (int cnt = 0; cnt > 3; cnt++) {
	// ②〜⑤の処理を記述する
// }


// [リスト2-7]
// ⑧最終的な勝者を判定し、画面に表示する
// System.out.println("【ジャンケン終了】\n");

// プレイヤー1の勝ち数が多い時
// if (player1WinCount > player2WinCount) {
	// プレイヤー1の勝ちを表示する
	// System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー1の勝ちです");
// プレイヤー2の勝ち数が多い時
// } else if (player1WinCount < player2WinCount) {
	// プレイヤー2の勝ちを表示する
	// System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー2の勝ちです");
// プレイヤー1とプレイヤー2の勝ち数が同じ時
// } else if (player1WinCount == player2WinCount) {
	// 引き分けを表示する
// 	System.out.println(player1WinCount + "対" + player2WinCount + "で引き分けです");
// }


// [リスト2-8]
// オブジェクト指向を使用しないジャンケンプログラム
// public class SimpleJanken {
// public static final int STONE = 0;
// public static final int SCISSORS = 1;
// public static final int PAPER = 2;

// プログラムのスタートはここから
// public static void main(String[] args) {
// 	①〜⑧の処理をここに記述
// }



// SimpleJankenクラスでオブジェクト指向を使わないジャンケンプログラムを定義
public class SimpleJanken {
	
// 「static final」でジャンケンの手を表す定数を定義
	public static final int STONE = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;

// mainメソッドの中にジャンケンプログラムをまとめて記述
	public static void main(String[] args) {
		// ジャンケンの開始を「System.out.println」で出力(「println」なので改行付加)
		System.out.println("【ジャンケン開始】\n");
		
// ループ処理の前にループ内で使用する変数を定義
		// 乱数を浮動小数点数で格納するための変数 ()
		double randomNum = 0;
		// プレイヤー1の出す手を整数で格納する変数
		int player1Hand = 0;
		// プレイヤー2の出す手を整数で格納する変数
		int player2Hand = 0;
		// プレイヤー1の勝ち数を整数で格納する変数
		int player1WinCount = 0;
		// プレイヤー2の勝ち数を整数で格納する変数
		int player2WinCount = 0;
		

// ジャンケンを3回戦行うのでジャンケンの処理を3回ループさせる
		for(int cnt = 0; cnt < 3; cnt++){
			// ジャンケンが何回戦目かを「System.out.println」で出力(「println」なので改行付加)
			System.out.println("【" + (cnt+1) + "回戦】");
			
			// [プレイヤー1が何を出すか決める]
			// 0以上3未満の少数として乱数を得て変数randomNumに格納する
			randomNum = Math.random() * 3;
			// 変数randomNumが0.0以上1.0未満の場合
			if(randomNum < 1) {
			// 変数player1Handに定数STONEを格納する
				player1Hand = STONE;
			// 「System.out.print」で「グー」と出力(「print」なので改行なし)
				System.out.print("グー");
			// 変数randomNumが1.0以上2.0未満の場合
			} else if (randomNum < 2) {
			// 変数player1Handに定数SCISSORSを格納する
				player1Hand = SCISSORS;
			// 「System.out.print」で「チョキ」と出力(「print」なので改行なし)
				System.out.print("チョキ");
			// 変数randomNumが2.0以上3.0未満の場合
			} else if (randomNum < 3) {
			// 変数player1Handに定数PAPERを格納する
				player1Hand = PAPER;
			// 「System.out.print」で「パー」と出力(「print」なので改行なし)
				System.out.print("パー");
			}
			
			// 「[プレイヤー1の出す手] vs. [プレイヤー2の出す手]」のような形式で出力したいため、「 vs. 」を出力
			System.out.print(" vs. ");
			// [プレイヤー2が何を出すか決める]
			// 0以上3未満の少数として乱数を得て変数randomNumに格納する
			randomNum = Math.random() * 3;
			// 変数randomNumが0.0以上1.0未満の場合
			if(randomNum < 1) {
			// 変数player2Handに定数STONEを格納する
				player2Hand = STONE;
			//「System.out.print」で「グー」と出力(「print」なので改行なし)
				System.out.print("グー");
			// 変数randomNumが1.0以上2.0未満の場合
			} else if (randomNum < 2) {
				// 変数player1Handに定数SCISSORSを格納する
				player2Hand = SCISSORS;
			// 「System.out.print」で「チョキ」と出力(「print」なので改行なし)
				System.out.print("チョキ");
			// 変数randomNumが2.0以上3.0未満の場合
			} else if (randomNum < 3) {
			// 変数player1Handに定数PAPERを格納する
				player2Hand = PAPER;
			// 「System.out.print」で「パー」と出力(「print」なので改行なし)
				System.out.print("パー");
			}
			
			// どちらが勝ちか判定し結果を表示
			if(
			// プレイヤー1の勝利条件
			// プレイヤー1:グー かつ プレイヤー2:チョキ
				(player1Hand == STONE && player2Hand == SCISSORS)
			// プレイヤー1:チョキ かつ プレイヤー2:パー
				|| (player1Hand == SCISSORS && player2Hand == PAPER)
			// プレイヤー1:パー かつ プレイヤー2:グー
				|| (player1Hand == PAPER && player2Hand == STONE)
			) {
			// プレイヤー1の勝った回数として変数player1WinCountに1加算する
				player1WinCount++;
			// 「プレイヤー1が勝ちました」と出力
				System.out.println("\nプレイヤー1が勝ちました\n");
			// プレイヤー2の勝利条件
			} else if (
					// プレイヤー1:グー かつ プレイヤー2:パー
					(player1Hand == STONE && player2Hand == PAPER)
					// プレイヤー1:チョキ かつ プレイヤー2:グー
					|| (player1Hand == SCISSORS && player2Hand == STONE)
					// プレイヤー1:パー かつ プレイヤー2:チョキ
					|| (player1Hand == PAPER && player2Hand == SCISSORS)
				) {
				// プレイヤー2の勝った回数として変数player2WinCountに1加算する
					player2WinCount++;
					// 「プレイヤー2が勝ちました」と出力
					System.out.println("\nプレイヤー2が勝ちました\n");
				// プレイヤー1とプレイヤー2が同点だった場合
				} else {
				// 「引き分けです」と出力
					System.out.println("\n引き分けです\n");
				}
		}
		
		// 最終的な勝者を判定し、画面に表示する
		// ジャンケンの終了を出力
		System.out.println("【ジャンケン終了】");
		
		// プレイヤー1の勝った回数(変数player1WinCount)がプレイヤー2の勝った回数(変数player2WinCount)よりも多かった場合
		if (player1WinCount > player2WinCount) {
		// 「[プレイヤー1の勝った回数]対[プレイヤー2の勝った回数]でプレイヤー1の勝ちです」という形式で出力
			System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー1の勝ちです");
		// プレイヤー1の勝った回数(変数player1WinCount)がプレイヤー2の勝った回数(変数player2WinCount)よりも少なかった場合
		} else if (player1WinCount < player2WinCount) {
		// 「[プレイヤー1の勝った回数]対[プレイヤー2の勝った回数]でプレイヤー2の勝ちです」という形式で出力
			System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー2の勝ちです");
		// プレイヤー1の勝った回数(変数player1WinCount)がプレイヤー2の勝った回数(変数player2WinCount)が同点の場合
		} else if (player1WinCount == player2WinCount) {
		// 「[プレイヤー1の勝った回数]対[プレイヤー2の勝った回数]で引き分けです」という形式で出力
			System.out.println(player1WinCount + "対" + player2WinCount + "で引き分けです");
		}
	} 
}