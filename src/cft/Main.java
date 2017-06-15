package cft;

import cft.Exception.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.err.println("Error: missing operands");
            return;
        }
        String fileIn = args[0];
        String fileOut = args[1];
        String dataType = args[2];
        String order = args[3];
        try {
            IOData ioData = new IOData();
            Vector vector = ioData.read(fileIn, dataType);
            vector.sort(order);
            ioData.write(fileOut, vector);
            System.out.println(String.format("File '%1$s' written", fileOut));
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (OrderException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (TypeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (VectorException e) {
            System.err.println("Error: File is too large");
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
