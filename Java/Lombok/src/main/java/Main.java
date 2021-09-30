public class Main {
    public static void main(String[] args){
        Customer c1=new Customer(1001,"Sridhara",81000);
        System.out.println(c1);

        Customer c2=new Customer();
        System.out.println(c2);
        c2.setCustId(201);
        c2.setCustName("Shreenidhi");
        c2.setBalance(25000);
        //System.out.println(c2.getCustId()+"\n"+c2.getBalance()+"\n"+c2.getCustName());
        System.out.println(c2.getCustId());
        Person p=new Person();
        p.setName("Shreya");
        p.setAge(22);
        System.out.println(p.getName()+"\n"+p.getAge());

    }
}
