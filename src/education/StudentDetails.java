package education;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class StudentDetails {
    Random rnd = new Random();

    private final int studentId = rnd.nextInt(999999);

    private String studentFirstName;
    private String studentLastName;
    private int studentAge;
    private String studentNumber;
    private String studentGender;

    public StudentDetails(String studentFirstName, String studentLastName, int studentAge, String studentNumber, String studentGender) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentAge = studentAge;
        this.studentNumber = studentNumber;
        this.studentGender = studentGender;
    }
}