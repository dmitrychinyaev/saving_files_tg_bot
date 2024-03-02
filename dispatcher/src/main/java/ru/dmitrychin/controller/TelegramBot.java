package ru.dmitrychin.controller;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.dmitrychin.configuration.TelegramBotConfiguration;

import javax.annotation.PostConstruct;

@Component
@PropertySource("application.properties")
public class TelegramBot extends TelegramLongPollingBot {
    public TelegramBot(TelegramBotConfiguration telegramBotConfiguration, UpdateController updateController) {
        this.telegramBotConfiguration = telegramBotConfiguration;
        this.updateController = updateController;
    }
    private final TelegramBotConfiguration telegramBotConfiguration;
    @PostConstruct
    public void init(){
        updateController.registerBot(this);
    }
    private UpdateController updateController;
    @Override
    public String getBotUsername() {
        return telegramBotConfiguration.getBotname();
    }

    @Override
    public String getBotToken() {
        return telegramBotConfiguration.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        updateController.processUpdate(update);
    }

    public void sendAnswerMessage(SendMessage message){
        if(message != null){
            try {
                execute(message);
            } catch (TelegramApiException e) {

            }
        }
    }
}
