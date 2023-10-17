package Placement;

public class BinaryOperations {
    public static int OperationsBinaryString(String str) {
        if (str == null || str.isEmpty() || str.length() % 2 == 0) {
            return -1;
        }

        int result = Character.getNumericValue(str.charAt(0));

        for (int i = 1; i < str.length(); i += 2) {
            char operation = str.charAt(i);
            char binaryDigit = str.charAt(i + 1);

            int digitValue = Character.getNumericValue(binaryDigit);

            switch (operation) {
                case 'A':
                    result &= digitValue;
                    break;
                case 'B':
                    result |= digitValue;
                    break;
                case 'C':
                    result ^= digitValue;
                    break;
                default:
                    return -1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "1C0A0B0C1B1";
        int result = OperationsBinaryString(str);
        System.out.println(result);
    }
}
