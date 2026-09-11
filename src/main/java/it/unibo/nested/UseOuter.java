package it.unibo.nested;
import java.io.IO;

public class UseOuter {
    static void main() {
        Outer o = new Outer(5);
        Outer.Inner in = o.new Inner();
        IO.println(in.getValue()); // 0
        in.update();
        in.update();
        IO.println(in.getValue()); // 5

        Outer.Inner in2 = new Outer(10).createInner();
        in2.update();
        in2.update();
        IO.println(in2.getValue()); // 20
    }
}
