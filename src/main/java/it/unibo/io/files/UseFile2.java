package it.unibo.io.files;

import java.io.File;
import java.io.IO;

public class UseFile2 {
    // "user.dir" -- da dove avete lanciato java
    // "java.home" -- installazione java
    // "file.separator" -- / su unix e \ su windows
	public static final String USER_HOME = System.getProperty("user.home");

	static void main() throws Exception {
        IO.println("My home is at " + USER_HOME);
		final File homeFolder = new File(USER_HOME);
        IO.println("Does my home exist? " + homeFolder.exists());
        IO.println("Is my home a directory? " + homeFolder.isDirectory());
        IO.println("Can I write on my home directory? " + homeFolder.canWrite());
        final File myFolderToCreate = new File(homeFolder, "deleteme-pss-folder" + File.separator + "myfolder");
        myFolderToCreate.deleteOnExit();
        if (myFolderToCreate.exists()) {
            throw new IllegalStateException("The folder exists");
        }
        if (!myFolderToCreate.mkdir()) {
            IO.println("Can't create the folder " +  myFolderToCreate + " using mkdirs...");
            if (!myFolderToCreate.mkdirs()) {
                throw new IllegalStateException();
            }
        }
	}
}
