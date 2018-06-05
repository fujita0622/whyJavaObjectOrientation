package lesson4;

public class ObjectJanken {
	public static void main(String[] args) {
		// 審判(斎藤さん)のインスタンス作成
		Judge saito = new Judge();
		// 村田さんのインスタンスを生成
		Player murata = new Murata("村田さん");
		// 山田さんのインスタンスを生成
		Player yamada = new Yamada("山田さん");
		// 村田さんと山田さんをプレイヤーとしてジャンケンを開始する
		saito.startJanken(murata, yamada);
	}
}