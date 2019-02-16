import java.util.*;
import java.lang.*;
import java.io.*;

class User
{
        private String name;
        private String sex;

        public User(String name, String sex) {
                this.name = name;
                this.sex = sex;
        }

        public String getName() {
                return this.name;
        }

        public String getSex() {
                return this.sex;
        }

}

class Appliaction {

        public static void main(String[] args) {

                User andrew = new User("Andrew", "male");
				System.out.println(andrew);

        }
}