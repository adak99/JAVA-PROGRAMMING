public class constructor {

    private int x, y, sum;

    constructor() { // defualt construcors
        System.out.println("Constructors.");
    }

    constructor(int a, int b) {// Parametarized constructors

        x = a;
        y = b;
        sum = a + b;
        System.out.println("Ans:- " + sum);
    }

    constructor(constructor cons) {// copy constructors

        this.x = cons.x;
        this.y = cons.y;
        this.sum = cons.sum;
        System.out.println("Copy constructors:- " + this.sum);
    }

    public static void main(String[] args) {

        constructor a = new constructor();
        constructor y = new constructor(2, 9);
        constructor z = new constructor(y);
    }
}