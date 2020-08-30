package com.evan.swaggerdemo.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel//(value = "返回参数")
public class BaseResp {
    @ApiModelProperty(value = "code")
    private String resultCode;
    @ApiModelProperty(value = "message")
    private String resultMsg;


    public BaseResp() {
    }

    public BaseResp(API_RESULT apiResult) {
        this.resultCode = apiResult.RESULT_CODE;
        this.resultMsg = apiResult.RESULT_MSG;
    }

    public BaseResp(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }
}
