package artemtsmyg.ru.DZ_Spring_sem10.service;

import artemtsmyg.ru.DZ_Spring_sem10.model.Act;

import java.util.List;

public interface ActService {
    List<Act> getAllActs();
    Act createAct(Act note);
    Act getActById(Long id);
    Act updateAct(Act act);
    void deleteAct(Long id);
    List<Act> findActByReportingPeriod(String reportingPeriod);
}