package demo;

import demo.util.CommUtils;
import demo.util.Constants;

import java.io.File;
import java.net.URL;
import java.util.HashMap;

/**
 * @Description:调用face++API进行证件识别Demo：身份证、银行卡
 * @Author: kevin
 * @Date 15:02 2018/5/13
 */
public class IdCardDemo {

    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("api_key", Constants.api_key);
        map.put("api_secret", Constants.api_secret);

        // 上传身份证图片
//        URL urlStr = IdCardDemo.class.getClassLoader().getResource("images/idCardFont02.jpg");//正面
//        URL urlStr = IdCardDemo.class.getClassLoader().getResource("images/idCardBack02.jpg");//反面

        // 上传银行卡图片
//        URL urlStr = IdCardDemo.class.getClassLoader().getResource("images/bankCardFont02.jpg");//正面
        URL urlStr = IdCardDemo.class.getClassLoader().getResource("images/bankCardBack01.jpg");//反面

        File file = new File(urlStr.getFile());
        byte[] buff = CommUtils.getBytesFromFile(file);

        // 请求参数
        map.put("return_landmark", "1");
        map.put("return_attributes", "gender,age,smiling,headpose,facequality,blur,eyestatus,emotion,ethnicity,beauty,mouthstatus,eyegaze,skinstatus");

//         调用face++API识别
//        String url = Constants.OCR_IDCARD_API;//身份证识别API
        String url = Constants.OCR_BANKCARD_API;//银行卡API

        CommUtils.getResult(buff, url,map);
    }

}

