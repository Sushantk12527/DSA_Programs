package OOPsBasics;


 class Pairs<T>{

    T a;
    T b;

    public void print(){
        System.out.println(this.a+""+this.b);
    }

}
public class GenericType {

    public static void main(String[] args) {
        Pairs<String> val=new Pairs<>();
        val.a="Hello";
        val.b="World";

        Pairs<Integer> num= new Pairs<>();
        num.a=5;
        num.b=5;

        val.print();
        num.print();
    }


}
