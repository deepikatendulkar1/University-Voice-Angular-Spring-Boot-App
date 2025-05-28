// Meghana Adithi Bongu - G01446886
// Tarun Naga Sai Chadaram - G01445928
// Bhavishya kollipara - G01455074
// Deepika Hemant Tendulkar - G01451861

// The Survey entity defines fields for storing student survey data with constraints and utility methods for field manipulations, mapping to the "surveyformstudent_table" database table.
// For effective database storage, it has the ability to change the "likedMost" field from a List to a comma-separated string. 

package sample_pro.demo_survey_app.model;

import jakarta.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "surveyformstudent_table")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique identifier for each survey

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName; // First name of the student (required)

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName; // Last name of the student (required)

    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email; // Email address of the student (required and unique)

    @Column(name = "telephone", length = 20)
    private String telephone; // Telephone number of the student (optional)

    @Column(name = "street_address", length = 255)
    private String streetAddress; // Street address (optional)

    @Column(name = "city", length = 50)
    private String city; // City of residence (optional)

    @Column(name = "state", length = 50)
    private String state; // State of residence (optional)

    @Column(name = "zip", length = 20)
    private String zip; // ZIP code (optional)

    @Column(name = "liked_most", length = 255)
    private String likedMost; // What the student liked most, stored as a comma-separated string

    @Column(name = "how_interested", length = 50)
    private String howInterested; // How the student became interested in the university

    @Column(name = "likelihood", length = 50)
    private String likelihood; // Likelihood of recommending the university

    @Column(name = "additional_comments")
    private String additionalComments; // Additional comments provided by the student

    @Column(name = "survey_date", nullable = false)
    private String surveyDate; // Date the survey was submitted (required)

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Converts the stored comma-separated likedMost string into a List of strings.
     * 
     * @return A list of items liked most by the student, or null if none exist.
     */
    public List<String> getLikedMost() {
        return likedMost != null && !likedMost.isEmpty()
                ? Arrays.asList(likedMost.split(","))
                : null;
    }

    /**
     * Converts a list of items into a comma-separated string for storage.
     * 
     * @param likedMost The list of items liked most by the student.
     */
    public void setLikedMost(List<String> likedMost) {
        this.likedMost = likedMost != null
                ? String.join(",", likedMost)
                : null;
    }

    public String getHowInterested() {
        return howInterested;
    }

    public void setHowInterested(String howInterested) {
        this.howInterested = howInterested;
    }

    public String getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(String likelihood) {
        this.likelihood = likelihood;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }

    public String getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(String surveyDate) {
        this.surveyDate = surveyDate;
    }
}
