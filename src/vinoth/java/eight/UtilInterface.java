package vinoth.java.eight;


/**
 * If all methods are static, we can use interface instead class.
 * static method will not visible to child implementations. It can be access only via name of interface.
 */
interface UtilInterface {

    static String toUpperCase(String s) {
        return s.toUpperCase();
    }

    static String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
