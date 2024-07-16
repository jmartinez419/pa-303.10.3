//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
KidUser jess = new KidUser(10,"Kids");
KidUser alex = new KidUser(18,"Fiction");
AdultUser jessy = new AdultUser(5,"Kids");
AdultUser justyn = new AdultUser(23,"Fiction");

jess.registerAcount();
jess.requestBook();
alex.registerAcount();
alex.requestBook();
jessy.registerAcount();
jessy.requestBook();
justyn.registerAcount();
justyn.requestBook();
    }
}