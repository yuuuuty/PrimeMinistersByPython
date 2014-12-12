package primeministers;


import java.util.ArrayList;
import java.io.BufferedWriter;
/**
 * ライタ：総理大臣の情報のテーブルをHTMLページとして書き出す。
 */
public class Writer extends IO
{
	/**
	 * ライタのコンストラクタ
	 */
	public Writer()
	{
		return;
	}
	
	/**
	 * 属性リストを応答する。
	 */
	public Attributes attributes()
	{
		return null;
	}
	
	/**
	 * ローカルなHTMLのインデックスファイル(index.html)を応答するクラスメゾット
	 */
	public Table table(Table aTable)
	{
		return null;
	}
	
	/**
	 *タプル群を応答する。
	 */
	public ArrayList<Tuple> tuples()
	{
		return null;
	}
	
	/**
	 *　属性リストを書き出す
	 */
	public void writeAttributesOn(BufferedWriter outputWriter)
	{
		return;
	}
	
	/**
	 * フッタを書き出す。
	 */
	public void writeFooterOn(BufferedWriter outputWriter)
	{
		return;
	}
	
	/**
	 *ヘッダを書き出す。
	 */
	public void writeHeaderOn(BufferedWriter outputWriter)
	{
		return;
	}
	
	/**
	 *ボディを書き出す。
	 */
	public void writeTableBodyOn(BufferedWriter outputWriter)
	{
		return;
	}
	
	/**
	 * ダプル群を書き出す。
	 */
	public void writeTuplesOn(BufferedWriter outputWriter)
	{
		return;
	}
}
