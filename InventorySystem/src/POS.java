
public class POS
{
    private POSInventory[] accounts;




    public POS(int size)
    {
        accounts = new POSInventory[size];
        for (int i = 0; i < accounts.length; i++)
        {
            accounts[i] = new POSInventory();
        }
    }


    public void CheckIn(int AccountNumber, int amount)
    {
        POSInventory account = accounts[AccountNumber];
        account.CheckIn(amount);
    }


    public void CheckOut(int AccountNumber, int amount)
    {
        POSInventory account = accounts[AccountNumber];
        account.CheckOut(amount);
    }


    public int GetStock(int AccountNumber)
    {
        POSInventory account = accounts[AccountNumber];
        return account.GetStock();
    }
}
