package com.zysq.entity.responseEntity;

/**
 * Created by rose_sunshine on 16/3/21.
 */
public class ResBaseMessage {

    private String ToUserName;
    private String FromUserName;
    private long CreateTime;
    private String MsgType;
//    private int FuncFlag;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

//    public int getFuncFlag() {
//        return FuncFlag;
//    }
//
//    public void setFuncFlag(int funcFlag) {
//        FuncFlag = funcFlag;
//    }
}
