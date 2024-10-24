package lab8;

public final class XPoly {

    public static final double sum(double... x) {
        double total = 0;
        for (double num : x) {
            total += num;
        }
        return total;
    }

    public static final double min(double... x) {
        double minValue = x[0];
        for (double num : x) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    public static final double max(double... x) {
        double maxValue = x[0];
        for (double num : x) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static final String toUpperFirstChar(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            words[i] = upperFirstChar + words[i].substring(1);
        }
        return String.join(" ", words);
    }

    
}
