import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class Exam {
    int id;
    int code;
    String title;
    CategoryQuestion category;
    int duration;
    Account creatorId;
    LocalDate createDate;
    Question[] questions;
}
