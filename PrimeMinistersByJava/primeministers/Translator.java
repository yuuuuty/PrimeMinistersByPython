package primeministers;

import javax.swing.JOptionPane;

/**
 * トランスレータ：総理大臣のCSVファイルをHTMLページへと変換するプログラム。
 */
public class Translator extends Object
{

	/**
	 * CSVに由来するテーブルを記憶するフィールド
	 */
	private Table inputTable;

	/**
	 * HTMLに由来するテーブルを記憶するフィールド
	 */
	private Table outputTable;

	/**
	 * トランスレータのコンストラクタ。
	 */
	public Translator()
	{
		super();
		this.inputTable = new Table();
		this.outputTable = new Table();
		return;
	}

	/**
	 * 総理大臣のCSVファイルをHTMLページへ変換する。
	 */
	public void perform()
	{
		//ダウンロードを使ってCSVをダウンロードしてくる
		Downloader aDownloader = new Downloader();
		aDownloader.downloadCSV();

		String aString = "総理大臣のCSVファイルからHTMLページへの変換を無事に完了しました。\n";
		JOptionPane.showMessageDialog(null, aString, "報告", JOptionPane.PLAIN_MESSAGE);
		return;
	}

	/**
	 * 在位日数を計算して、それを文字列にして応答する。
	 */
	public String computeNumberOfDays(String periodString)
	{
		return null;
	}

	/**
	 * サムネイルが画像から画像へ飛ぶためのHTML文字列を作成して、それを応答する。
	 */
	public String computeNumberOfImage(String periodString,Tuple aTuple,int no)
	{
		return null;
	}

	/**
	 * 総理大臣のCSVファイルを基にしたテーブルから、HTMLページを基にするテーブルに変換して、それを応答する。
	 */
	public Table table(Table aTable)
	{
		return null;
	}


}
