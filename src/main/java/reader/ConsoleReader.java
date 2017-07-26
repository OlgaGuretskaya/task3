package reader;

import java.util.Scanner;

/**
 * Используется для чтения текста, введенного с консоли
 */
public class ConsoleReader implements Reader{
    @Override
    public String readString() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }
}
