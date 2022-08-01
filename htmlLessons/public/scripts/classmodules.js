/**
 * 
 */

//class modules

class Pizza{
    
    // constructor
    constructor (toppings = [], customer) {
      // computer instance property-global fields of pizza
      this.toppings = toppings
      this.customer = customer
    }
  // static property - array of strings 
  static extraToppings = ['pepperoni', 'cheese']
  //  static method
  static sayThankyou () {
    console.log('ThankYou!!!')
  }
  // instance property
  #slices = 10 // private variables
  // non static method
  eat () {
    console.log(this.toppings)
    console.log(this.#slices)
  }

  
  // Getter Property
  get length () {
    return this.#slices
  }
  // setter Property
  set length (value) {
    this.#slices = value
  }
}
const myPizza = new Pizza(['onions'], 'Venkat');
console.log(myPizza.toppings);
console.log(myPizza.customer);
console.log(Pizza.extraToppings);
Pizza.sayThankyou();
myPizza.eat();
myPizza.toppings = ['Carrot', 'Almonds', 'Lobster']
console.log(myPizza.toppings);
console.log(myPizza.length)
myPizza.length = 8
console.log(myPizza.length)
console.log(myPizza.slices)
myPizza.slices = 240;   // adding dynamic field slices to mypizza
console.log(myPizza.length)
console.log(myPizza.slices)
