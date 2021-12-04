package vendingMachine;

class VendingExample
{
    public static int Balance = 0; //stores total balance

    public int drop(String coins, int total)
    {
        if (coins.equals("2000"))
        {
            total += Integer.parseInt(coins);
        } else if (coins.equals("5000"))
        {
            total += Integer.parseInt(coins);
        } else if (coins.equals("10000"))
        {
            total += Integer.parseInt(coins);
        } else if (coins.equals("20000"))
        {
            total += Integer.parseInt(coins);
        } else if (coins.equals("50000"))
        {
            total += Integer.parseInt(coins);
        } else
        {
            System.out.println("Pecahan tidak ada");
        }
        return total;
    }

    public int choose(String sample, int total)
    {
        System.out.println("Anda memilih " + sample);
        if (sample.equals("Biskuit"))
        {
            if (total >= Item.Biskuit.getPrice())
            {
                Balance = total - Item.Biskuit.getPrice();
            } else
            {
                return 2;
            }
        } else if (sample.equals("Chips"))
        {
            if (total >= Item.Chips.getPrice())
            {
                Balance = total - Item.Chips.getPrice();
            } else
            {
                return 2;
            }
        } else if (sample.equals("Oreo"))
        {
            if (total >= Item.Oreo.getPrice())
            {
                Balance = total - Item.Oreo.getPrice();
            } else
            {
                return 2;
            }
        } else if (sample.equals("Tango"))
        {
            if (total >= Item.Tango.getPrice())
            {
                Balance = total - Item.Tango.getPrice();
            } else
            {
                return 2;
            }
        } else if (sample.equals("Cokelat"))
        {
            if (total >= Item.Cokelat.getPrice())
            {
                Balance = total - Item.Cokelat.getPrice();
            } else
            {
                return 2;
            }
        } else if (sample.equals("RETURN"))
        {
            System.out.println("Uang anda " + Balance + " sudah dikembalikan.");
            Balance = 0;
            return -1;
        } else
        {
            System.out.println("Wrong choice: Your balance is " + Balance);
            return 0;
        }
        return 1;
    }
}