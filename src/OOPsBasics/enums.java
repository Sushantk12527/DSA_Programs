package OOPsBasics;

public class enums {
    enum Level{
        Low,
        Medium,
        High
    }

    public static void main(String[] args) {
        Level mylevel= Level.High;
        enumPrac(mylevel);
    }

    public static void enumPrac(Level mylevel){
        switch(mylevel){
            case High:
                System.out.println("High");
                break;

            case Medium:
                System.out.println("Medium");
                break;

            case Low:
                System.out.println("Low");
                break;
        }
    }


}
