public class Proxy implements Interface{
    private User User;
    private String Username;

    public Proxy(String Username){
        this.Username=Username;
    }
    public void buy(){
        User.buy();
    }

}
