package supermarket.products;

import java.util.ArrayList;

public class Grocprod {
    private String name;
    private double price;
    private double discount;

public Grocprod(String name, double price, double discount){
    this.name = name;
    this.price=price;
    this.discount = discount;
}
public double getAccPrice(){
    return price -  (price*discount/100);
}
public double totalDisc(){
    return price*discount/100;
}
public String display(){
    return (
        "Name: " + name+"/n"+
        "Price: "+price+"/n"+
        "Discount: "+discount+"%"
    );
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public double getDiscount() {
    return discount;
}
public void setDiscount(double discount) {
    this.discount = discount;
}
public static void main(String[] args) {
    ArrayList<Grocprod> cart = new ArrayList <Grocprod> ();

    Grocprod bread = new Grocprod("Bread",5,10);
    cart.add(bread);

    Beverages coke = new Beverages("Coke Zero",2,5,SugarLevel.ZERO);
    cart.add(coke);

    Dairyprod milk = new Dairyprod("Milk",10,15,Fat.SKIM);
    cart.add(milk);

    double total = 0;

    double disc = 0;

    for (int i = 0; i<cart.size();i++) {
        total+= cart.get(i).getAccPrice();
    }
    for (int i = 0; i<cart.size();i++) {
        disc+= cart.get(i).totalDisc();
    }
    System.out.println("Total Cost: "+total);
    System.out.println("Total Disc: "+disc);

}
}
