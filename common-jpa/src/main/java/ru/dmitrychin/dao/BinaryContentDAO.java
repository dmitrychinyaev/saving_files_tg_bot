package ru.dmitrychin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dmitrychin.entity.BinaryContent;

@Repository
public interface BinaryContentDAO extends JpaRepository<BinaryContent,Long> {
}
