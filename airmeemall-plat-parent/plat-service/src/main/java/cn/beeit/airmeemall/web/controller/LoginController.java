package cn.beeit.airmeemall.web.controller;/*
 * @Author li zhen qiang
 * @Description: 登陆接口
 * @Date 2019/1/27
 * @Version 1.0
 * @ClassName: LoginController
 **/

import cn.beeit.airmeemall.domain.Employee;
import cn.beeit.airmeemall.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getUsername()) && "123456".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMessage("登陆成功!!");
        }else{
            return AjaxResult.me().setSuccess(false).setMessage("用户名或密码错误!!!");
        }
    }
}
