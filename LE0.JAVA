public class LE0{
    int speed;
    String name;

    
    void setSpeed(int speed) {
        this.speed = speed;
    }


    void setName(String name) {
        this.name = name;
    }

   
    int getSpeed() {
        return speed;
    }


    String getName() {
        return name;
    }

    public static void main(String[] args) {
        Main m1 = new Main(); 

        
        m1.setName("hdydg");
        m1.setSpeed(45);  

       
        System.out.println("Name: " + m1.getName());
        System.out.println("Speed: " + m1.getSpeed()); 
    }
}
