package Arrays_And_Strings;

class StringComparison {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "Python";

        System.out.println("Using equals():");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println("Using compareTo():");
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
    }
}