package ru.dmitrychin.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import ru.dmitrychin.entity.AppDocument;

public interface FileService {
    AppDocument processDoc(Message externalMessage);
}
