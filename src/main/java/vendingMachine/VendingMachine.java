package vendingMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class VendingMachine extends VendingExample
{
    private static Map<String, Integer> itemInventory = new HashMap<>();
    private static VendingExample VM = new VendingExample();
    static Scanner sc;

    public static void main(String args[])
    {
        initiateInventory();
        sc = new Scanner(System.in);
        operateMachine();
    }

    static void operateMachine()
    {
        int checkVendCond;
        System.out.println("\n\nSelamat datang di Vending Machine.");
        while (Balance == 0)
        {
            inputCoins(); // input coins
        }
        String sample = selectItems(); // select items
        if (!itemInventory.containsKey(sample))
        {
            VM.choose(sample, Balance);
            operateMachine();
        } else if (itemInventory.get(sample) == 0)
        {
            System.out.println(sample + " Sold Out");
            operateMachine();
        } else
        {
            checkVendCond = VM.choose(sample, Balance);
            if (checkVendCond == 2)
            {
                System.out.println("Uang anda tidak cukup");
                inputCoins();
            } else
            {
                System.out.println("Thank you for your purchase!! ");
                itemInventory.put(sample, itemInventory.get(sample) - 1);
            }
            operateMachine();
        }
    }

    public static void inputCoins()
    {
        System.out.println("Masukkan Uang");
        String coins = sc.nextLine();
        Balance = VM.drop(coins, Balance);
    }

    public static String selectItems()
    {
        System.out.println("Uang anda di vending machine : " + Balance);
        System.out.println("Select Item: \n");
        System.out.println("Biskuit: 6000");
        System.out.println("Chips: 8000");
        System.out.println("Oreo: 10000");
        System.out.println("Tango: 12000");
        System.out.println("Cokelat: 15000");
        System.out.println("RETURN");
        return (sc.nextLine());
    }

    public static void initiateInventory()
    {
        for (Item i : Item.values())
        {
            itemInventory.put(i.getName(), 5);
        }
    }
}

