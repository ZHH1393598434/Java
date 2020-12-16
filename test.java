public class test{
    public static void main(String[] args){
        for（string item=items）{
            if("commoncoffee"=item){
                Context context =new Context(new commoncoffee()) ;
                System.out.printf("您购买的咖啡包括commoncoffee，价格为%s元%n", context.Buy());
            }
            if("espress"=item){
                Context context =new Context(new espress()) ;
                System.out.printf("您购买的咖啡包括espress，总价格现为%s元%n", context.Buy());
            }
            if("latte"=item){
                Context context =new Context(new latte()) ;
                System.out.printf("您购买的咖啡包括latte，总价格现为%s元%n", context.Buy());
            }
            if("milk"=item){
                Context context =new Context(new milk()) ;
                System.out.printf("您购买的咖啡包括milk，总价格现为%s元%n", context.Buy());
            }
            if("sugar"=item){
                Context context =new Context(new sugar()) ;
                System.out.printf("您购买的咖啡包括sugar，总价格现为%s元%n", context.Buy());
            }
        }
    }
}