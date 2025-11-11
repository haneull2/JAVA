class Course{
    String code;
    String name;
    Course(String code, String name){
        this.code = code;
        this.name = name;
    }
    String getCode(){
        return code;
    }
    String getName(){
        return name;
    }
}

class OfflineCourse extends Course{
    OfflineCourse(String code, String name){
        super(code, name);
    }
    @Override
    public String toString(){
        String txt =  "Code: " + code + ", Name: " + name + ", Type: Offline";
        return txt;
    }
}

class OnlineCourse extends Course{
    OnlineCourse(String code, String name){
        super(code, name);
    }
    @Override
    public String toString(){
       String txt =  "Code: " + code + ", Name: " + name + ", Type: Online";
       return txt;
    }
}

public class Homework6 {
    public static void main(String[] args){
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println (course1);
        System.out.println (course2);

    }
}
