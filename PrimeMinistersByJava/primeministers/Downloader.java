package primeministers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;


/**
 * ダウンローダ：総理大臣のCSVファイル・画像ファイル・サムネイル画像ファイルをダウンロードする。
 */
public class Downloader extends IO
{
	/**
	 * 総理大臣の情報を記したCSVファイルの在所(URL文字列)を記憶するフィールド
	 */
	private String url;

	/**
	 * ダウンローダーのコンストラクタ
	 */
	public Downloader()
	{
		this.url = this.urlString();
		System.out.println("[Downloader]URL:"+this.url);

		return;
	}

	/**
	 * 総理大臣の情報を記したCSVファイルをダウンロードする。
	 */
	public void downloadCSV()
	{
		 try
		 {
			 URL url = new URL(this.url + "PrimeMinisters.csv");

			 //入力用ストリーム
			 InputStream input = url.openStream();

			 //出力用ストリーム
			 OutputStream output = new FileOutputStream(new File(IO.directoryOfPages(),"PrimeMinisters.csv"));

			 try {
		            byte[] bytes = new byte[1024];
		            int len = 0;
		            while ((len = input.read(bytes)) > 0)
		            {
		                output.write(bytes,0,len);
		                //System.out.println("test");
		            }
		            output.flush();
		        }
			 finally
			 {
		            output.close();
		            input.close();
		     }
	    }
		catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return;
	}

	/**
	 * 総理大臣の画像群をダウンロードする。
	 */
	public void downloadImages()
	{
		return;
	}

	/**
	 * 総理大臣の画像群またはサムネイル画像群をダウンロードする。
	 */
	private void downloadPictures(int indexOfPicture)
	{
		return;
	}

	/**
	 * 総理大臣の画像群をダウンロードする。
	 */
	public void downloadThumbnails()
	{
		return;
	}

	/**
	 * 総理大臣の情報を記したCSVファイルの在処(URL)を文字列で応答する。
	 */
	public Table table()
	{
		return null;
	}

	/**
	 * 総理大臣の情報の在処(URL)を文字列で応答するクラスメゾット。
	 */
	static String urlString()
	{
		return "http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinisters/";
	}

	/**
	 * 総理大臣の情報を記したCSVファイルの在処(URL)を文字列で応答するクラスメゾット。
	 */
	static String urlStringOfCSV()
	{
		return null;
	}

}
