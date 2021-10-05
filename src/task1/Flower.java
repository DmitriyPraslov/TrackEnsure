package task1;

import java.util.Comparator;

public abstract class Flower {
    protected int freshGrade;
    protected int length;
    protected int cost;

    public Flower() {
    }

    public Flower(int freshGrade, int length, int cost) {
        this.freshGrade = freshGrade;
        this.length = length;
        this.cost = cost;
    }

//    @Override
//    public int compare(Flower o1, Flower o2) {
//        return o1.freshGrade - o2.freshGrade;
//    }

    @Override
    public String toString() {
        return "Flower{" +
                "freshGrade=" + freshGrade +
                ", length=" + length +
                ", cost=" + cost +
                '}';
    }
}
