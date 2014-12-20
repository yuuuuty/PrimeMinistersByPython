package primeministers;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.util.Date;
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
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/M/d");
		SimpleDateFormat sdf2 = new SimpleDateFormat("H:m:s");
        String name_string = "PrimeMinisters written by Python";
        String date_string = sdf1.format(date);
        String time_string = sdf2.format(date);
        outputWriter.write("\t\t\t\t\t</tbody>\n\t\t\t\t</table>\n\t\t\t</td>\n\t\t</tr>\n\t</tbody>\n</table>\n<hr>\n<div class=\"right-small\">Created using " + name_string + " " + date_string + " " + time_string + "</div>\n</body>\n</html>\n");

		return;
	}
	
	/**
	 *ヘッダを書き出す。
	 */
	public void writeHeaderOn(BufferedWriter outputWriter)
	{
		outputWriter.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n<html lang=\"ja\">\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n<meta http-equiv=\"Content-Style-Type\" content=\"text/css\">\n<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\">\n<meta name=\"keywords\" content=\"Smalltalk,Oriented,Programming\">\n<meta name=\"description\" content=\"Prime Ministers\">\n<meta name=\"author\" content=\"AOKI Atsushi\">\n<link rev=\"made\" href=\"http://www.cc.kyoto-su.ac.jp/~atsushi/\">\n<link rel=\"index\" href=\"index.html\">\n<style type=\"text/css\">\n<!--\nbody {\n\tbackground-color : #ffffff;\n\tmargin : 20px;\n\tpadding : 10px;\n\tfont-family : serif;\n\tfont-size : 10pt;\n}\na {\n\ttext-decoration : underline;\n\tcolor : #000000;\n}\na:link {\n\tbackground-color : #ffddbb;\n}\na:visited {\n\tbackground-color : #ccffcc;\n}\na:hover {\n\tbackground-color : #dddddd;\n}\na:active {\n\tbackground-color : #dddddd;\n}\ndiv.belt {\n\tbackground-color : #eeeeee;\n\tpadding : 0px 4px;\n}\ndiv.right-small {\n\ttext-align : right;\n\tfont-size : 8pt;\n}\nimg.borderless {\n\tborder-width : 0px;\n\tvertical-align : middle;\n}\ntable.belt {\n\tborder-style : solid;\n\tborder-width : 0px;\n\tborder-color : #000000;\n\tbackground-color : #ffffff;\n\tpadding : 0px 0px;\n\twidth : 100%;\n}\ntable.content {\n\tborder-style : solid;\n\tborder-width : 0px;\n\tborder-color : #000000;\n\tpadding : 2px 2px;\n}\ntd.center-blue {\n\tpadding : 2px 2px;\n\ttext-align : center;\n\tbackground-color : #ddeeff;\n}\ntd.center-pink {\n\tpadding : 2px 2px;\n\ttext-align : center;\n\tbackground-color : #ffddee;\n}\ntd.center-yellow {\n\tpadding : 2px 2px;\n\ttext-align : center;\n\tbackground-color : #ffffcc;\n}\n-->\n</style>\n<title>Prime Ministers</title>\n</head>\n<body>\n<div class=\"belt\">\n<h2>Prime Ministers</h2>\n</div>\n<table class=\"belt\" summary=\"table\">\n\t<tbody>\n\t\t<tr>\n\t\t\t<td>\n\t\t\t\t<table class=\"content\" summary=\"table\">\n\t\t\t\t\t<tbody>\n");
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
