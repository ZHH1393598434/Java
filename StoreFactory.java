public class StoreFactory {
    public Store getStore(String store) {
        if (store.equalsIgnoreCase("Starbucks")) {
            return new Starbucks();
        } else if (store.equalsIgnoreCase("Yidiandian")) {
            return new Yidiandian();
        }
        return null;
    }
}
