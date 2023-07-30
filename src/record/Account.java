package record;

public record Account(String name, String address, String phone) {
    public static void main(String[] args) {
        var account = new Account("John", "123 Main St", "555-555-5555");
        System.out.println(account.name());
        System.out.println(account.address());
        System.out.println(account.phone());
    }
}