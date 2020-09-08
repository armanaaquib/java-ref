package iclass;

public class LocalClassExample {
//    public interface a {
//        void a();
//    }

    private static final String NO_DIGIT_REG_EXP = "[^0-9]";
    public static int NUMBER_LEN = 10;

    public static boolean validatePhoneNumber(String phoneNumber) {
//        String notFinal = "notFinal";
//        NUMBER_LEN = 7;
//        public interface a {
//          void a();
//         }

        class PhoneNumber {
            final String pN;
//            private static final int NUMBER_LEN = 10;

            public PhoneNumber(String pN) {
                this.pN = pN;
            }

            public String getFormattedPhoneNumber() {
                String formattedNumber = this.pN.replaceAll(NO_DIGIT_REG_EXP, "");

                if (formattedNumber.length() == NUMBER_LEN) {
                    return formattedNumber;
                }

                return null;
            }

            public void printOriginalNumber() {
                System.out.println("Original Number: " + phoneNumber);
//                System.out.println("Original Number: " + notFinal);
            }
        }

        final PhoneNumber myNumber = new PhoneNumber(phoneNumber);
        myNumber.printOriginalNumber();

        return myNumber.getFormattedPhoneNumber() != null;
    }

    public static void main(String[] args) {
        System.out.println(validatePhoneNumber("1234567890"));
        System.out.println(validatePhoneNumber("12_345_67890"));
        System.out.println(validatePhoneNumber("12_345_6_90"));
    }
}
