package author;
import java.lang.*;
public class testAuthor {
    public static void main(String[] args) {
        author a1 = new author("Nikolay", "nikolay@gmail.com", '7');
        System.out.println ("Author is"+ a1.getName()+", email:"+ a1.getEmail()+", gender:"+a1.getGender());
        author a2 = new author("Rita"," rita@mail.ru", '4');
        System.out.println ("Author is"+ a2.getName()+", email:"+ a2.getEmail()+", gender:"+a2.getGender());
        author a3 = new author("Nikita"," Nikita@mail.ru", '7');
        System.out.println ("Author is"+ a3.getName()+", email:"+ a3.getEmail()+", gender:"+a3.getGender());
    }
}
