package br.com.open.ai.cecg.OpenAi.config;

import com.theokanning.openai.service.OpenAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAIConfig {

    @Value("$(openai.secret)")
    private String openAISecret;

    @Bean
    public OpenAiService getOpenAIBean() {
        return new OpenAiService(openAISecret);
    }
}
