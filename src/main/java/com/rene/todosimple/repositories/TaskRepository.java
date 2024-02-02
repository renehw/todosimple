package com.rene.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rene.todosimple.models.Task;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUser_Id(Long id);

    // @Query(value = "SELECT t FROM Task t WHERE t.user.id = :id")
    // List<Task> findByUser_Id(@Param("id") Long id);

    // @Query(nativeQuery = true, value = "SELECT * FROM task WHERE t.user_id =
    // :id")
    // List<Task> findByUser_Id(@Param("id") Long id);

}
