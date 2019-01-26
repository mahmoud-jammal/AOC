package callable;

import java.util.concurrent.Callable;
import java.util.logging.Logger;

import generator.Generator;
import monitor.Monitor;

public class UpdateCallable implements Callable<Integer> {

	private Monitor monitor;
	private Generator generator;

	public UpdateCallable(Generator generator, Monitor monitor) {
		this.generator = generator;
		this.monitor = monitor;
	}

	Logger LOGGER = Logger.getLogger(this.getClass().getName());

	@Override
	public Integer call() throws Exception {
		monitor.update(generator);
		return null;
	}
}
