package com.farid.sinamtechtask.repos;

import com.farid.sinamtechtask.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MessageRepo extends JpaRepository<Message, Integer> {
    @Query("SELECT m FROM Message m WHERE m.tag LIKE %:tag%")
    List<Message> findByTag(String tag);
    Optional<Message> findById(Integer aLong);

}
