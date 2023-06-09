public class StringRotationChecker {
    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;
        if (concatenated.contains(str2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";
        boolean result = isRotation(str1, str2);
        System.out.println(result); // Output: true
    }
}
