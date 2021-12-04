package vendingMachine;

public enum Item
{
    Biskuit("Biskuit", 6000),
    Chips("Chips", 8000),
    Oreo("Oreo", 10000),
    Tango("Tango", 12000),
    Cokelat("Cokelat", 15000);
    private String name;
    private int price;

    Item(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }
}