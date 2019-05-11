package dlnu.liujiang.zshop.Utils;

import dlnu.liujiang.zshop.constant.ResposeStatusConstant;

/**
 * @Auther: liujiang
 * @Date: 2019/5/8 0008
 * Description: dlnu.liujiang.zshop.Utils
 * @version: 1.0
 */
public class ResponseResult {

    //响应状态码
    private int status;
    //响应消息
    private String msg;
    //响应数据
    private Object data;

    public ResponseResult() {
    }

    public ResponseResult(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

  public static ResponseResult success(Object data){

  return new ResponseResult(ResposeStatusConstant.RESPONSE_STATUS_SUCCESS,"success",data);
  }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
