package m02.s10;

public class DoWhile {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please, pass me some arguments");
            return;
        }

        int i = 0;
        do {
            System.out.println("arg " + i + " is " + args[i]);
            i += 1;
        } while (i < args.length);
    }
}
