package org.home.rest.messenger.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	Long messageID;
	String message;
	
	public Message(){
		
	}
	
	public Message(Long messageID, String message) {
		this.messageID = messageID;
		this.message = message;
	}
	public Long getMessageID() {
		return messageID;
	}
	public void setMessageID(Long messageID) {
		this.messageID = messageID;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
