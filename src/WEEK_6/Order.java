package WEEK_6;

public class Order {
    private int orderId;
    private String productName;
    private int amount;
    private double unitPrice;
    private double totalPrice;

    //Getters
    public int getOrderId(){
        return orderId;
    }
    public String getProductName(){
        return productName;
    }
    public int getAmount(){
        return amount;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public double getTotalPrice(){
        return totalPrice;
    }

    //Setters
    public void setOrderId(int orderId){
        this.orderId = orderId;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public void calculateTotalPrice(){
        this.totalPrice = this.amount * this.unitPrice;
    }
}