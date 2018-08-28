package ua.kiev.prog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GamesRepository extends JpaRepository<Games, Long> {
    @Query("SELECT u FROM Games u where u.id = :id")
    Games findById(@Param("id") long id);

}