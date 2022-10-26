package OOPsBasics.ComparatorPractice;

import java.util.Comparator;

public class CompareClass implements Comparator<User> {
    @Override
    public int compare(User a, User b) {
        return (a.age>b.age)? -1:1;
    }
}
