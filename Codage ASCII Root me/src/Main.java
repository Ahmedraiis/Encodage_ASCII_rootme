public class Main {
        public static void main(String[] args) {
            String decode = "4C6520666C6167206465206365206368616C6C656E6765206573743A203261633337363438316165353436636436383964356239313237356433323465";
            for (int i = 0; i+1 < decode.length() ; i += 2) {
                char ascii = (char) Integer.parseInt(decode.substring(i, i + 2), 16);
                System.out.print(ascii);
            }
        }


}