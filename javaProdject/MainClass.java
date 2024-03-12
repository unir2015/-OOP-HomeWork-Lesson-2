package javaProdject;

public class MainClass {

    public static void main(String[] args) {
        Cat cat = RandomCat.generateCat();
        
        System.out.println(cat.info());
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate, cat);
        
        // не смог реализовать 
        // Cat[] cats = RandomCat.generateCats(20);
        // for (Cat res : cats) {

        //     res.eat(plate, res);
        //     System.out.println(cat.info());
            
        // }
    }

}
