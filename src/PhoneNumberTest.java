public class PhoneNumberTest {
    public static void main(String[] args) {
        String[] phoneNumberList = {
                "(84)-(0978489648)",
                "(a8)-(22222222)",
                "(84)-(22b22222)",
                "(84)-(9978489648)"
        };

        PhoneNumber phoneNumber = new PhoneNumber();

        for (String number : phoneNumberList) {
            boolean validated = phoneNumber.validate(number);
            System.out.println("Phone number: " + number + " is valid: " + validated);
        }
    }
}
