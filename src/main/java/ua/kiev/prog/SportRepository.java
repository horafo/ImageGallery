package ua.kiev.prog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SportRepository extends JpaRepository<Sport, Long> {
    @Query("SELECT u FROM Sport u where u.id = :id")
    Sport findById(@Param("id") long id);

}