package ser_partial;

import java.io.*;

public class Student_Ser implements Serializable {
    private String name;
    private Address address;

    public Student_Ser(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) throws IOException {
        Student_Ser student_ser = new Student_Ser("studenta", new Address("addressA"));
        File file = new File("noser.Student_NoSer");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student_ser); //runtime exception: NotSerializableException: ser.Student_Ser$Address

    }
    static class Address{
        String name;
        public Address(String name){
            this.name = name;
        }
    }
}

