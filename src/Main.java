
public class Main {
    public static void main(String[] args) {
        MyClass myClass1= new MyClass("Baktulan","Nazirbek uulu",24, new String[]{"English","Java Session","Java Theory"},"Beshbarmak");
        System.out.println(myClass1.getInfo());

        MyClass myClass2= new MyClass();
        myClass2.firstName="Baktulan";
        myClass2.lastName="Nazirbek uulu";
        myClass2.age=24;
        myClass2.lessons= new String[]{"English","SoftSkills","Java"};
        myClass2.favoriteFood="Beshbarmak";
        System.out.println(myClass2.getInfo());
    }
}