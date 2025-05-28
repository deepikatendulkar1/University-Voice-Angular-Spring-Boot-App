// Meghana Adithi Bongu - G01446886
// Tarun Naga Sai Chadaram - G01445928
// Bhavishya kollipara - G01455074
// Deepika Hemant Tendulkar - G01451861
// The application's main entry point, which also starts the embedded server and initializes the Spring Boot application context. enables component scanning, 
// configuration, and auto-configuration through the use of @SpringBootApplication.

package sample_pro.demo_survey_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSurveyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSurveyAppApplication.class, args);
	}

}
