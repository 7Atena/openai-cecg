package br.com.open.ai.cecg.OpenAi.Component;

import com.theokanning.openai.service.OpenAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChatSteamComponent {

    private final OpenAiService openAiService;

    @Value("$(openai.model: gpt-3,5-turbo)")
    private String model;

    @Value("$(openai.max-toens:500)")
    private Integer axtokens;

    public ChatSteamComponent(OpenAiService openAiService) {
        this.openAiService = openAiService;
    }
}
