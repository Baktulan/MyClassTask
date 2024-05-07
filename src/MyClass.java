import java.util.Arrays;

public class MyClass {
    String firstName;
    String lastName;
    int age;
    String[] lessons;
    String favoriteFood;

    public MyClass() {
    }

    public MyClass(String firstName, String lastName, int age, String[] lessons, String favoriteFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lessons = lessons;
        this.favoriteFood = favoriteFood;
    }
    public String getInfo(){
        return "First Name: "+firstName+"\n"+
                "Last Name: "+lastName+"\n"+
                "Age: "+age+"\n"+
                "Lessons: "+ Arrays.toString(lessons) +"\n"+
                "Favorite foods: "+favoriteFood+"\n";
    }
}

