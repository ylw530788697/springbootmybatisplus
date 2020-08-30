package com.evan.swaggerdemo.common;

public enum API_RESULT {
    //系统返回状态
    WARN("120", "参数非法"),
    OK("200", "OK"),
    NOT_MODIFIED("304", "Not Modified"),
    BAD_REQUEST("400", "Bad Request"),
    UNAUTHORIZED("401", "登录已过期，请重新登录"),
    FORBIDDEN("403", "Forbidden"),
    NOT_FOUND("404", "Not Found"),
    METHOD_NOT_ALLOWED("405", "Method Not Allowed"),
    NOT_ACCEPTABLE("406", "Parameter format incorrect or parameter is null,Not Acceptable"),
    CONFLICT("409", "Conflict"),
    PHONE_WECHAT_BINGING_ERROR("410", "该手机号已绑定其他微信"),
    INTERNAL_SERVER_ERROR("500", "Internal Server Error"),
    PARA_CAN_NOT_EMPTY("10000", "The argument cannot be empty"),
    TRANSACTIONAL_ROLL_BACK("11000", "创建失败"),
    TRANSACTIONAL_ROLL_BACK_COURSE_PAKAGE("11001", "创建分课包失败"),
    UUID_GET_ERROR("11002", "UUID获取失败"),
    TRANSACTIONAL_UPDATE_ROLL_BACK("11003", "更新失败"),

    //自定义返回状态
    //基本异常
    USER_NOT_EXIST("10001", "用户不存在"),
    CHILD_NOT_EXIST("10002", "孩子不存在"),
    WRONG_PASSWORD("10003", "密码错误"),
    WRONG_OLD_PASSWORD("10004", "旧密码不正确"),
    PHONE_NO_REGISTER("10005", "您输入的手机号码未注册"),
    PASSWORD_ERROR_REPEATEDLY("10006", "尝试次数超过8次,需20分钟后才可重新登陆"),
    SMS_VERTIFY_CODE_UPDATE("10007", "当前失败次数超过3次，请30分钟后重试"),
    SMS_VERTIFY_CODE_REGISTER("10008", "当前失败次数超过10次，请10分钟后重试"),

    USER_EXIST_IN_SYSTEM("10009", "您修改的号码已注册"),
    USER_EXIST_SYSTEM("10010", "该号码已注册"),

    VERIFY_CODE_ERROR("10101", "验证码错误"),
    SYSTEM_VARIABLE_NOT_EXIST("10102", "系统变量不存在"),
    OBJECT_CAN_NOT_DELETE("10103", "核心课下存在课程类目，请移除后再试"),
    LECTURE_CAN_NOT_DELETE("10103", "成长频道下存在课程类目，请移除后再试"),
    APP_REFUND_NOT_SUPPORT("10104", "苹果虚拟商品暂不支持退费，请告知客户自行联系苹果客服"),

    //核心课异常
    COURSE_NOT_EXIST("20001", "核心课程不存在"),
    COURSE_CATEGORY_NOT_EXIST("20002", "核心课程类别不存在"),
    COURSE_CATEGORY_ALL_LESSON_COUNT("20003", "当前新建课程已超过该类目总课程数"),

    //成长频道异常
    LECTURE_NOT_EXIST("30001", "成长频道课程不存在"),

    //订单异常
    ORDER_NOT_EXIST("40001", "订单不存在"),
    ORDER_NEED_ADDRESS("40002", "订单需要收件地址"),

