public class strings {
    public static void main(String[] args) {
        String message = "          Good work keep it up" + "!!";
        
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("k"));
        System.out.println(message.replace("a", "u"));
        System.out.println(message.trim());
        System.out.println(message);
    }
}
