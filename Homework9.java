import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> login = new HashMap<String, String>();

        try (BufferedReader f = new BufferedReader((new FileReader("db.txt")))) {
            String line;
            while ((line = f.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length == 2) {
                    String id = parts[0];
                    String pw = parts[1];
                    login.put(id, pw);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        boolean same = false;
        try {
            do {
                System.out.print("id와 password를 입력해주세요.\n");
                System.out.print("id : ");
                String id = sc.next();

                if (login.containsKey(id)) {
                    System.out.print("password : ");
                    String pw = sc.next();
                    if (login.get(id).equals(pw)) {
                        System.out.print("id와 비밀번호가 일치합니다.\n");
                        same = true;
                    } else {
                        System.out.print("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n\n");
                    }
                } else {
                    System.out.print("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n\n");
                }
            } while(!same);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
