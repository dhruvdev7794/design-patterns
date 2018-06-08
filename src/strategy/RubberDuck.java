package strategy;

public class RubberDuck extends Duck {
    RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Rubber ducks squeaks and does not fly");
    }
}