    //营销模块异常
    MAKETING_CODE_ID_COUNT("50000","兑换码长度设置异常"),
    MAKETING_EXPIRE_TIME_INSPECT("50001","兑换码包过期时间应该大于当前时间"),
    MAKETING_COUTSE_LESSION_INSPECT("50002","兑换码包核心课时不存在"),
    MAKETING_LECTURE_LESSION_INSPECT("50003","兑换码包成长频道时是否存在"),
    MAKETING_PACKAGE_DUP("50004","兑换码包名称不能相同"),
    MAKETING_PACKAGE_SEND_COUNT("50005","兑换码包发送数量暂时不支持修改"),
    MAKETING_PACKAGE_START_TIME("50006","兑换码包开始时间暂时不支持修改"),
    MAKETING_PACKAGE_EXPIRE_TIME("50006","兑换码包过期时间只能延长"),
    MAKETING_PACKAGE_ID_NOT_NULL("50007","兑换码包id不能为空"),
    MAKETING_CODE_ID_NOT_NULL("50008","兑换码id不能为空"),
    MAKETING_STATE_NOT_NULL("50008","状态不能为空"),
    MAKETING_CODE_NOT_EXISTENCE("50009","兑换码输入错误"),
    MAKETING_CODE_NOT_BEGIN("50010","兑换码未到兑换期限"),
    MAKETING_CODE_TIME_LIMIT("50011","兑换码已过期"),
    MAKETING_CODE_STOP_USE("50012","兑换码已停用"),
    MAKETING_CODE_EXCHANGE_DONE("50013","该兑换码已经兑换过课程，不能重复兑换"),
    MAKETING_CODE_PACKAGE_LESSON_ERROR("50015","该兑换码课节传参错误，不能重复兑换"),
    MAKETING_WX_EXCHANGE_USER_NOT("50016","用户不存在，请在OK呀APP注册后尝试"),
    MAKETING_WX_EXCHANGE_PHONE_NOT_11("50017","手机号码格式错误"),
    MAKETING_CODE_ERROR_COUNT("50018","当前输入兑换码错误超过5次,请24小时后再操作"),
    //分课包
    COURSE_PACKAGE_DUP("50030","课包名称不能相同"),
    COURSE_PAY_PACKAGE_DONE("50031","您已经购买过该课包了"),
    COURSE_UNPAY_PACKAGE("50032","存在未支付的订单，请在我的订单中完成支付"),
    //版本管理
    VERSION_MANAGE_NUMBER_ERROR("50050","版本号只能是数字和英文符号"),
    VERSION_MANAGE_NUMBER_LENGTH("50051","版本号必须小于10位"),

    SUB_TIYTLE_SHOW_DAY_ERROR("50060","副标题展示时间只能是整数天"),

    APP_RECRIPT_FAILED("50070","IOS支付成功回执失败"),

    //七田真
    TPI_MUSIC_RECOMMEND_FAILED("60000","管理后台没有设置推荐歌单"),
    TPI_WX_LOGIN_FAILED("60001","获取微信用户数据失败"),
    TPI_USER_VIP_GET_ERROR("60002","当前不是赠送会员不能领取"),
    TPI_VIP_POPUP_WINDOW_ERROR("60003","不存在该弹窗id"),
    TPI_VIP_POPUP_WINDOW_DELETE_ERROR("60004","该会员管理有在弹窗管理使用到，不能删除"),
    TPI_PASSWORD_ERROR_REPEATEDLY("60005", "尝试次数超过5次,需24小时后才可重新登陆"),
    //有赞
    YOUZAN_GOODS_ERROR_CONFIG("70001", "有赞商品资源youzan_goods_resouce 会员发放配合错误"),
    WC_ERROR("80001", "微信下单失败"),

    //认知卡片
    COGNITIVE_PUBLISH_CARD("70101", "卡片还未完成设置，未完成所有环节内容设置卡包无法上架！"),
    COGNITIVE_PUBLISH_QUESTION("70102", "选择题还未完成设置，未完成所有环节内容设置卡包无法上架！"),
    COGNITIVE_PUBLISH_CLICK("70103", "极速点击还有内容未完成设置，未完成所有训练内容设置卡包无法上架！"),
    COGNITIVE_PUB_OPTION("70104", "可点击项未完成设置，无法上架！"),
    COGNITIVE_PUB_OPTION_EX("70105", "干扰项未完成设置，无法上架！"),
    COGNITIVE_CART_COUNT("70106", "可点击项和干扰项图片之和必须是30，无法上架！"),
    ;

    public String RESULT_CODE;
    public String RESULT_MSG;

    API_RESULT(String resultCode, String resultMsg) {
        this.RESULT_CODE = resultCode;
        this.RESULT_MSG = resultMsg;
    }

    public String getRESULT_CODE() {
        return RESULT_CODE;
    }

    public void setRESULT_CODE(String RESULT_CODE) {
        this.RESULT_CODE = RESULT_CODE;
    }

    public String getRESULT_MSG() {
        return RESULT_MSG;
    }

    public void setRESULT_MSG(String RESULT_MSG) {
        this.RESULT_MSG = RESULT_MSG;
    }
}
