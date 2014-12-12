package primeministers;

import java.util.ArrayList;

/**
 * 属性群：総理大臣の情報テーブルを入出力する際の属性情報を記憶。
 */
public class Attributes extends Object
{
	
	/**
	 * 属性リストのキー群を記憶フィールド。
	 */
	private ArrayList keys;
	
	/**
	 * 属性リストの名前群を記憶するフィールド
	 */
	private ArrayList names;
	
	
	/**
	 * 入力用("input")または出力用("output")で属性リストを作成するコンストラクタ。
	 */
	public Attributes(String aString)
	{
		return;
	}
	
	/**
	 * 指定されたインデックスに対応する名前を応答する。名前がないときはキーを応答する。
	 */
	protected String at(int index)
	{
		return null;
	}
	
	/**
	 * 指定されたキー文字列のインデックスを応答する。
	 */
	private int indexOf(String aString)
	{
		return 0;
	}
	
	/**
	 * 在位日数のインデックスを応答する
	 */
	public int indexOfDays()
	{
		return 0;
	}
	
	/**
	 * 画像のインデックスを応答する。
	 */
	public int indexOfImage()
	{
		return 0;
	}
	
	/**
	 * ふりがなのインデックスを応答する。
	 */
	public int indexOfkana()
	{
		return 0;
	}
	
	/**
	 * 氏名のインデックスを応答する。
	 */
	public int indexOfName()
	{
		return 0;
	}
	
	/**
	 * 番号のインデックスを応答する。
	 */
	public int indexOfNo()
	{
		return 0;
	}
	
	/**
	 * 代のインデックスを応答する。
	 */
	public int indexOfOrder()
	{
		return 0;
	}
	
	/**
	 * 政党のインデックスを応答する。
	 */
	public int indexOfParty()
	{
		return 0;
	}
	
	/**
	 * 在位期間のインデックスを応答する。
	 */
	public int indexOfPeriod()
	{
		return 0;
	}
	
	/**
	 * 出身地のインデックスを応答する。
	 */
	public int indexOfPlace()
	{
		return 0;
	}
	
	/**
	 * サムネイル画像のインデックスを応答する。
	 */
	public int indexOfThumbnail()
	{
		return 0;
	}
	
	/**
	 * 指定されたインデックスに対応するキーを応答する。
	 */
	protected String keyAt(int index)
	{
		return null;
	}
	
	/**
	 * キー郡を応答する。
	 */
	public ArrayList<String> keys()
	{
		return null;
	}
	
	/**
	 * 指定されたインデックスに対応する名前を応答する。
	 */
	protected String nameAt(int index)
	{
		return null;
	}
	
	/**
	 * 名前群を応答する。
	 */
	public ArrayList<String> names()
	{
		return null;
	}
	
	/**
	 * 名前郡を設定する。
	 */
	public void names(ArrayList<String> aCollection)
	{
		return;
	}
	
	/**
	 * 属性リストの長さを応答する。
	 */
	public int size()
	{
		return 0;
	}
	
	/**
	 * 自身を文字列にして、それを応答する。
	 */
	public String toString()
	{
		return null;
	}
}
