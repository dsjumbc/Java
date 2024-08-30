package supermarket.products;

public class Beverages extends Grocprod{
private SugarLevel sugarlevel;

public Beverages(String name, double price, double discount, SugarLevel sugarlevel){
    super(name,price,discount);
    this.sugarlevel = sugarlevel;
}
public String display () {
    return(super.display()+"/n Sugar Level: "+sugarlevel);
}
public SugarLevel getSugarlevel() {
    return sugarlevel;
}
public void setSugarlevel(SugarLevel sugarlevel) {
    this.sugarlevel = sugarlevel;
}



}
