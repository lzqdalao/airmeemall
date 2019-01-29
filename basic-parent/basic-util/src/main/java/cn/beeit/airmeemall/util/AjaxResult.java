package cn.beeit.airmeemall.util;/*
 * @Author li zhen qiang
 * @Description: ajax请求返回结果类
 * @Date 2019/1/27
 * @Version 1.0
 * @ClassName: AjaxResult
 **/

public class AjaxResult {
    private Boolean success =true;
    private String message;
    private Object returnObj;

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getReturnObj() {
        return returnObj;
    }

    public AjaxResult setReturnObj(Object returnObj) {
        this.returnObj = returnObj;
        return this;
    }
    public static AjaxResult me(){
        return new AjaxResult();
    }
    public AjaxResult() {
    }

    public AjaxResult(Boolean success, String message, Object returnObj) {
        this.success = success;
        this.message = message;
        this.returnObj = returnObj;
    }
}
