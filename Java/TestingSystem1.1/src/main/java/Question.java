import java.util.Date;

public class Question {
    int id;
    String content;
    CategoryQuestion category;
    TypeQuestion typeName;
    Account creator;
    Date createDate;
    Exam[] exams;
}
