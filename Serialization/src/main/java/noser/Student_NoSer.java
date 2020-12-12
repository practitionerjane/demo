package noser;

import java.io.*;

public class Student_NoSer {
    private String name;
    private Address address;

    public Student_NoSer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) throws IOException {
        Student_NoSer student_noSer = new Student_NoSer("studenta", new Address("addressA"));
        File file = new File("noser.Student_NoSer");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student_noSer); //runtime exception: NotSerializableException

    }
}

class Address{
    String name;
    public Address(String name){
        this.name = name;
    }
}