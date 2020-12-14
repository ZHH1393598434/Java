public class Zhenboye extends CondiementDecorator{
    public Zhenboye(Milktea milktea){
        super(milktea);
        milktea.price+=3;
    }
    public void buy(){
        milktea.buy();
        System.out.prinln("加珍波椰(5元)");
    }
}