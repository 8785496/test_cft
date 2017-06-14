package cft;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        if (args.length < 4) {
//            System.err.println("Error: miss1ing operands");
//            return;
//        }
//        try {
//            if (args[2].equals("'-s")) {
//                Vector<String> vector = new Vector<>(100);
//            } else if (args[2].equals("-i")) {
//                Vector<Integer> vector = new Vector<>(100);
//            }
//
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }

        Vector<String> vector = new Vector<String>(100);;

        if (args[2].equals("'-s")) {
            vector = new Vector<String>(100);
        }

        try {
            vector.add("sd");
        } catch (Exception e) {
            e.printStackTrace();
        }

//        ArrayList

        Reader<Integer> reader = new Reader<>();
        reader.read("123");



    }


}
