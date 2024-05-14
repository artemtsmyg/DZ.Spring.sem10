package artemtsmyg.ru.DZ_Spring_sem10.repository;

import artemtsmyg.ru.DZ_Spring_sem10.model.Act;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActRepository extends JpaRepository<Act, Long> {

    @Query("SELECT e FROM Act e WHERE e.reportingPeriod= :reportingPeriod")
    List<Act> findActByReportingPeriod(String reportingPeriod);

}
