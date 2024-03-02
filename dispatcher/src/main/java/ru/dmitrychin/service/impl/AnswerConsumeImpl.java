package ru.dmitrychin.service.impl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import ru.dmitrychin.controller.UpdateController;
import ru.dmitrychin.service.AnswerConsumer;

import static ru.dmitrychin.model.RabbitQueue.ANSWER_MESSAGE;
@Service
public class AnswerConsumeImpl implements AnswerConsumer {
    private final UpdateController updateController;

    public AnswerConsumeImpl(UpdateController updateController) {
        this.updateController = updateController;
    }

    @Override
    @RabbitListener(queues = ANSWER_MESSAGE)
    public void consume(SendMessage sendMessage) {
        updateController.setView(sendMessage);
    }
}
