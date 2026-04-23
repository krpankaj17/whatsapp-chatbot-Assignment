package com.ChatApplication.Whatsapp.Controller;

import com.ChatApplication.Whatsapp.DTO.MessageRequest;
import com.ChatApplication.Whatsapp.Service.ChatbotService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WebhookController {
   private final ChatbotService chatbotService;

    public WebhookController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }
    private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    @PostMapping("/webhook")
    public Map<String,String> recieveMessage( @Valid @RequestBody MessageRequest request){
       Map<String, String> response = new HashMap<>();
       String msg = request.getMessage();
        logger.info("Incoming message: {}", msg);
        String reply = chatbotService.getReply(msg);
       response.put("reply",reply);
       return response;
   }
}
