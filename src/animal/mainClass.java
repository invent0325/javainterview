package animal;

public class mainClass {
    public static void main(String[] args) {

        CatClass cc = new CatClass("Yes", "Kitty", 3, true);
        System.out.println(cc.getCatName());
        System.out.println(cc.getCatAge());

        cc.setCatName("Pets");
        System.out.println(cc.getCatName());

        cc.walk();
    }
}
