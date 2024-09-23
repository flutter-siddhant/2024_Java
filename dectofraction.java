class DecimalToFraction {

    // Function to calculate the greatest common divisor (GCD)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to convert a decimal number to a fraction
    public static String decimalToFraction(double decimalNumber) {
        // Handle integers directly
        if (decimalNumber == (int) decimalNumber) {
            return (int) decimalNumber + "/1";
        }

        // Convert decimal to string to find how many decimal places it has
        String decimalStr = Double.toString(decimalNumber);
        int decimalPlaces = decimalStr.length() - decimalStr.indexOf('.') - 1;

        // Calculate numerator and denominator
        int denominator = (int) Math.pow(10, decimalPlaces);
        int numerator = (int) (decimalNumber * denominator);

        // Simplify the fraction by dividing by the GCD
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(decimalToFraction(0.25));  // Output: 1/4
        System.out.println(decimalToFraction(0.5));   // Output: 1/2
        System.out.println(decimalToFraction(1.25));  // Output: 5/4
        System.out.println(decimalToFraction(3));     // Output: 3/1
    }
}
