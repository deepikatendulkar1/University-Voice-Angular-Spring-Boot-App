package sample_pro.demo_survey_app.repository;

import sample_pro.demo_survey_app.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
