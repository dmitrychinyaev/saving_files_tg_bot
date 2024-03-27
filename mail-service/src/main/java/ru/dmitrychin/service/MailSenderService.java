package ru.dmitrychin.service;

import ru.dmitrychin.dto.MailParams;

public interface MailSenderService {
    void send(MailParams mailParams);
}
