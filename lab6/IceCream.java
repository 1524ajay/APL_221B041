class IceCream extends Decorator{
    IceCream (Offering offering){
        this.offering = offering;
    }
    
    String getName(){
        return offering.getName() + " with Ice Cream";
    }
    
    int getPrice(){
        return offering.getPrice()+60;
    }
}