package javaProdject;

import java.util.Random;

public class RandomCat {

    private static Random random = new Random();

    public static Cat generateCat(){
        String[] names = new String[] { "Барсик", "Мурзик", "Мурка", "Снежок", "Снежинка", "Вася", "Легендарныйй Матроскин", "Пушок", "Пират", "Малыш" };
        

        int appetite = random.nextInt(0, 21);
        return new Cat(names[random.nextInt(names.length)], appetite);
    }


// не смог реализовать 

    // public static Cat[] generateCats(int count){
    //     Cat[] Cats = new Cat[count];
    //     for (int i = 0; i < count; i++){
    //         Cats[i] = generateCat();
    //     }
    //     return Cats;
    
    // }
}   
