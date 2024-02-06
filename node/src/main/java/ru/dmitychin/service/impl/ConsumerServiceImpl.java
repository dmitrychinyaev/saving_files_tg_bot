package ru.dmitychin.service.impl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.dmitychin.service.ConsumerService;
import ru.dmitychin.service.ProducerService;

import static ru.dmitrychin.model.RabbitQueue.TEXT_MESSAGE_UPDATE;

public class ConsumerServiceImpl implements ConsumerService {
    private final ProducerService producerService;

    public ConsumerServiceImpl(ProducerService producerService) {
        this.producerService = producerService;
    }

    @Override
    @RabbitListener(queues = TEXT_MESSAGE_UPDATE)
    public void consumeTextMessageUpdates(Update update) {
        var message = update.getMessage();
        var sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText("Hello from NODE");
        producerService.producerAnswer(sendMessage);
    }

    @Override
    @RabbitListener(queues = TEXT_MESSAGE_UPDATE)
    public void consumeDocMessageUpdates(Update update) {

    }

    @Override
    @RabbitListener(queues = TEXT_MESSAGE_UPDATE)
    public void consumePhotoMessageUpdates(Update update) {

    }
}
