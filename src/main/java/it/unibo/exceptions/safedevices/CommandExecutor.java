package it.unibo.exceptions.safedevices;

/**
 * A helper class for the controller, executin a command over the device row  
 */
public interface CommandExecutor {
	/**
	 * @param s is the String inserted by the user
	 * @throws ExitCommandException
	 * @throws CommandNotRecognisedException
	 * @throws DeviceIsOverException
	 */
	void exec(String s) throws ExitCommandException, 
	                           CommandNotRecognisedException, 
	                           DeviceIsOverException;
	
	/**
	 * @param row is the model part over which commands are executed
	 */
	void setDeviceRow(DeviceRow row);
}
