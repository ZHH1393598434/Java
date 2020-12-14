public abstract class CondiementDecorator implements Milktea{
    public Milktea milktea;
    
    public CondiementDecorator(Milktea milktea){
        this.milktea=milktea;
        milktea.price
    }

    public void buy(){
        milktea.buy();
    }
}