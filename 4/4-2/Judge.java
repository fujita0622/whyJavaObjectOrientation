package lesson4;

// ジャンケンの審判を表すクラスを定義
public class Judge {
	
	public void startJanken(Player player1, Player player2) {
		// ジャンケンの開始を出力
		System.out.println("【ジャンケン開始】\n");
		
		//ジャンケンを３回行う
		for(int cnt = 0; cnt < 3; cnt++) {
			
			// 何回戦目か表示する
			System.out.println("【" + (cnt+1) + "回戦目】");
			
			// プレイヤーの手をみて、どちらが勝ちかを判定する
			Player winner = judgeJanken(player1, player2);
		
			if(winner != null) {
				System.out.println("\n" + winner.getName() + "が勝ちました！\n");
				//　勝ったプレイヤーに結果を伝える--③
				winner.notifyResult(true);
			} else {
				// 引き分けの場合
				System.out.println("引き分けです！\n");
			}
		}
		
		System.out.println("【ジャンケン終了】\n");
		
		// 最終的な勝者を判定する
		Player finalWinner = judgeFinalWinner(player1, player2);
		
		// 結果の表示
		System.out.print(
			player1.getWinCount() + "対" + player2.getWinCount() + "で"
		);
		
		if(finalWinner != null) {
			System.out.println(finalWinner.getName() + "の勝ちです！\n");
		} else {
			System.out.println("引き分けです！\n");
		}
	}
	
	// ジャンケン・ポンと声をかけ、プレイヤーの手を見て、どちらが勝ちかを判定する
	// @param player1 判定対象プレイヤー1
	// @param player2 判定対象プレイヤー2
	// @return 勝ったプレイヤー。引き分けの場合はnullで返す。
	private Player judgeJanken(Player player1, Player player2) {
		Player winner = null;
		
		//　プレイヤー1の手を出す--①
		int player1Hand = player1.showHand();
		//　プレイヤー2の手を出す--②
		int player2Hand = player2.showHand();
		
		// それぞれの手を表示する
		printHand(player1Hand);
		System.out.print(" vs. ");
		printHand(player2Hand);
		System.out.print("\n");
		
		// プレイヤー1が勝つ場合
		if(
			(player1Hand == Player.STONE && player2Hand == Player.SCISSORS)
			|| (player1Hand == Player.SCISSORS && player2Hand == Player.PAPER)
			|| (player1Hand == Player.PAPER && player2Hand == Player.STONE)
			) {
			winner = player1;
		// プレイヤー2が勝つ場合
		} else if (
		(player1Hand == Player.STONE && player2Hand == Player.PAPER)
		|| (player1Hand == Player.SCISSORS && player2Hand == Player.STONE)
		|| (player1Hand == Player.PAPER && player2Hand == Player.SCISSORS)
		) {
			winner = player2;
		}
		
		//　どちらでもない場合は引き分け(nullで返す)
		return winner;
	}
	
		
	// 最終的な勝者を判定する
	// @param player1 判定対象プレイヤー1
	// @param player2 判定対象プレイヤー2
	// @return 勝ったプレイヤー。引き分けの場合は null で返す。
	
	private Player judgeFinalWinner(Player player1, Player player2) {
		Player winner = null;
		
		// player1から勝ち数を聞く--④
		int player1WinCount = player1.getWinCount();
		
		// player2から勝ち数を聞く--⑤
		int player2WinCount = player2.getWinCount();
		
		if (player1WinCount > player2WinCount) {
			//プレイヤー1の勝ち
			winner = player1;
		} else if (player1WinCount < player2WinCount) {
			//プレイヤー2の勝ち
			winner = player2;
		}
		
		// どちらでもない場合は引き分け(nullを返す)
		
		return winner;
	}
	
	// ジャンケンの手を表示する
	// @param hand ジャンケンの手
		
	private void printHand(int hand) {
		switch (hand) {
			case Player.STONE :
				System.out.print("グー");
				break;
				
			case Player.SCISSORS :
				System.out.print("チョキ");
				break;
				
			case Player.PAPER :
				System.out.print("パー");
				break;
				
			default :
				break;
		}
	}
}

