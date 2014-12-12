package primeministers;

import java.io.File;
import java.util.ArrayList;
import java.net.URL;

/**
 * 入出力：リーダ・ダウンローダ・ライタを抽象する。
 */
public abstract class IO extends Object
{
	/**
	 * テーブル(表:スプレッドシート)を記憶するフィールド
	 */
	protected Table table;
	
	/**
	 * 入出力のコンストラクタ
	 */
	public IO()
	{
		return;
	}
	
	/**
	 * ファイルやディレクトリを削除するクラスメゾット
	 */
	static void deleteFileOrDirectory(File aFile)
	{
		return;
	}
	
	/**
	 * 総理大臣ページのためのディレクトリ(存在しなければ作成して)を応答するクラスメゾット
	 */
	static File directoryOfPages()
	{
		return null;
	}
	
	/**
	 * 入出力する際の文字コードを応答するクラスメゾット
	 */
	static String encodingSymbol()
	{
		return null;
	}
	
	/**
	 * 指定されたファイルからテキストを読みこんで、それを行リストにして応答するクラスメゾット。
	 */
	static ArrayList<String> readTextFromFile(File aFile)
	{
		return null;
	}
	
	/**
	 * 指定されたファイル文字列からテキストを読み込んで、それを行リストにして応答するクラスメゾット
	 */
	static ArrayList<String> readTextFromFile(String fileString)
	{
		return null;
	}
	
	/**
	 * 指定されたURLからテキストを読み込んで、それを行リストにして応答するクラスメゾット
	 */
	static ArrayList<String> readTextFromURL(URL aURL)
	{
		return null;
	}
	
	/**
	 * 指定されたURL文字列からテキストを読み込んで、それを行リストにして応答するクラスメゾット
	 */
	static ArrayList<String> readTextFromURL(String urlString)
	{
		return null;
	}
	
	/**
	 * 文字列をセパレータで分割したトークン列を応答するクラスメゾと
	 */
	static ArrayList<String> splitString(String string,String separators)
	{
		return null;
	}
	
	/**
	 * テーブルを応答する。
	 */
	public Table table()
	{
		return null;
	}
	
	/**
	 * 指定された行リストを、指定されたファイルに書き出すクラスメゾット
	 */
	static void writeText(ArrayList<String> aCollection,File aFile)
	{
		return;
	}
	
	/**
	 * 指定された行リストを、指定されたファイル名のファイルに書き出すクラスメゾット
	 */
	static void writeText(ArrayList<String> aCollection,String fileString)
	{
		return;
	}
	
}
