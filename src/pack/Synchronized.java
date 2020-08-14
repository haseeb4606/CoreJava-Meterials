package pack;

public class Synchronized {

	public synchronized void show(String n) {

		for (int i = 0; i < 5; i++) {

			System.out.print("Good Mroning" + " ");

			try {
				Thread.sleep(1000);
			}

			catch (InterruptedException e) {
			}

			System.out.println(n);
		}

	}
}