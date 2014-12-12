package primeministers;

import java.util.ArrayList;
import java.awt.image.BufferedImage;
/**
 * 表：総理大臣の情報テーブル。
 */
public class Table extends Object
{
	/**
	 * 属性リストを記憶するフィールド
	 */
	private Attributes attributes;
	
	/**
	 * 画像群を記憶するフィールド。
	 */
	private ArrayList<BufferedImage> images;
	
	/**
	 * サムネイル画像群を記憶するフィールド。
	 */
	private ArrayList<BufferedImage> thumbnails;
	
	/**
	 * タプル群を記憶するフィールド。
	 */
	private ArrayList<Tuple> tuples;
	
	/**
	 * テーブルのコンストラクタ
	 */
	public Table()
	{
		return;
	}
	
	/**
	 * タプルを追加する。
	 */
	public void add(Tuple aTuple)
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
	 * 属性リストを設定する。
	 */
	public void attributes(Attributes instanceOfAttributes)
	{
		return;
	}
	
	/**
	 * 画像群を応答する。
	 */
	public ArrayList<BufferedImage> images()
	{
		return null;
	}
	
	/**
	 * 画像またはサムネイル画像の文字列を受け取って当該画像を応答する。
	 */
	private BufferedImage picture(String aString)
	{
		return null;
	}
	
	/**
	 * サムネイル画像群を応答する。
	 */
	public ArrayList<BufferedImage> thumbnails()
	{
		return null;
	}
	
	/**
	 * 自分自身を文字列にして。それを反応する。
	 */
	public String toString()
	{
		return null;
	}
	
	/**
	 * ダプル群を応答する。
	 */
	public ArrayList<Tuple> tuples()
	{
		return null;
	}
}
