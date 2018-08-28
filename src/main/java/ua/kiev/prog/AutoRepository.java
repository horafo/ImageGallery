package ua.kiev.prog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AutoRepository extends JpaRepository<Auto, Long> {
    @Query("SELECT u FROM Auto u WHERE u.id = :id")
    Auto findById(@Param("id") long id);

}