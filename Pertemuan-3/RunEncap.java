public class RunEncap {
    public static void main(String args[]) {
        EncapTest encap1 = new EncapTest();
        encap1.setName("James");
        encap1.setAge(35); // akan jadi 30
        System.out.println("Name : " + encap1.getName() + " Age : " + encap1.getAge());

        EncapTest encap2 = new EncapTest();
        encap2.setName("Alice");
        encap2.setAge(15); // akan jadi 18
        System.out.println("Name : " + encap2.getName() + " Age : " + encap2.getAge());

        EncapTest encap3 = new EncapTest();
        encap3.setName("Bob");
        encap3.setAge(25); // akan tetap 25
        System.out.println("Name : " + encap3.getName() + " Age : " + encap3.getAge());
    }
}