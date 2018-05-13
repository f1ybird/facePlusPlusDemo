package demo.util;

/**
 * @Description:维护face++API调用的常量 试用版本
 * @Author: kevin
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
     * 检测和识别银行卡，并返回银行卡卡片边框坐标及识别出的银行卡号。当前 Beta 版本一次只支持识别一张银行卡，图像内有多张卡时，返回识别结果置信度最高的银行卡。支持任意角度的识别
     */
    public static final String OCR_BANKCARD_API = "https://api-cn.faceplusplus.com/cardpp/beta/ocrbankcard";

    /**
     * 检测和识别中华人民共和国机动车驾驶证（以下称“驾照”）图像，并转化为结构化的文字信息。只可识别驾照正本(main sheet)正面和副本(second sheet)正面，一张照片最多可识别一个正本正面和一个副本正面。
     */
    public static final String OCR_DRIVER_LICENSE_API = "https://api-cn.faceplusplus.com/cardpp/v2/ocrdriverlicense";

    /**
     * 检测和识别中华人民共和国机动车行驶证（以下称“行驶证”）图像为结构化的文字信息。目前只支持行驶证主页正面，不支持副页正面反面。
     */
    public static final String OCR_VEHICLE_LICENSE_API = "https://api-cn.faceplusplus.com/cardpp/v1/ocrvehiclelicense";

    /**
     * 传入图片进行人脸检测和人脸分析
     */
    public static final String FACE_DETECT_API = "https://api-cn.faceplusplus.com/facepp/v3/detect";

    /**
     * 将两个人脸进行比对，来判断是否为同一个人，返回比对结果置信度和不同误识率下的阈值。支持传入图片或 face_token 进行比对。使用图片时会自动选取图片中检测到人脸尺寸最大的一个人脸。
     */
    public static final String FACE_COMPARE_API = "https://api-cn.faceplusplus.com/facepp/v3/compare";

    /**
     * 创建一个人脸的集合 FaceSet，用于存储人脸标识 face_token。一个 FaceSet 能够存储 1,0000 个 face_token。
     */
    public static final String FACESET_CREATE_API = "https://api-cn.faceplusplus.com/facepp/v3/faceset/create";

    /**
     * 为一个已经创建的 FaceSet 添加人脸标识 face_token。一个 FaceSet 最多存储1,000个 face_token。
     */
    public static final String FACESET_ADDFACE_API = "https://api-cn.faceplusplus.com/facepp/v3/faceset/addface";

    /**
     * 为一个已经创建的 FaceSet 移除人脸标识 face_token。一个 FaceSet 最多存储1,000个 face_token。
     */
    public static final String FACESET_REMOVEFACE_API = "https://api-cn.faceplusplus.com/facepp/v3/faceset/removeface";
    /**
     * 更新一个人脸集合的属性
     */
    public static final String FACESET_UPDATE_API = "https://api-cn.faceplusplus.com/facepp/v3/faceset/update";

    /**
     * 获取一个 FaceSet 的所有信息，包括此 FaceSet 的 faceset_token, outer_id, display_name 的信息，以及此 FaceSet 中存放的 face_token 数量与列表。
     */
    public static final String FACESET_GETDETAIL_API = "https://api-cn.faceplusplus.com/facepp/v3/faceset/getdetail";

    /**
     * 在一个已有的 FaceSet 中找出与目标人脸最相似的一张或多张人脸，返回置信度和不同误识率下的阈值。支持传入图片或 face_token 进行人脸搜索。使用图片进行搜索时会选取图片中检测到人脸尺寸最大的一个人脸。
     */
    public static final String FACE_SEARCH_API = "https://api-cn.faceplusplus.com/facepp/v3/search";


}
