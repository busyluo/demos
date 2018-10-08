package language;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;

public class Article {
	
	@Test
	public void test1() {
		//6216613100020468529
		String urlstr = "https://ccdcapi.alipay.com/validateAndCacheCardInfo.json?_input_charset=utf-8&cardNo=6221886712000985403&cardBinCheck=true";
		StringBuffer response = new StringBuffer();
		
		try {
			URL url = new URL(urlstr);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			
			String inputLine;
		    while ((inputLine = in.readLine()) != null){
		    	response.append(inputLine);
		    }
		  
		    in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(response);
		
		
		JSONObject parseObject = JSONObject.parseObject(response.toString());
		System.out.println(parseObject);
		System.out.println(parseObject.get("bank"));
		
	}
	
	
	
	@Test
	public void test2(){
		
		String urlstr = "https://ccdcapi.alipay.com/validateAndCacheCardInfo.json?_input_charset=utf-8&cardNo=9558822010005085629&cardBinCheck=true";
		
		StringBuffer buffer = new StringBuffer();  
        try {  
            URL url = new URL(urlstr);  
            HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();  

            httpUrlConn.setDoOutput(false);  
            httpUrlConn.setDoInput(true);  
            httpUrlConn.setUseCaches(false);  

            httpUrlConn.setRequestMethod("GET");  
            httpUrlConn.connect();  

            // �����ص�������ת�����ַ���  
            InputStream inputStream = httpUrlConn.getInputStream();  
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");  
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  

            String str = null;  
            while ((str = bufferedReader.readLine()) != null) {  
                buffer.append(str);  
            }  
            bufferedReader.close();  
            inputStreamReader.close();  
            // �ͷ���Դ  
            inputStream.close();  
            inputStream = null;  
            httpUrlConn.disconnect();  

        } catch (Exception e) {  
           e.printStackTrace();
        }  
        
        System.out.println(buffer);
        
	}
	
	/**
	 * @Title:	What is the meaning of life?
	 * @Author:	Joker
	 * @Date:	2018-05-03
	 * @Description: Why do we feel that life is meaningless?
	 
	 	          ��ʵ��������Ҫ�ش�Ϊʲô����������Ӧ����һ���ǲ��ǡ����ԣ������ǲ��������壿
	 	          
			���룬���ű����Ų�û�����塣
			
			���磬ĳһ�������Ժ��������������Լ���һ���ĵ��ϡ��㲻֪��������ʲô���飬��
		��֪���Լ�Ϊʲô���������������Ȼ��֪���������������ʲô�����������嶼̸���ϡ�
		
			��ʵ���������ǵ�����������û������ѡ����뵽��������У������Ǳ����������
		����ġ�������������˭���ȣ���ʲôԭ����ȶ���֪������������һ�ַ�ʽ���������ϣ�
		������ң�����ü�������ȥ��������
		
			��ʵ����������ܶԲ��ԣ������Ѿ�����ش���������⡣����ʵ�󲿷����������
		���˶��������ᣬ��Ҳ����������ؾ�������û�������ˣ����ֻ�������������׶��Ե����ѡ�
		���ึ�����ջ����٣��������࣬������ϣ����
		
			���ԣ����԰����������������һ�¡���Ȼ���ű���û�����壬���ܲ��ҵ��ǣ����Ǳ�������
		��������ʱ�򻹱�������һ�������������������ġ���Ϊ�����ĵĴ��ڣ����ǲ��ɱ���ز�����̽
		������������������̽���Ĺ����У������޷�����ض������������˸�������������磺����
		���ǿ���ƴ�İ����ǣ�����õ���������С�컨�����뿼���óɼ��ø�ĸ������̨���ԣ�
		ͻȻ����̸�����ˣ����㻹���ϸ��У����㻹��̸�ˣ�ͻȻ�㻹�����ϸ��ô�ѧ����������ÿ��
		����ѧϰ��;ͻȻ�͸��ҹ����ˣ�������������ô�Ѽ�����úÿ�Щ��ͻȻ�ָÿ��ǽ������
		�ˣ�������ÿ�������Ӧ���Ź�����
		
			���ԣ�������������֮������ô��֪ƣ��ر����ţ�ֻ����Ϊ���ǲ�����ĳЩ�������Ӷ�
		��������������Ҫһ��һ��ȥ��ɵ�Ŀ�ꡣ˵�ø����¶�Щ���ǣ����ǵ��������ͷ��
		
			���ԣ��侲����һ�롣���벻������������ߵ�ʲô�������벻�������������µ�ʲô��
		����룬��ô���������ͻ���������ġ�
		
			���������绹������ȥ����ģ���������ȥ���ܵĶ�������������绹������ȥ������
		��ȥ����������ȥ�����Ķ������ǾͲ�Ҫ����Ϊ����ǰ�����Ѷ�ȥ������������塣
		
			�������ˣ���Ͳ�������˵�������ǻ��˸߼�Ǯ���򵽵�����ģʽ�����������ġ�
	 */
	public String findMeaningOfLife() {
		
		return "Sorry,little guy. There is no meaning of life.";
	}
	
	/**
	 * ��С�
	 * 
	 * С��
	 * 
	 * �����ֳ�
	 * 
	 * û����
	 * 
	 * û�д�                          
	 * 
	 * ���ðѾ�Կ��
	 * 
	 * ���ź���ǽ
	 * 
	 * 
	 */

}
