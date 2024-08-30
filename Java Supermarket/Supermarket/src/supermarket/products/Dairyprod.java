package supermarket.products;

public class Dairyprod extends Grocprod{
private Fat fat;

public Dairyprod(String name, double price, double discount, Fat fat){
    super(name,price,discount);
    this.fat = fat;
}
public String display(){
    return(super.display()+"/n Fat Level: "+fat);
}
public Fat getFat() {
    return fat;
}
public void setFat(Fat fat) {
    this.fat = fat;
}


}
