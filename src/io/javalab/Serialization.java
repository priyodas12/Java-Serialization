package io.javalab;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    public static void main(String[] args) throws IOException {

        Product product=new Product(123,23.97,"India");

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{
            fos=new FileOutputStream("product.ser");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(product);
            System.out.println("object serialized");

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            fos.close();
            oos.close();
        }
    }
}
