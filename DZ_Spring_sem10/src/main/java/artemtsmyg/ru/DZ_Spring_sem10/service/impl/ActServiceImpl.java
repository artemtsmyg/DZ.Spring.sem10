package artemtsmyg.ru.DZ_Spring_sem10.service.impl;

import artemtsmyg.ru.DZ_Spring_sem10.model.Act;
import artemtsmyg.ru.DZ_Spring_sem10.repository.ActRepository;
import artemtsmyg.ru.DZ_Spring_sem10.service.ActService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Сервис заметок для передачи запросов в репозиторий
 */
@Service
@RequiredArgsConstructor
public class ActServiceImpl implements ActService {
    private final ActRepository actRepository;

    /**
     * Метод получения списка всех задач
     *
     * @return список заметок
     */
    @Override
    public List<Act> getAllActs() {
        return actRepository.findAll();
    }

    /**
     * Метод сохранения заметки
     *
     * @param act новая заметка
     * @return сохраненная заметка
     */
    @Override
    public Act createAct(Act act) {
        return actRepository.save(act);
    }

    /**
     * Метод получения заметки по id
     *
     * @param id id заметки
     * @return искомая заметка
     */
    @Override
    public Act getActById(Long id) {
        return actRepository.findById(id).orElseThrow(null);
    }

    /**
     * Метод изменения заметки по id
     *
     * @return обновленная заметка
     */
    @Override
    public Act updateAct(Act act) {
        return actRepository.save(act);
    }

    /**
     * Метод удаления заметки по id
     *
     * @param id id заметки
     */
    @Override
    public void deleteAct(Long id) {
        Act actById = getActById(id);
        actRepository.delete(actById);
    }

    @Override
    public List<Act> findActByReportingPeriod(String reportingPeriod){
        return actRepository.findActByReportingPeriod(reportingPeriod);
    }

}
