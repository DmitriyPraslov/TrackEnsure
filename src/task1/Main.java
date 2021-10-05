package task1;

public class Main {
    public static void main(String[] args) {
        Bouquet b1 = new Bouquet.Builder()
                .addFlower(new Rose(2,40,65))
                .addFlower(new Pion(1,30,40))
                .addFlower(new Pion(2,30,25))
                .addFlower(new Pion(3,30,15))
                .addFlower(new Rose(1,70,80))
                .addAccessory(new Accessory("Ribbon",5)).build();
        System.out.println(b1.getTotalCost());
        System.out.println(b1.findFlower(40,80));
        b1.sortFlower();
        b1.showBouquet();

    }
}
