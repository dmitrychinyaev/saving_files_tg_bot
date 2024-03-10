package ru.dmitrychin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dmitrychin.entity.AppUser;
@Repository
public interface AppUserDAO extends JpaRepository<AppUser,Long> {
    AppUser findAppUserByTelegramUserId(Long id);
}
