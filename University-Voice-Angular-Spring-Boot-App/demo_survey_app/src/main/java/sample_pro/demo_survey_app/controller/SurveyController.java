// Meghana Adithi Bongu - G01446886
// Tarun Naga Sai Chadaram - G01445928
// Bhavishya kollipara - G01455074
// Deepika Hemant Tendulkar - G01451861
// /**
//  * SurveyController handles CRUD operations for the Survey entity. 
//  * It includes endpoints to:
//  * - Fetch all surveys (GET)
//  * - Create a new survey (POST)
//  * - Update an existing survey by ID (PUT)
//  * - Delete a survey by ID (DELETE)
//  * Enables cross-origin access from Angular frontend (http://localhost:4200).
//  */

package sample_pro.demo_survey_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample_pro.demo_survey_app.model.Survey;
import sample_pro.demo_survey_app.repository.SurveyRepository;

@RestController
@RequestMapping("/api/surveyformstudent_table")
@CrossOrigin(origins = "http://localhost:4200")
public class SurveyController {
    @Autowired
    private SurveyRepository surveyRepository;

    @GetMapping
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    @PostMapping
    public Survey createSurvey(@RequestBody Survey survey) {
        return surveyRepository.save(survey);
    }

    @PutMapping("/{id}")
    public Survey updateSurvey(@PathVariable Long id, @RequestBody Survey survey) {
        return surveyRepository.findById(id)
                .map(existingSurvey -> {
                    existingSurvey.setFirstName(survey.getFirstName());
                    existingSurvey.setLastName(survey.getLastName());
                    existingSurvey.setEmail(survey.getEmail());
                    existingSurvey.setTelephone(survey.getTelephone());
                    existingSurvey.setStreetAddress(survey.getStreetAddress());
                    existingSurvey.setCity(survey.getCity());
                    existingSurvey.setState(survey.getState());
                    existingSurvey.setZip(survey.getZip());
                    existingSurvey.setLikedMost(survey.getLikedMost());
                    existingSurvey.setHowInterested(survey.getHowInterested());
                    existingSurvey.setLikelihood(survey.getLikelihood());
                    existingSurvey.setAdditionalComments(survey.getAdditionalComments());
                    existingSurvey.setSurveyDate(survey.getSurveyDate());
                    return surveyRepository.save(existingSurvey);
                })
                .orElseThrow(() -> new RuntimeException("Survey not found with id " + id));
    }

    @DeleteMapping("/{id}")
    public void deleteSurvey(@PathVariable Long id) {
        surveyRepository.deleteById(id);
    }
}
