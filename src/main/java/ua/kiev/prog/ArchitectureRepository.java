package ua.kiev.prog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ArchitectureRepository extends JpaRepository<Architecture, Long> {
    @Query("SELECT u FROM Architecture u where u.id = :id")
    Architecture findById(@Param("id") long id);

}