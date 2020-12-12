package ser_transient;

import java.io.*;

public class Student_Ser implements Serializable {
    /**
     * Thread need to be marked transient
     * or it will have NotSerializableException: java.lang.Thread
     */
    private transient Thread thread = new Thread();
    private String name;
    private Address address;
    public Student_Ser(){
        System.out.println("in Student cons 0");
    }
    public Student_Ser(String name, Address address) {
        System.out.println("in Student cons 1");
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student_Ser student_ser = new Student_Ser("studenta", new Address("addressA"));
        File file = new File("noser.Student_NoSer");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student_ser); //runtime exception: NotSerializableException: ser.Student_Ser$Address

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ojs = new ObjectInputStream(fis);
        Student_Ser ser_back = (Student_Ser) ojs.readObject();
        System.out.println(ser_back.address.name);
        System.out.println(student_ser == ser_back); //false
        System.out.println(student_ser.address == ser_back.address); //false

    }
    static class Address implements Serializable{
        String name;
        public Address(){
            System.out.println("in Address cons 0");
        }
        public Address(String name){
            System.out.println("in Address cons 1");
            this.name = name;
        }
    }
}

