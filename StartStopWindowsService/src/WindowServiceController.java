import java.io.*;

public class WindowServiceController {
	public static final int STATE_UNKNOWN = -1;
	public static final int STATE_STOPPED = 1;
	public static final int STATE_START_PENDING = 2;
	public static final int STATE_STOP_PENDING = 3;
	public static final int STATE_RUNNING = 4;

	public int startService(String serviceName) throws Exception {
		return execServiceController("start", serviceName);
	}

	public int stopService(String serviceName) throws Exception {
		return execServiceController("stop", serviceName);
	}

	public int stateService(String serviceName) throws Exception {
		return execServiceController("query", serviceName);
	}

	private int execServiceController(String cmd, String serviceName) throws Exception {
		final Process proc = Runtime.getRuntime().exec("sc " + cmd + " " + serviceName);
		BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		String line;
		int state = STATE_UNKNOWN;

		while ((line = br.readLine()) != null) // searches for state in the child process output
		{
			int p;

			if ((p = line.indexOf(" STATE ")) != -1) {
				if ((p = line.indexOf(" : ", p)) != -1)
					state = Integer.parseInt(line.substring(p + 3, p + 4));
			}
		}

		int retCode = proc.waitFor();

		if (retCode != 0)
			throw new Exception("Error code of 'sc' is : " + retCode);

		return state;
	}

	/**
	 * Test with 'remote access to registry' service.
	 */
	public static void main(String[] args) throws Exception {
		WindowServiceController winSerContoller = new WindowServiceController();
		String serviceName = "Spooler"; // 'remote access to registry' service.
		String displayName = "Print Spooler";

		System.out.println("State of service " + serviceName + " = " + winSerContoller.stateService(serviceName));
		System.out.println("Starting service " + serviceName + ", state = " + winSerContoller.startService(serviceName));
		Thread.sleep(5000);
		
		System.out.println("State of service " + serviceName + " = " + winSerContoller.stateService(serviceName));
		System.out.println("Stopping service " + serviceName + ", state = " + winSerContoller.stopService(serviceName));
	}
}