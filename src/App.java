public class App {
    public static void main(String[] args) {
        Biglietteria b = new Biglietteria();
        Controllore c = new Controllore();
        Treno t = new Treno();

        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(t.toString());
    }
}