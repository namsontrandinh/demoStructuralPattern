package AdapterPattern.Adapter;

import AdapterPattern.Interface1.Duck;
import AdapterPattern.Interface2.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i=0; i<3; i++){
            turkey.fly();
        }
    }
}
