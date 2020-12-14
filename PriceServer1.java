public class PriceServer1{
    Milktea milktea;
    String items[];
    public PriceServer1(String items[]){
        milktea = new Milktea();
        for(item:items){
            if("Pudding"==item){
                milktea = new Pudding(milktea);
            }
            else if("Redbean"==item){
                milktea = new Redbean(milktea);
            }
            else if("Zhenboye"==item){
                milktea = new Zhenboye(milktea);
            }
            else System.out.prinln("error:there is no such thing!");
        }
        milktea.buy();
    }
    int price(){
        return milktea.price;
    }
}