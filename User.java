public class User implements Interface{
    private String Username;

    public User(String Username){
        this.Username=Username;
        System.out.printf("用户名为：%s",Username);
    }
    public void buy(){
        System.out.printf("提交订单信息：");
    }
}
