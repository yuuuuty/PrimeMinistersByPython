package primeministers;

import java.io.File;

/**
 * リーダ：総理大臣の情報を記したCSVファイルを読み込んでテーブルに仕立て上げる。
 */
public class Reader extends IO
{
	/**
	 * 総理大臣の情報を記したCSVファイルを記憶するフィールド
	 */
	private File filename;
	
	/**
	 * リーダのコンストラクタ
	 */
	public Reader()
	{
		return;
	}
	
	/**
	 * ダウンロードしたCSVファイルを応答
	 */
	public File filename()
	{
		return null;
	}
	
	/**
	 * ダウンロードしたCSVファイルのローカルなファイルを応答するクラスメゾット
	 */
	static File filenameOfCSV()
	{
		return null;
	}
	/**
	 * ダウンロードしたCSVファイルを読み込んでテーブルを応答する。
	 */
	public Table table()
	{
		return null;
	}
}
