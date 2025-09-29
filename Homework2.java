import java.util.Scanner;

class Student{
    long id;
    String name;
    String major;
    long number;

    Student(long id, String name, String major, long number){
        this.id = id;
        this.name = name;
        this.major = major;
        this.number = number;
    }

    long getId(){ return id; }
    void setId(long id){ this.id = id; }
    String getName(){ return name; }
    void setName(String name){ this.name = name; }
    String getMajor(){ return major; }
    void setMajor(String major){ this.major = major; }
    long getNumber(){ return number; }
    void setNumber(long number){ this.number = number; }


    void print_info(String n){
        String number_str = Long.toString(number);
        String number_result = '0' +number_str.substring(0,2) + '-' + number_str.substring(2,6) + '-' +number_str.substring(6);
        System.out.printf("%s 학생: %d %s %s %s\n",n, id, name, major, number_result);
    }
}

public class Homework2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student s1 = new Student(sc.nextLong(), sc.next(), sc.next(), sc.nextLong());
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student s2 = new Student(sc.nextLong(), sc.next(), sc.next(), sc.nextLong());
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student s3 = new Student(sc.nextLong(), sc.next(), sc.next(), sc.nextLong());

        System.out.print("\n입력된 학생들의 정보는 다음과 같습니다.\n");
        s1.print_info("첫번째");
        s2.print_info("두번째");
        s3.print_info("세번째");

    }
}
