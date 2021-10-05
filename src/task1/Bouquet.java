package task1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Bouquet {
    private List<Flower> flowerList = new ArrayList<>();
    private List<Accessory> accessoryList = new ArrayList<>();

    public static class Builder{
        Bouquet bouquet;
        public Builder() {
            bouquet = new Bouquet();
        }

        public Builder addFlower(Flower flower){
            bouquet.flowerList.add(flower);
            return this;
        }
        public Builder addAccessory(Accessory accessory){
            bouquet.accessoryList.add(accessory);
            return this;
        }

        public Bouquet build (){
            return bouquet;
        }
    }

    private Bouquet() {
    }

    public int getTotalCost (){
        int result = 0;
        for (Flower temp : flowerList){
            result += temp.cost;
        }
        for (Accessory temp : accessoryList){
            result += temp.cost;
        }
        return result;
    }

    public List<Flower> findFlower(int start, int end){
        List<Flower> result = new ArrayList<>();
        for (Flower flower : flowerList){
            if (flower.length>start&&flower.length<end){
                result.add(flower);
            }
        }
        return result;
    }

    public void sortFlower (){
        flowerList = flowerList.stream().sorted(Comparator.comparingInt(a -> a.freshGrade)).collect(Collectors.toList());
    }

    public void showBouquet(){
        System.out.println(flowerList);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowerList=" + flowerList +
                '}';
    }
}
