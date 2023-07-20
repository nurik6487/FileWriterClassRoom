import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    }

    public static void method() throws IOException {
        FileWriter fileWriter = new FileWriter("Alfavit.txt");
        FileReader fileReader = new FileReader("Alfavit.txt");
        fileWriter.write("Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Z z \n");
        fileWriter.write("1 2 3 4 5 6 7 8 9");
        fileWriter.close();
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            fileReader.close();
        }
    }
}
