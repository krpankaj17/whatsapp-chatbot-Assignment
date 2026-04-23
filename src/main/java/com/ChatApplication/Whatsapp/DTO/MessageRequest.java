package com.ChatApplication.Whatsapp.DTO;

import jakarta.validation.constraints.NotBlank;

public class MessageRequest {
    @NotBlank(message = "You cannot leave this blank")
    private String message ;
    public MessageRequest(){}
    public MessageRequest(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
