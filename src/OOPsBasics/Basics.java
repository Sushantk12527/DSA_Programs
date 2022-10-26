package OOPsBasics;

public class Basics {
    public static void main(String[] args) {
        Person ps1= new Person();
       inc(ps1);

    }
    static void inc(Person person){

        person.count++;
        System.out.println(person.count);
    }
}



    class Person{
      int count=1;

}