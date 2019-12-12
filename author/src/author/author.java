package author;
import java.lang.*;
public class author {
        private String name;
        private String email;
        private char gender;

        public author (){
            name="Gog";
            email="gog@gmail.com";
            gender='s';
        }
        public author (String n) {
            name=n;
            email="gog@gmail.com";
            gender='a';
        }
        public author (String n, String e, char g){
            name = n;
            email = e;
            gender = g;

        }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
            return "Author @ ("+ this.name+", "+this.email+").";
    }
}