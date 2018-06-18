// ばば抜きゲームの実行クラス OldMaidクラスを定義
public class OldMaid {
	// ばば抜きゲームの実行手順を mainメソッド内に記述
	public static void main(String[] args) {
		// 進行役の生成
		// Masterクラスをインスタンス化し、変数master に格納
		Master master = new Master();
		
		// テーブルの生成
		// Masterクラスをインスタンス化し、変数master に格納
		Table table = new OldMaidTable();
		
		// ルールの生成
		// OldMaidRuleクラスをインスタンス化し、変数rule に格納
		Rule rule = new OldMaidRule();
		
		// プレイヤーを生成
		// OldMaidPlayerクラスをインスタンス化し,変数 murata 格納
		Player murata = new OldMaidPlayer("村田", master, table, rule);
		// OldMaidPlayerクラスをインスタンス化し,変数 yamada 格納
		Player yamada = new OldMaidPlayer("山田", master, table, rule);
		// OldMaidPlayerクラスをインスタンス化し,変数 saito 格納
		Player saito = new OldMaidPlayer("斎藤", master, table, rule);
		
		// プレイヤーを登録
		// Masterクラスの registerPlayerメソッドで引数に指定したmurataプレイヤーをゲーム参加プレイヤーとして登録する
		master.registerPlayer(murata);
		// Masterクラスの registerPlayerメソッドで引数に指定したyamadaプレイヤーをゲーム参加プレイヤーとして登録する
		master.registerPlayer(yamada);
		// Masterクラスの registerPlayerメソッドで引数に指定したsaitoプレイヤーをゲーム参加プレイヤーとして登録する
		master.registerPlayer(saito);
		
		// トランプを生成
		// 下記で定義した createTrumpメソッドでゲームに使用するトランプを生成し、変数trump に格納
		Hand trump = createTrump();
		
		// ゲームの準備
		// Masterクラスの prepareGameメソッドに引数 trump(ゲームで使用するトランプ)を指定し、ゲームの準備をする
		master.prepareGame(trump);
		
		// ゲーム開始
		// Masterクラスの startGameメソッドでゲームを開始する
		master.startGame();
	}
	
		// ばば抜きに使用するカード(53枚)を生成する createTrump メソッドを定義
		public static Hand createTrump() {
			// Handクラスをインスタンス化し 配列trumpに格納
			Hand trump = new Hand();
			//トランプの数字(1 ~ 13)分ループ処理 スート(4) * 数字(13) = 52枚生成
			for(int number = 1; number <= Card.CARD_NUM; number++) {
				// クラブのカードを 1 〜 13まで生成し,Handクラスの　addCard　メソッドで 配列trumpに追加
				trump.addCard(new Card(Card.SUIT_CLUB, number));
				// ダイヤのカードを 1 〜 13まで生成し,Handクラスの　addCard　メソッドで 配列trumpに追加
				trump.addCard(new Card(Card.SUIT_DIAMOND, number));
				// ハートのカードを 1 〜 13まで生成し,Handクラスの　addCard　メソッドで 配列trumpに追加
				trump.addCard(new Card(Card.SUIT_HEART, number));
				// スペードのカードを 1 〜 13まで生成し,Handクラスの　addCard　メソッドで 配列trumpに追加
				trump.addCard(new Card(Card.SUIT_SPADE, number));
			}
			// ジョーカーをカードを生成し,Handクラスの　addCard　メソッドで 配列trumpに追加
			trump.addCard(new Joker());
			// 52 + 1(ジョーカー)の計53枚を格納した 配列trumpを戻り値として返す
			return trump;
		}
}
