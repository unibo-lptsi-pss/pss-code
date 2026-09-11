package it.unibo.collections.generic.constrained;
import java.io.IO;

public class UseLampsRow {

	public static void main(String[] s) {
		final LampsRow<UnlimitedLamp> lr = new LampsRow<>();
		lr.addLamp(new UnlimitedLamp());
		lr.addLamp(new UnlimitedLamp());
		lr.addLamp(new UnlimitedLamp());

		lr.getLamp(0).switchOn();
		lr.switchOffAll();

		IO.println(lr.getLamp(0).isOver());
		IO.println(lr);
	}
}
