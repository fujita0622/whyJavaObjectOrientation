public interface Rule {
	//テーブルに置けるカードを探す
	public Card[] findCandidate(Hand hand, Table table);
		
}
