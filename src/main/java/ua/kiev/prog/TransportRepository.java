package ua.kiev.prog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TransportRepository extends JpaRepository<Transport, Long> {
    @Query("SELECT u FROM Transport u where u.id = :id")
    Transport findById(@Param("id") long id);

}