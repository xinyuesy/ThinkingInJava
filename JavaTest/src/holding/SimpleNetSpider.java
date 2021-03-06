package holding;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SimpleNetSpider {
    public static void main(String[] args) {
    	new Thread()
    	{
    		public void run()
    		{
    	        try{
    	            URL u = new URL("https://www.baidu.com/");
    	            URLConnection connection = u.openConnection();
    	            HttpURLConnection htCon = (HttpURLConnection) connection;
    	            int code = htCon.getResponseCode();
    	            if (code == HttpURLConnection.HTTP_OK)
    	            { 
    	                System.out.println("find the website");
    	                BufferedReader in=new BufferedReader(new InputStreamReader(htCon.getInputStream()));
    	                String inputLine;
    	                while ((inputLine = in.readLine()) != null) 
    	                        System.out.println(inputLine);
    	                    in.close();
    	           }
    	           else
    	            {
    	                System.out.println("Can not access the website");
    	            }
    	        }
    	        catch(MalformedURLException e )
    	        {  
    	            System.out.println("Wrong URL");
    	        }
    	        catch(IOException e)
    	        {
    	            System.out.println("Can not connect");
    	        }
    		}
    	}.start();

    }
}*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class SimpleNetSpider
{
	public static String getPageContent(String strUrl, String strPostRequest, int maxLength)
	{
		// 读取结果网页
		StringBuffer buffer = new StringBuffer();
		System.setProperty("sun.net.client.defaultConnectTimeout", "5000");
		System.setProperty("sun.net.client.defaultReadTimeout", "5000");
		try
		{
			URL newUrl = new URL(strUrl);
			HttpURLConnection hConnect = (HttpURLConnection) newUrl.openConnection();
			// POST方式的额外数据
			if (strPostRequest.length() > 0)
			{
				hConnect.setDoOutput(true);
				OutputStreamWriter out = new OutputStreamWriter(hConnect.getOutputStream());
				out.write(strPostRequest);
				out.flush();
				out.close();
			}
			// 读取内容

			BufferedReader rd = new BufferedReader(new InputStreamReader(hConnect.getInputStream()));
			int ch;
			for (int length = 0; (ch = rd.read()) > -1 && (maxLength <= 0 || length < maxLength); length++)
				buffer.append((char) ch);
			String s = buffer.toString();
			s.replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "");
			System.out.println(s);

			rd.close();
			hConnect.disconnect();
			return buffer.toString().trim();
		} catch (Exception e)
		{
			// return "错误:读取网页失败！";
			//
			System.out.println("没有返回！");
			return null;

		}
	}

	public static void main(String[] args)
	{

		String url = "https://www.baidu.com/";
		String keyword = "人人";
		// createhttpClient p = new createhttpClient();
		// String response = p.createhttpClient(url, keyword); // 第一种方法
		getPageContent(url, "post", 100500);// 第二种方法
	}
}
