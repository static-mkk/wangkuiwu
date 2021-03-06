package kkcoder.weixin.domain.req;

public class BaseMessage {

	//这是所有的消息的父类
	
	/**开发者微信号*/
	private String ToUserName;
	/**发送方的OpenID*/
	private String FromUserName;
	/**消息的创建的时间（整型）*/
	private long CreateTime;
	/**消息类型(text`image`location`link`shortvider)*/
	private String MsgType;
	/**消息 ID 64位*/
	private long MsgId;
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
	public long getMsgId() {
		return MsgId;
	}
	public void setMsgId(long msgId) {
		MsgId = msgId;
	}
	
}
