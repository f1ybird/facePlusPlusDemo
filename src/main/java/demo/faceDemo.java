package demo;

import demo.util.CommUtils;
import demo.util.Constants;

import java.io.File;
import java.net.URL;
import java.util.HashMap;

/**
 * @Description:调用face++API进行人脸识别Demo
 * @Author: kevin
 * @Date 15:02 2018/5/13
 */
public class faceDemo {

    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("api_key", Constants.api_key);
        map.put("api_secret", Constants.api_secret);

        // 1.detect API 检测人脸获取face_token

//        // 样本图片
//        URL urlStr = faceDemo.class.getClassLoader().getResource("images/face04.jpg");
//        File file = new File(urlStr.getFile());
//        byte[] buff = CommUtils.getBytesFromFile(file);
//
//        // 请求参数
//        map.put("return_landmark", "1");
//        map.put("return_attributes", "gender,age,smiling,headpose,facequality,blur,eyestatus,emotion,ethnicity,beauty,mouthstatus,eyegaze,skinstatus");
//
//        // 调用API并返回结果
//        CommUtils.getResult(buff, Constants.FACE_DETECT_API,map);

        // 1,2为同一个人的两张图片的face_token，3和4为另外一个人
        String face_token1 = "d83bf8679d33830fbce4d7517efd015d";
        String face_token2 = "662686b68664ae9118c216baa1677f22";
        String face_token3 = "d4912948921e918400c03d0e6b112d17";
        String face_token4 = "db06c78a810b244d277cf3c077e59542";

        // 2.compare API 比对两个人脸是否为同一个人，根据face_token比对

//        URL urlStr = faceDemo.class.getClassLoader().getResource("images/face03.jpg");
//        File file = new File(urlStr.getFile());
//        byte[] buff = CommUtils.getBytesFromFile(file);
//
//        map.put("face_token1", face_token1);
//        map.put("face_token2", face_token2);
//
//        CommUtils.getResult(buff, Constants.FACE_COMPARE_API,map);

        // 3.创建faceSet

//        URL urlStr = faceDemo.class.getClassLoader().getResource("images/face01.jpg");
//        File file = new File(urlStr.getFile());
//        byte[] buff = CommUtils.getBytesFromFile(file);
//
//        map.put("tags", "Obama");
//        map.put("face_tokens", face_token1+","+face_token3);
//
//        CommUtils.getResult(buff, Constants.FACESET_CREATE_API,map);
//
        String faceset_token = "09d2d5562d52d84faeee8fe4ee799cc5";

        // 3.添加faceSet

//        URL urlStr = faceDemo.class.getClassLoader().getResource("images/face01.jpg");
//        File file = new File(urlStr.getFile());
//        byte[] buff = CommUtils.getBytesFromFile(file);
//
//        map.put("faceset_token", faceset_token);
//        map.put("face_tokens", face_token1+","+face_token3);
//
//        CommUtils.getResult(buff, Constants.FACESET_ADDFACE_API,map);

        // 4.移除face_token

//        URL urlStr = faceDemo.class.getClassLoader().getResource("images/face01.jpg");
//        File file = new File(urlStr.getFile());
//        byte[] buff = CommUtils.getBytesFromFile(file);
//
//        map.put("faceset_token", faceset_token);
//        map.put("face_tokens", "RemoveAllFaceTokens");//移除全部face_token
//
//        CommUtils.getResult(buff, Constants.FACESET_REMOVEFACE_API,map);

        // 5.获取face_set的详情
//        URL urlStr = faceDemo.class.getClassLoader().getResource("images/face01.jpg");
//        File file = new File(urlStr.getFile());
//        byte[] buff = CommUtils.getBytesFromFile(file);
//
//        map.put("faceset_token", faceset_token);
//
//        CommUtils.getResult(buff, Constants.FACESET_GETDETAIL_API,map);


        // 6.从face_set中检索人脸
        URL urlStr = faceDemo.class.getClassLoader().getResource("images/face01.jpg");
        File file = new File(urlStr.getFile());
        byte[] buff = CommUtils.getBytesFromFile(file);

        map.put("faceset_token", faceset_token);
        map.put("face_token",face_token1);

        CommUtils.getResult(buff, Constants.FACE_SEARCH_API,map);
    }
}
