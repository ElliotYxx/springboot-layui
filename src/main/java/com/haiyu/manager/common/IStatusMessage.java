package com.haiyu.manager.common;

/**
 * @Title: IStatusMessage
 * @Description: 响应状态信息
 * @author: youqing
 * @version: 1.0
 * @date: 2018/11/23 9:50
 */
public interface IStatusMessage {

    String getCode();

    String getMessage();

    public enum SystemStatus implements IStatusMessage{

        /**
         * 成功
         */
        SUCCESS("200","SUCCESS"),
        /**
         * 错误
         */
        ERROR("404","ERROR"),
        /**
         * 参数错误
         */
        PARAM_ERROR("1002","PARAM_ERROR"),
        /**
         * 成功匹配
         */
        SUCCESS_MATCH("1003","SUCCESS_MATCH"),
        /**
         * 未登录
         */
        NO_LOGIN("1100","NO_LOGIN"),
        /**
         * 多个登陆
         */
        MANY_LOGINS("1101","MANY_LOGINS"),
        /**
         * 更新
         */
        UPDATE("1102","UPDATE"),
        /**
         * 锁定
         */
        LOCK("1111","LOCK");
        private String code;
        private String message;

        private SystemStatus(String code,String message){
            this.code = code;
            this.message = message;
        }

        public String getCode(){
            return this.code;
        }

        public String getMessage(){
            return this.message;
        }
    }

}
