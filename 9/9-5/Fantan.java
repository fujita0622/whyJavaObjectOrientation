// 七並べプログラムの実行クラス Fantanクラスを定義 
public class Fantan {
	// mainメソッド七並べプログラムの一連の実行手順を定義
	public static void main(String[] args) {
		// ①進行役の生成
		// FantanMasterクラスをインスタンス化
		// 変数　master に格納
		Master master = new FantanMaster();
		
		// ②テーブルの生成
		// FantanTableクラスをインスタンス化
		// 変数　table に格納
		Table table = new FantanTable();
		
		// ③ルールの生成
		// FantanRuleクラスをインスタンス化
		// 変数　rule に格納
		Rule rule = new FantanRule();
		
		// ④プレイヤーの生成
		// FantanPlayerクラスをインスタンス化し 変数 murata　に格納  
		Player murata = new FantanPlayer("村田",master,table,rule);
		// FantanPlayerクラスをインスタンス化し 変数 yamada　に格納 
		Player yamada = new FantanPlayer("山田",master,table,rule);
		// FantanPlayerクラスをインスタンス化し 変数 saito　に格納
		Player saito = new FantanPlayer("斎藤",master,table,rule);
		
		// ⑤進行役へのプレイヤーの登録
		// Masterクラスの registerPlayerメソッド(ゲームに参加するプレイヤーを登録する)の引数に murata(村田[プレイヤー])を指定し、ゲームに参加するプレイヤーを登録する
		master.registerPlayer(murata);
		// Masterクラスの registerPlayerメソッド(ゲームに参加するプレイヤーを登録する)の引数に yamada(山田[プレイヤー])を指定し、ゲームに参加するプレイヤーを登録する
		master.registerPlayer(yamada);
		// Masterクラスの registerPlayerメソッド(ゲームに参加するプレイヤーを登録する)の引数に saito(斎藤[プレイヤー])を指定し、ゲームに参加するプレイヤーを登録する
		master.registerPlayer(saito);
		
		// ⑥トランプを生成
		// Fantanクラスで定義した createTrumpメソッドで七並べに使うカードの生成し変数 trump に格納
		Hand trump = createTrump();
		
		// ⑦ゲームの準備
		// Masterクラスで定義した prepareGameメソッドの引数に 変数trump(七並べ用のカード)を指定し、七並べ用のカードをシャッフルし参加プレイヤーに配る
		master.prepareGame(trump);
		
		// ⑧ゲームの開始
		// Masterクラスで定義した startGameメソッドでゲームを開始する
		master.startGame();
	}
	
	// 七並べ用のカード生成する createTrumpメソッドを定義 
	public static Hand createTrump() {
		// Handクラスをインスタンス化し変数 trump に格納 
		Hand trump = new Hand();
		// トランプの数字(1 〜 13(Card.CARD_NUM))分ループ処理
		for (int number = 1; number <= Card.CARD_NUM; number++) {
			// Handクラスの addCard メソッド(引数のカードを加える)で引数(スートのクラブ と 変数number の数字の組み合わせのカード)で指定したカードを、を変数trump に加える 
			trump.addCard(new Card(Card.SUIT_CLUB, number));
			// Handクラスの addCard メソッド(引数のカードを加える)で引数(スートのダイアモンド と 変数number の数字の組み合わせのカード)で指定したカードを、を変数trump に加える
			trump.addCard(new Card(Card.SUIT_DIAMOND, number));
			// Handクラスの addCard メソッド(引数のカードを加える)で引数(スートのハート と 変数number の数字の組み合わせのカード)で指定したカードを、を変数trump に加える
			trump.addCard(new Card(Card.SUIT_HEART, number));
			// Handクラスの addCard メソッド(引数のカードを加える)で引数(スートのスペード と 変数number の数字の組み合わせのカード)で指定したカードを、を変数trump に加える
			trump.addCard(new Card(Card.SUIT_SPADE, number));
		}
		// ループ処理で生成した52枚(4(スート) * 13(数字))のカードが格納されている変数 trump を戻り値として返す
		return trump; 
	}
}