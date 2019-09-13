package com.burrsutter.springtodo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Modifying
    @Query("update Todo set completed = ?2, title = ?3 where id = ?1")
    void setUpdated(Long id, boolean completed, String title);

}
