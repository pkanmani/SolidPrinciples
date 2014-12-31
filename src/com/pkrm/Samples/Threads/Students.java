
public class Students implements Runnable {

	public static void threadMessage(String msg) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s : %s%n", threadName, msg);
	}

	public static void main(String[] args) throws InterruptedException {
		threadMessage("Starting message loop Thread");

		/* Making the Student class as thread object */
		Thread t = new Thread(new Students());
		t.start();// making the thread to begin executions

		threadMessage("Waiting for StudentMessageLoop thread to finish");

		/* Print message if Thread is alive */
		while (t.isAlive())//
		{
			threadMessage("Still waiting....");
			/* Wait 1 sec to student thread to finish */
			t.join(1000);
		}

	}

	@Override
	public void run() {
		String[] studentInfo = { "Student one", "Student two",
				"Student threee", "Student four" };
		try {
			for (int i = 0; i < studentInfo.length; i++) {
				Thread.sleep(4000);
				threadMessage(studentInfo[i]);
			}
		} catch (InterruptedException e) {
			threadMessage("student process wasn't done!");
		}

	}
}
