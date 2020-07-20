package AdapterPattern.Implement2;

import AdapterPattern.Interface2.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Ò ó o...");
    }

    @Override
    public void fly() {
        System.out.println("Bay được một đoạn");
    }
}
