public class Buy {
    public static void main(String[] args) {
        Interface user =new Proxy("user1");

        System.out.print("提交订单信息");
        user.buy();
    }
}
