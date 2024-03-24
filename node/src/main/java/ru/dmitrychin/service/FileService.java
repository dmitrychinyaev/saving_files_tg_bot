package ru.dmitrychin.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import ru.dmitrychin.entity.AppDocument;
import ru.dmitrychin.entity.AppPhoto;
import ru.dmitrychin.service.enums.LinkType;

public interface FileService {
    AppDocument processDoc(Message telegramMessage);
    AppPhoto processPhoto(Message telegramMessage);
    String generateLink(Long docId, LinkType linkType);
}
