package com.ChatApplication.Whatsapp.Service;

import org.springframework.stereotype.Service;

@Service
public class ChatbotService {

    public String getReply(String message){
        message =message.strip().toLowerCase();
        if(message.matches("hi+")) {
            return "Hello";
        }


        else if (message.equalsIgnoreCase("bye")){
            return "Goodbye";
        }
        return "I can only reply to hi or bye for now";
    }
}
