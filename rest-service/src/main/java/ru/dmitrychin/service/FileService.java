package ru.dmitrychin.service;

import org.springframework.core.io.FileSystemResource;
import ru.dmitrychin.entity.AppDocument;
import ru.dmitrychin.entity.AppPhoto;
import ru.dmitrychin.entity.BinaryContent;

public interface FileService {
    AppDocument getDocument(String id);
    AppPhoto getPhoto(String id);
    FileSystemResource getFileSystemResource(BinaryContent binaryContent);
}
