package cn.uestc.hotel.service;

import cn.uestc.hotel.mapper.CustomerMapper;
import cn.uestc.hotel.mapper.HotelMapper;
import cn.uestc.hotel.mapper.OrderFormMapper;
import cn.uestc.hotel.mapper.RoomMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.util.Date;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class BasicService {

    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private HotelMapper hotelMapper;
    @Autowired
    private OrderFormMapper orderFormMapper;
    @Autowired
    private RoomMapper roomMapper;

    public int getDays(String arrivetime, String lefttime) {
        int year1 = Integer.valueOf(arrivetime.substring(0, 4));
        int month1 = Integer.valueOf(arrivetime.substring(5, 7));
        int day1 = Integer.valueOf(arrivetime.substring(8, 10));
        Date date1 = new Date(year1, month1, day1);

        int year2 = Integer.valueOf(lefttime.substring(0, 4));
        int month2 = Integer.valueOf(lefttime.substring(5, 7));
        int day2 = Integer.valueOf(lefttime.substring(8, 10));
        Date date2 = new Date(year2, month2, day2);


        int days = (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
        return days;

    }

    public String getAddresses(String content, String encodingString)
            throws UnsupportedEncodingException {
        try {
            // 这里调用淘宝API
            String urlStr = "http://ip.taobao.com/service/getIpInfo.php";
            // 从http://whois.pconline.com.cn取得IP所在的省市区信息
            String returnStr = getResult(urlStr, content, encodingString);


            if (returnStr != null) {
                // 处理返回的省市区信息
                returnStr = decodeUnicode(returnStr);
                String[] temp = returnStr.split(",");
                if (temp.length < 3) {
                    return "0";//无效IP，局域网测试
                }
                return returnStr;
            }
        } catch (Exception e) {

        }
        return null;
    }

    private String getResult(String urlStr, String content, String encoding) {
        URL url = null;
        HttpURLConnection connection = null;
        try {
            url = new URL(urlStr);
            connection = (HttpURLConnection) url.openConnection();// 新建连接实例
            connection.setConnectTimeout(8000);// 设置连接超时时间，单位毫秒
            connection.setReadTimeout(8000);// 设置读取数据超时时间，单位毫秒
            connection.setDoOutput(true);// 是否打开输出流 true|false
            connection.setDoInput(true);// 是否打开输入流true|false
            connection.setRequestMethod("POST");// 提交方法POST|GET
            connection.setUseCaches(false);// 是否缓存true|false
            connection.connect();// 打开连接端口
            DataOutputStream out = new DataOutputStream(connection
                    .getOutputStream());// 打开输出流往对端服务器写数据
            out.writeBytes(content);// 写数据,也就是提交你的表单 name=xxx&pwd=xxx
            out.flush();// 刷新
            out.close();// 关闭输出流

            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(), encoding));// 往对端写完数据对端服务器返回数据
            // ,以BufferedReader流来读取


            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            reader.close();
            return buffer.toString();
        } catch (Exception e) {

        } finally {
            if (connection != null) {
                connection.disconnect();// 关闭连接
            }
        }
        return null;
    }

    public String decodeUnicode(String theString) {
        char aChar;
        int len = theString.length();
        StringBuffer outBuffer = new StringBuffer(len);
        for (int x = 0; x < len; ) {
            aChar = theString.charAt(x++);
            if (aChar == '\\') {
                aChar = theString.charAt(x++);
                if (aChar == 'u') {
                    int value = 0;
                    for (int i = 0; i < 4; i++) {
                        aChar = theString.charAt(x++);
                        switch (aChar) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                value = (value << 4) + aChar - '0';
                                break;
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                value = (value << 4) + 10 + aChar - 'a';
                                break;
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                value = (value << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException(
                                        "Malformed      encoding.");
                        }
                    }
                    outBuffer.append((char) value);
                } else {
                    if (aChar == 't') {
                        aChar = '\t';
                    } else if (aChar == 'r') {
                        aChar = '\r';
                    } else if (aChar == 'n') {
                        aChar = '\n';
                    } else if (aChar == 'f') {
                        aChar = '\f';
                    }
                    outBuffer.append(aChar);
                }
            } else {
                outBuffer.append(aChar);
            }
        }
        return outBuffer.toString();
    }

    public String getV4IP() {
        String ip = "";
        String chinaz = "http://ip.chinaz.com";

        StringBuilder inputLine = new StringBuilder();
        String read = "";
        URL url = null;
        HttpURLConnection urlConnection = null;
        BufferedReader in = null;
        try {
            url = new URL(chinaz);
            urlConnection = (HttpURLConnection) url.openConnection();
            in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
            while ((read = in.readLine()) != null) {
                inputLine.append(read + "\r\n");
            }
            //System.out.println(inputLine.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }


        Pattern p = Pattern.compile("\\<dd class\\=\"fz24\">(.*?)\\<\\/dd>");
        Matcher m = p.matcher(inputLine.toString());
        if (m.find()) {
            String ipstr = m.group(1);
            ip = ipstr;
            //System.out.println(ipstr);
        }
        return ip;
    }

    public String showIP() throws Exception {

        try {
            String ip = this.getV4IP();//获得本机IP
            while (ip == null) {
                ip = this.getV4IP();
            }
            String address = "";
            try {
                address = this.getAddresses("ip=" + ip, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            JSONObject jsonObject = new JSONObject(address);
            jsonObject = jsonObject.getJSONObject("data");
            //通过相应的get方法,获取相应的属性
            String county = jsonObject.getString("country_id");//国家
            String region = jsonObject.getString("region");//省份
            String city = jsonObject.getString("city");//城市
            String telecom = jsonObject.getString("isp");//运营商
            return city;
        } catch (Exception e) {
            return "false";
        }



    }


}
