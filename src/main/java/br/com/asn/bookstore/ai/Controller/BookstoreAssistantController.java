package br.com.asn.bookstore.ai.Controller;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookstore")
public class BookstoreAssistantController {

  @Autowired
  private OpenAiChatClient chatClient;





}
