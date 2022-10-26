package OOPsBasics.ComparatorPractice;

import java.util.*;



public class ComparatorPractice {

    public static void main(String[] args) {
        ArrayList<User> users= new ArrayList<>();
        users.add(new User(13, "Goku"));
        users.add(new User(10, "Krillin"));
        users.add(new User(46, "Vegeta"));
        users.add(new User(22, "Napa"));

        for (User userObj:users) {
            System.out.print(userObj.name+",");
        }

           ///Approach 1
//        Collections.sort(users, new Comparator<User>() {
//            @Override
//            public int compare(User a, User b) {
//                return (a.age>b.age)?-1:1;
//            }
//        });

        ///Approach 2
        Collections.sort(users,new CompareClass());

        ///Approach 3
//        Collections.sort(users,(a,b)->  (a.age-b.age));



        System.out.println();
        for (User userObj:users) {
            System.out.print(userObj.name+",");
        }
    }


}
