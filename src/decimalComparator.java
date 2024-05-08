public class decimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756,3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces (double p1, double p2){
        boolean result = false;
        int p1ConvertedtoInt = (int)(p1*1000);
        int p2ConvertedtoInt = (int)(p2*1000);
        if(p1ConvertedtoInt == p2ConvertedtoInt){
            result = true;
        }

        return result;
    }
}
