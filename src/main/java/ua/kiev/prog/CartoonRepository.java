package ua.kiev.prog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartoonRepository extends JpaRepository<Cartoon, Long> {
    @Query("SELECT u FROM Cartoon u where u.id = :id")
    Cartoon findById(@Param("id") long id);

}