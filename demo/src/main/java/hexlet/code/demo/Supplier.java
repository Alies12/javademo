package hexlet.code.demo;


public class Supplier {

    private String type;
    private String name;
    private String phone;
    private String discount;

    public Supplier( String type, String name, String phone, String discount) {
        this.type = type;
        this.name = name;
        this.phone = phone;
        this.discount = discount;
    }

    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getDiscount(){
        return discount;
    }
}
