public class Context{
    private Strategy strategy;
    
    public Context(Strategy strategy){
        this.srtategy=strategy;
    }
    
    public int Getprice(){
        return strategy.Buy();
    }
}