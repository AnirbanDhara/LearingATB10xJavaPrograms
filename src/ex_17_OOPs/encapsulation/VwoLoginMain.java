package ex_17_OOPs.encapsulation;

public class VwoLoginMain {
    public static void main(String[] args){
        VwoLogin vw = new VwoLogin("creator","pass345");
        boolean isAdmin = false;
        vw.setUsername("admin");
        vw.setPassword("pass123", isAdmin);
        System.out.println(vw.getUsername());
        System.out.println(vw.getPassword());

    }
}
