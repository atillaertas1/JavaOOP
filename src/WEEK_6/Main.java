package WEEK_6;

public class Main {
    public static void main(String[] args) {
        Customer customerA = new Customer();
        Customer customerB = new Customer();
        //Customer A
        customerA.setName("Customer");
        customerA.setSurname("A");
        customerA.setMail("customer_a@example.com");
        customerA.setPhoneNumber("+90 111 222 3333");
        //Customer B
        customerB.setName("Customer");
        customerB.setSurname("B");
        customerB.setMail("customer_b@example.com");
        customerB.setPhoneNumber("+90 444 555 6666");
        //print Customer A
        System.out.println("CUSTOMER A");
        System.out.printf("Name:%s\nSurname:%s\nE-mail:%s\nPhone number:%s\n\n",
        customerA.getName(),customerA.getSurname(),customerA.getMail(),customerA.getPhoneNumber());
        //print Customer B
        System.out.println("CUSTOMER B");
        System.out.printf("Name:%s\nSurname:%s\nE-mail:%s\nPhone number:%s\n\n",
        customerB.getName(),customerB.getSurname(),customerB.getMail(),customerB.getPhoneNumber());

        //Customer A's orders
        Order order1 = new Order();
        Order order2 = new Order();
        //order 1
        order1.setOrderId(1);
        order1.setProductName("Computer");
        order1.setAmount(1);
        order1.setUnitPrice(1000);
        //order 2
        order2.setOrderId(2);
        order2.setProductName("Pencil");
        order2.setAmount(5);
        order2.setUnitPrice(4);

        //Customer B's orders
        Order order3 = new Order();
        Order order4 = new Order();
        Order order5 = new Order();
        //order 3
        order3.setOrderId(3);
        order3.setProductName("Phone");
        order3.setAmount(2);
        order3.setUnitPrice(200);
        //order 4
        order4.setOrderId(4);
        order4.setProductName("Headphones");
        order4.setAmount(1);
        order4.setUnitPrice(500);
        //order 5
        order5.setOrderId(5);
        order5.setProductName("Keyboard");
        order5.setAmount(10);
        order5.setUnitPrice(100);
        //calculate total price
        order1.calculateTotalPrice();
        order3.calculateTotalPrice();
        order4.calculateTotalPrice();
        order5.calculateTotalPrice();
        System.out.println("CUSTOMER A's Orders:");
        printOrder(order1);
        printOrder(order2);

        System.out.println("CUSTOMER B's Orders:");
        printOrder(order3);
        printOrder(order4);
        printOrder(order5);
    }
    public static void printOrder(Order order) {
        System.out.printf("Order ID: %d\nProduct Name: %s\nAmount: %d\nUnit Price: %.2f\nTotal Price: %.2f\n\n",
                order.getOrderId(), order.getProductName(), order.getAmount(), order.getUnitPrice(), order.getTotalPrice());
    }
}