public class Riddle {

    public static void main(String []args) {

    }
    public void runRiddle(){
        class A {
            public int getX() {
                return 10;
            }
        }
        class B extends A {
            public int getX() {
                return 10;
            }

            public int getX(int y) {
                return y + 10;
            }
        }
        class C extends B {
            public int getX() {
                return 30;
            }
        }

        int x;

        {
            A a = new A();
            x = a.getX();
            System.out.println(x);
            // returns 10

            B b = new B();
            x = b.getX();
            System.out.println(x);
            // prints 10

            x = b.getX(x);
            System.out.println(x);
            // prints 20
        }

        {

            C c = new C();
            x = c.getX();
            System.out.println(x);
            // prints 30

            x = c.getX(c.getX());
            System.out.println(x);
            // prints 40

            A b = new C();
            x = b.getX();
            System.out.println(x);
            // prints 30

            C a = new C();
            x = a.getX();
            System.out.println(x);
            // prints 30

            x = a.getX() + b.getX() + c.getX();
            System.out.println(x);
            // prints 90
        }
    }
}
