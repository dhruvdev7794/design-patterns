package strategy;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All Ducks float, even decoys");
    }

    public abstract void display();
}
