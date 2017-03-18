package org.home.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.home.rest.messenger.beans.Message;

public class MessengerService {
	
	public List<Message> getMessages(){
		Message m1 = new Message(1l, "Good video");
		Message m2 = new Message(2l, "Must share");
		List<Message> mList = new ArrayList<Message>();
		mList.add(m1);
		mList.add(m2);
		return mList;
	}
	

}
