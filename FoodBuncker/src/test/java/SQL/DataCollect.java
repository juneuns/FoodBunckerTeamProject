package SQL;

import java.io.BufferedInputStream;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
 * 서울 데이터 광장 인증키 : 6b76785a7573756e36397a46435742
 * http://openapi.seoul.go.kr:8088/(인증키)/xml/InfoTrdarSelng/1/5/201606
 * pno	ALLEY_TRDAR_NO
1	12303	812
2	12443	732
3	12408	749
4	12385	763
5	12492	703
6	12396	758
7	12645	616
8	12597	644
9	13086	356
10	13341	191
11	13217	267
12	13336	195
13	13385	166
14	13471	111
15	12846	497
16	13635	15
17	13503	91
18	13495	95
19	11956	1000
20	12123	910
 */
public class DataCollect {
	public static final String MOVING = "InfoTrdarFlpop";
	public static final String SELLING = "InfoTrdarSelng";
 public DataCollect(String item) throws Exception{
         JSONParser jsonparser = new JSONParser();
         JSONObject jsonobject = (JSONObject)jsonparser.parse(readUrl(1,"201610",item));
         JSONObject json = (JSONObject) jsonobject.get(item);
         JSONArray data = (JSONArray) json.get("row");
//         JSONParser jsonparser = new JSONParser();
//         jsonobject = (JSONObject)jsonparser.parse(readUrl(1,"201602",SELLING));
//         json = (JSONObject) jsonobject.get(SELLING);
//         System.out.println(json);

//         JSONArray array = (JSONArray)json.get("dailyBoxOfficeList");
//         for(int i = 0 ; i < array.size(); i++){
//             JSONObject entity = (JSONObject)array.get(i);
//             String movieNm = (String) entity.get("movieNm");
//             System.out.println(movieNm);
//         }         
 }    
    private static String readUrl(int no,String yearmonth,String item) throws Exception {
        BufferedInputStream reader = null;
        try {
            URL url = new URL(
                    "http://openapi.seoul.go.kr:8088/"
                    + "6b76785a7573756e36397a46435742/"
                    + "json/"
                    + item+"/"
                    + no+"/"+no+"/"
                    + yearmonth);
            reader = new BufferedInputStream(url.openStream());
            StringBuffer buffer = new StringBuffer();
            int i;
            byte[] b = new byte[4096];
            while( (i = reader.read(b)) != -1){
              buffer.append(new String(b, 0, i));
            }
            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
 
    
    public static void main(String[] args) {
        try {
            new DataCollect(MOVING);
//            new DataCollect(SELLING);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}
