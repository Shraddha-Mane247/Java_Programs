//
class Stock
{
    Stock()
    {

    }
    int stockId=0;
    String stockNm;
    double pricePerShare;
    final double Transaction_fee=0.02;

    static void displayMarketStatus()
    {

    }
}
interface TradeOperations
{
    void buyShares(int quantity);
    void sellShares(int quantity);
}

class stockPortfolio implements  TradeOperations
{
    private stockPortfolio()
    {

    }

    public void buyShares(int quantity)
        {
    
        }

    public void sellShares(int quantity)
    {

    }
     static void getInstance()
     {

     }

}
class MainStock
{
    public static void main(String args[])
    {
        Stock s1=new Stock();
    }
}