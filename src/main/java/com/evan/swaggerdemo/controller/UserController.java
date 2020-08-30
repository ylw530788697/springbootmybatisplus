package com.evan.swaggerdemo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.evan.swaggerdemo.common.Response;
import com.evan.swaggerdemo.dto.UserListRes;
import com.evan.swaggerdemo.entity.UserModel;
import com.evan.swaggerdemo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author EvanYang
 * @since 2020-08-30
 */
@RestController
@RequestMapping("/userModel")
@Api(value="用户controller",tags={"用户操作接口"})
public class UserController {

  /*  @PostMapping("/demo")
    //@AdminValidable(validType = 2)
    @ApiOperation(value = "营销开通课程模块-查询开通列表", notes = "", httpMethod = "POST")
    public void queryOpenCourses(HttpServletRequest request, HttpServletResponse response,
                                                          @ApiParam(value = "查询请求参数体")@RequestBody @Valid MarketingCoursesReq req) throws Exception {
        //String adminName = this.getCurrentAdminName(request);
        logger.info("营销开通课程模块-查询开通列表:queryOpenCourses,admin is {},req is {}", JsonUtil.tranObjToStr(req));
        //逻辑操作
        MarketingCoursesRes marketingCoursesRes=marketingCourseBusiness.queryGrantCourses(req);
        return Response.ok(marketingCoursesRes);
    }*/
    @Autowired
    private IUserService userService;

    @PostMapping("/getUserList")
    @ApiOperation(value = "用户模块-查询所有用户", notes = "注意问题点", httpMethod = "POST")
    public List<UserModel> getlist(HttpServletRequest request, HttpServletResponse response,
                                   @ApiParam(value = "查询请求参数体")@RequestBody @Valid UserListRes req){
        QueryWrapper<UserModel> queryWrapper = new QueryWrapper<UserModel>();
        queryWrapper.eq("phone",req.getPhone());
        queryWrapper.orderByAsc("phone");

        List<UserModel> list = userService.list();
        return list;
    }

    @ApiOperation(value="获取用户信息",tags={"获取用户信息"},notes="注意问题点")
    @GetMapping("/getUserInfo")
    public Response<UserModel> getUserInfo(@ApiParam(name="id",value="用户id",required=true) Long id) {
        // userService可忽略，是业务逻辑
        List<UserModel> list = userService.list();
        return Response.ok(list.get(0));
    }

}

