## Strategy Pattern

FlyBehavior has fly() and is implemented in:<br/>
* FlyNoWay
* FlyWithWings

QuackBehavior has quack() and is implement in:
* Quack
* Squeak
* MuteQuack

Duck class instantiates the FlyBehavior and QuackBehavior

MallardDuck is real duck and initializes FlyWithWings and Quack classes.


RubberDuck is not a real duck and initializes FlyNoWay and Squeak classes.


ModelDuck is not a real duck and initializes FlyNoWay and MuteQuack classes.