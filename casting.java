public class casting {
    public static void main(String[] args) {
        //implicit casting
        //byte > short > int > long

        // short x = 1;
        // int y = x+2;
        // System.out.println(y);

        String x = "1";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);
    }
}
