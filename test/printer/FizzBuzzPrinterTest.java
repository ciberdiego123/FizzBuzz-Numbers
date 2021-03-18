package printer;

import com.company.printer.FizzBuzzPrinter;
import com.company.printer.Printer;
import org.junit.Test;

public class FizzBuzzPrinterTest {

    Printer fizzBuzzPrinter = new FizzBuzzPrinter();

    @Test
    public void printSomethingTest(){
         fizzBuzzPrinter.print("Something");
    }

}
