package ru.dmitrychin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dmitrychin.entity.RawData;
@Repository
public interface RawDataDAO extends JpaRepository<RawData, Long> {
}
