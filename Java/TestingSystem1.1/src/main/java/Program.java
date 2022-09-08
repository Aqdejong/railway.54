import java.awt.*;
import java.time.LocalDate;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

     Department department1 = new Department();
     department1.id = 1;
     department1.name = "Sale";

     Department department2 = new Department();
     department2.id = 2;
     department2.name = "Tranee";

     Department department3 = new Department();
     department3.id = 3;
     department3.name = "Security";

    Poisition poisition1 =new Poisition();
    poisition1.id = 1;
    poisition1.name = PoisitionName.PM;

    Poisition poisition2 =new Poisition();
    poisition2.id = 2;
    poisition2.name = PoisitionName.DEV;

    Poisition poisition3 =new Poisition();
    poisition3.id = 3;
    poisition3.name = PoisitionName.TEST;

    Account account1 = new Account();
    account1.id = 1;
    account1.email = "email1.gmail.com";
    account1.userName = "Username1";
    account1.fullName = "NGUYEN VAN A";
    account1.departmentId = department2;
    account1.poisitionId = poisition1;
    account1.crateDate = new Date(2022,4,5);

    Account account2 = new Account();
    account2.id = 2;
    account2.email = "email2.gmail.com";
    account2.userName = "Username2";
    account2.fullName = "NGUYEN VAN B";
    account2.departmentId = department2;
    account2.poisitionId = poisition2;
    account2.crateDate = new Date(2022,1,19);

    Account account3 = new Account();
    account3.id = 3;
    account3.email = "email3.gmail.com";
    account3.userName = "Username3";
    account3.fullName = "NGUYEN VAN C";
    account3.departmentId = department3;
    account3.poisitionId = poisition1;
    account3.crateDate = new Date(2021,8,25);

    Group group1 = new Group();
    group1.id = 1;
    group1.name = "Java";
    group1.creatorId = account3;
    group1.createDate = new Date();


    Group group2 = new Group();
    group2.id = 2;
    group2.name = "RUBY";
    group2.creatorId = account1;
    group2.createDate = new Date();

    Group group3 = new Group();
    group3.id = 3;
    group3.name = "PHP";
    group3.creatorId = account1;
    group3.createDate = new Date();

    account1.groups = new Group[] {group1 , group3};
    account2.groups = new Group[] {group2 , group3};
    account3.groups = new Group[] {group1 , group2 , group3};

    group1.accounts = new Account[] {account1, account3};
    group2.accounts = new Account[] {account2, account3};
    group3.accounts = new Account[] {account1, account3,account2};

    TypeQuestion typeQuestion1 = new TypeQuestion();
    typeQuestion1.id = 1;
    typeQuestion1.name = TypeName.ESSAY;

    TypeQuestion typeQuestion2 = new TypeQuestion();
    typeQuestion2.id = 2;
    typeQuestion2.name = TypeName.MULTIPLE_CHOICE;

    TypeQuestion typeQuestion3 = new TypeQuestion();
    typeQuestion3.id = 3;
    typeQuestion3.name = TypeName.MULTIPLE_CHOICE;

        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.id = 1;
        categoryQuestion1.name = "Java";

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.id = 2;
        categoryQuestion2.name = "NET";

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.id = 3;
        categoryQuestion3.name = "SQL";

        Question question1 = new Question();
        question1.id = 1;
        question1.content = "Hoi ve Java";
        question1.category = categoryQuestion2;
        question1.typeName = typeQuestion1;
        question1.creator = account3;
        question1.createDate = new Date();

        Question question2 = new Question();
        question2.id = 2;
        question2.content = "Hoi ve NET";
        question2.category = categoryQuestion3;
        question2.typeName = typeQuestion2;
        question2.creator = account1;
        question2.createDate = new Date();

        Question question3 = new Question();
        question3.id = 3;
        question3.content = "Hoi ve SQL";
        question3.category = categoryQuestion1;
        question3.typeName = typeQuestion1;
        question3.creator = account2;
        question3.createDate = new Date();

        Answer answer1 = new Answer();
        answer1.id = 1;
        answer1.content = "Tra loi Java";
        answer1.question = question3;
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.id = 1;
        answer2.content = "Tra loi NET";
        answer2.question = question1;
        answer2.isCorrect = true;

        Answer answer3 = new Answer();
        answer3.id = 1;
        answer3.content = "Tra loi SQL";
        answer3.question = question2;
        answer3.isCorrect = false;

        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code = 3;
        exam1.category = categoryQuestion2;
        exam1.duration = 60;
        exam1.creatorId = account3;
        exam1.createDate = LocalDate.of(2021, 5, 4);

        Exam exam2 = new Exam();
        exam2.id = 2;
        exam2.code = 1;
        exam2.category = categoryQuestion3;
        exam2.duration = 90;
        exam2.creatorId = account1;
        exam2.createDate = LocalDate.of(2021, 11, 20);

        Exam exam3 = new Exam();
        exam3.id = 3;
        exam3.code = 2;
        exam3.category = categoryQuestion1;
        exam3.duration = 120;
        exam3.creatorId = account2;
        exam3.createDate = LocalDate.of(2022, 1, 28);

        exam1.questions = new Question[]{question3};
        exam2.questions = new Question[]{question2,question1};
        exam3.questions = new Question[]{question1};

        question1.exams = new Exam[]{exam3,exam2};
        question2.exams = new Exam[]{exam2};
        question3.exams = new Exam[]{exam1};
























    }
}
