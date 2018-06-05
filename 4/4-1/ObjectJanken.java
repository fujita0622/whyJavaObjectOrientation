public class ObjectJanken {
	public static void main(String[] args) {
		// 審判(斎藤さん)のインスタンス作成
		Judge saito = new Judge();
		// 村田さんの生成
		Murata murata = new Murata("村田さん");
		// 山田さんの生成
		Yamada yamada = new Yamada("山田さん");
		// 村田さんと山田さんをプレイヤーとしてジャンケンを開始する
		saito.startJanken(murata, yamada);
	}
}