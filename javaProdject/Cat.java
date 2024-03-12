package javaProdject;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;
    
    
    
    public void setSatiety(boolean satiety) {
        processSatiety(satiety);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        processName(name);
    }

    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        processAppetite(appetite);
    }
    private void processName(String name){
        if(name == null ){
            this.name = "NO Name";
        }
        else{
        this.name = name;
        }
    }
    private void processAppetite(int appetite){
        if(appetite < 0){
            this.satiety = true;
            this.appetite = 0;
        }
        else if(appetite > 20){
            this.appetite = 20;
            this.satiety = false;

        }
        else{
  
            this.appetite = appetite;
        }
    }

    public Cat(String name, int appetite) {
        processName(name);
        processAppetite(appetite);
    }
    public Cat(String name){
        this(name,20);

    }
    public Cat(){

    }

    private void processSatiety(boolean satiety){
        if(satiety = false){
            this.satiety = false;
            this.appetite = 20;
            
        }
        else if(satiety = true){
            this.appetite = 0;
            this.satiety = true;
        }
        
    }

    


    public void eat(Plate food, Cat cat) { 
       
        int resCat = cat.getAppetite();
        int resFood = food.getFood();
        int eat =  resFood - resCat;
        
        
        if(eat < 0){
             
            
            
                
            System.out.println("Кошка слишком голодная ему нехватает еды в тарелке");
            
            System.out.println();
               
        
            
        }
        else{
             
            food.decreaseFood(resFood,resCat);
            System.out.println("Это кошка покушала " + resCat + " еды\nВ тарелке осталось: " + eat + " еды");
            System.out.println();

        }



    }


  
    public String info(){
        return String.format("Name: %s\nAppetite: %d",name, appetite);
    }
}
