//  ObjectJanken クラスを定義
public class ObjectJanken {
	// ObjectJanken クラスが呼び出された際に実行する mainメソッドを定義
	public static void main(String[] args) { 
		// 審判のインスタンス生成
		Judge Judge = new Judge();
		
		// 村田さんというプレイヤークラスのインスタンスを生成
		Player murata = new Player("村田さん");
		
		//村田さんに渡す戦略クラスのインスタンスを生成
		// ランダムに手を出す
		Tactics murataTactics = new CyclicTactics();
		
		// murataインスタンスに生成した戦略インスタンス(murataTactics)を渡す
		murata.setTactics(murataTactics);
		
		// 山田さんというプレイヤークラスのインスタンスを生成
		Player yamada = new Player("山田さん");
		
		//yamadaインスタンスに渡す戦略クラスのインスタンスを生成
		Tactics yamadaTactics = new CyclicTactics();
		
		// //yamadaインスタンスに生成した戦略インスタンス(yamadaTactics)を渡す
		yamada.setTactics(yamadaTactics);
		
		// 審判インスタンスのstartJankenメソッドを実行
		Judge.startJanken(murata, yamada);
	}
}
