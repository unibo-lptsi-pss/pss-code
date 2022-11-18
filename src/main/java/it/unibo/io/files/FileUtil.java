package it.unibo.io.files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    private static final String USER_HOME = System.getProperty("user.home");

    public static List<File> findFilesInHomeDirectoryByExtension(final String extension) {
        final var userHome = new File(USER_HOME);
        final var allFiles = userHome.listFiles();
        if (!userHome.isDirectory()) {
            throw new IllegalStateException("The user home is not a directory!");
        }
        final var result = new ArrayList<File>();
        for (final var file: allFiles) {
            if (file.isFile() && file.getName().endsWith("." + extension)) {
                result.add(file);
            }
        }
        return result;
    }
}