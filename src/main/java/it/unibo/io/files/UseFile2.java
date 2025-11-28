package it.unibo.io.files;

import java.io.File;

public class UseFile2 {
    // "user.dir" -- da dove avete lanciato java
    // "java.home" -- installazione java
    // "file.separator" -- / su unix e \ su windows
	public static final String USER_HOME = System.getProperty("user.home");

	static void main() throws Exception {
        System.out.println("My home is at " + USER_HOME);
		final File homeFolder = new File(USER_HOME);
        System.out.println("Does my home exist? " + homeFolder.exists());
        System.out.println("Is my home a directory? " + homeFolder.isDirectory());
        System.out.println("Can I write on my home directory? " + homeFolder.canWrite());
        final File myFolderToCreate = new File(homeFolder, "deleteme-pss-folder" + File.separator + "myfolder");
        myFolderToCreate.deleteOnExit();
        if (myFolderToCreate.exists()) {
            throw new IllegalStateException("The folder exists");
        }
        if (!myFolderToCreate.mkdir()) {
            System.out.println("Can't create the folder " +  myFolderToCreate + " using mkdirs...");
            if (!myFolderToCreate.mkdirs()) {
                throw new IllegalStateException();
            }
        }
	}
}
