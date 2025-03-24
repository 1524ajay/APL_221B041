public class Baverage{
    private void pour(int qty){
        System.out.println("Pour"+qty+" ml of baverage");
    }
    abstract void addCondiments();
    void stir();
    private void serve(){
        System.out.println("serve appropirate");
    }
    public void template(int qty){
        pour(qty);
        addCondiments();
        stir();
        serve();
    }
}