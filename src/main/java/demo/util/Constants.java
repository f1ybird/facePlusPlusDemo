package demo.util;

/**
  * @Description:维护face++API调用的常量 试用版本
  *
  * @Author: kevin
  *
  * @Date 15:12 2018/5/13
  */
public class Constants {

    /**
     * API官网地址
     */
    public static final String api_website = "https://console.faceplusplus.com.cn/documents/4887579";

    public static final String api_key = "zjA1nPTMsrYEH9kMFx8F0EpMdV6SAe9W";

    public static final String api_secret = "B6-lm-Sx9zeD9KZQJKGj2nytQ6NsbWo2";

    /**
     * 身份证坐标检测API
     */
    public static final String ID_CARD_DETECT_API = "https://api-cn.faceplusplus.com/facepp/v3/detect";

    /**
     * 检测和识别中华人民共和国第二代身份证的关键字段内容，并支持返回身份证正反面信息、身份证照片分类判断结果。
     */
    public static final String OCR_IDCARD_API = "https://api-cn.faceplusplus.com/cardpp/v1/ocridcard";

    /**
     * 检测和识别各类银行卡，并返回银行卡卡片边框坐标、银行卡号码、所属银行及支持的金融组织服务。支持任意角度的识别。
     */
    public static final String OCR_BANKCARD_API = "https://api-cn.faceplusplus.com/cardpp/beta/ocrbankcard";

}
