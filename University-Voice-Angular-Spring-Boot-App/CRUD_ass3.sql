-- With every new row entry, the AUTO_INCREMENT parameter makes sure that the value of id is automatically increased, by default, to 1. This ensures uniqueness by doing away with the need to manually assign values.

CREATE TABLE surveyformstudent_table (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    email VARCHAR(150),
    telephone VARCHAR(20),
    street_address VARCHAR(255),
    city VARCHAR(100),
    state VARCHAR(50),
    zip VARCHAR(10),
    liked_most VARCHAR(255), -- To store comma-separated values
    how_interested VARCHAR(100),
    likelihood VARCHAR(50),
    additional_comments TEXT,
    survey_date DATE
);

select * from surveyformstudent_table;

delete from  surveyformstudent_table where id=1;