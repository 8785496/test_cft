package cft;

import cft.Exception.TypeException;
import cft.Exception.VectorException;

import java.io.*;

public class IOData {
    final private String typeString = "-s";
    final private String typeInteger = "-i";
    private int capacity;

    IOData() {
        this.capacity = 100;
    }

    IOData(int capacity) {
        this.capacity = capacity;
    }

    public Vector read(String fileName, String type) throws IOException, VectorException, TypeException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
        String line;
        Vector data;
        if (type.equals(typeString)) {
            data = new Vector<String>(capacity);
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
        } else if (type.equals(typeInteger)) {
            data = new Vector<Integer>(capacity);
            while ((line = br.readLine()) != null) {
                data.add(Integer.parseInt(line));
            }
        } else {
            throw new TypeException("Unknown type " + type);
        }
        return data;
    }

    public void write(String fileName, Vector data) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"));
        for (int i = 0; i < data.getLength(); i++) {
            out.write(data.get(i).toString());
            out.newLine();
        }
        out.close();
    }
}
