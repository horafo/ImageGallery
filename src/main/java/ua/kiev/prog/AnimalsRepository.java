package ua.kiev.prog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AnimalsRepository extends JpaRepository<Animals, Long> {
    @Query("SELECT u FROM Animals u where u.id = :id")
    Animals findById(@Param("id") long id);

}