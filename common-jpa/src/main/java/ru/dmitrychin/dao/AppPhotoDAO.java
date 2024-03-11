package ru.dmitrychin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dmitrychin.entity.AppPhoto;
@Repository
public interface AppPhotoDAO extends JpaRepository<AppPhoto, Long> {
}
