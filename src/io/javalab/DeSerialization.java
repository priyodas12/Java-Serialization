package io.javalab;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
    public static void main(String[] args) throws IOException {

        Product productInput = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try{
            fis=new FileInputStream("product.ser");
            ois=new ObjectInputStream(fis);
            productInput=(Product)ois.readObject();

        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            fis.close();
            ois.close();
        }
        System.out.println(productInput.getMfd()+""+productInput.getPrice()+""+productInput.getProductId());
    }
}
