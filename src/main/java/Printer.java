import java.util.Date;

public interface Printer {
    void print(Date date);

    boolean isPrintCalledWith(Date date);
}
