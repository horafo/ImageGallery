package ua.kiev.prog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NatureRepository extends JpaRepository<Nature, Long> {
    @Query("SELECT u FROM Nature u where u.id = :id")
    Nature findById(@Param("id") long id);

}