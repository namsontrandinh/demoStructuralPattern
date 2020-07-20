package AdapterPattern.Implement1;

import AdapterPattern.Interface1.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quác quác...");
    }

    @Override
    public void fly() {
        System.out.println("Bay như chim");
    }
}
