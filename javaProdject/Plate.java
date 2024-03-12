package javaProdject;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        processFood(food);
    }

    private void processFood(int food){
        if(food < 0){
            this.food = 0;
        }
        else if(food > 110){
            this.food = 110;
        }
        else{
            this.food = food;
        }
    }
    public Plate(int food) {
        processFood(food);
    }
    public Plate() {
        
    }


    public int decreaseFood(int food, int appetite){
        int res = food - appetite;
        processFood(res);
        return res;
          
    }







    

    public void info() {
        System.out.println("plate: " + food);
    }
}
    

