
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class POSInventory
{
    private int itemstock;
    private Lock balanceChangeLock;


    public POSInventory()
    {
        itemstock = 0;
        balanceChangeLock = new ReentrantLock();
    }


    public POSInventory(int initialStock)
    {
        itemstock = initialStock;
    }


    public void CheckIn(int amount)
    {
        balanceChangeLock.lock();
        try
        {
            int newBalance = itemstock + amount;
            itemstock = newBalance;
        }
        finally
        {
            balanceChangeLock.unlock();
        }
    }


    public void CheckOut(int amount)
    {
        balanceChangeLock.lock();
        try
        {
            int newBalance = itemstock - amount;
            itemstock = newBalance;
        }
        finally
        {
            balanceChangeLock.unlock();
        }
    }


    public int GetStock()
    {
        return itemstock;
    }
}
