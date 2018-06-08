package strategy;

public class ModelDuck extends Duck{
    ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Model Duck cannot fly as it is fake");
    }
}
