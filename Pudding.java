public class Pudding extends CondiementDecorator{
    public Pudding(Milktea milktea){
        super(milktea);
        milktea.price+=3;
    }
    public void buy(){
        milktea.buy();
        System.out.prinln("加布丁(3元)");
    }
}