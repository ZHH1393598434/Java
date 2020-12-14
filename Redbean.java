public class Redbean extends CondiementDecorator{
    public Redbean(Milktea milktea){
        super(milktea);
        milktea.price+=4;
    }
    public void buy(){
        milktea.buy();
        System.out.prinln("加红豆(4元)");
    }
}