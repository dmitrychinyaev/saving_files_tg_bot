package ru.dmitychin.service.impl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.dmitychin.service.ConsumerService;
import ru.dmitychin.service.MainService;

import static ru.dmitrychin.model.RabbitQueue.TEXT_MESSAGE_UPDATE;

public class ConsumerServiceImpl implements ConsumerService {

    private final MainService mainService;

    public ConsumerServiceImpl(MainService mainService) {
        this.mainService = mainService;
    }
    @Override
    @RabbitListener(queues = TEXT_MESSAGE_UPDATE)
    public void consumeTextMessageUpdates(Update update) {
        mainService.processTextMessage(update);
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
