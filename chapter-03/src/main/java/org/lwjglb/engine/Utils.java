package org.lwjglb.engine;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Utils {

    private Utils() {
        // Utility class
    }

    public static String readFile(String filePath) {
        String str;
        try {

            //String basePath = new File("").getAbsolutePath() ;
            //String basePath = Utils.class.getProtectionDomain().getCodeSource().getLocation().getPath() ;
            //String fullPath = basePath + File.separator + filePath ;

            Path path = Paths.get( "" ) ;
            Path path1 = Paths.get( filePath ) ;
            String basePath = path.toAbsolutePath().toString() ;
            String basePath1 = path1.toAbsolutePath().toString() ;
            String fullPath = basePath + File.separator + filePath ;
            File file = new File( fullPath ) ;
            //byte[] bytes = Files.readAllBytes( path ) ;
            byte[] bytes = Files.readAllBytes( Paths.get( fullPath  )) ;
            String data = new String( bytes ) ;
            str = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException excp) {
            throw new RuntimeException("Error reading file [" + filePath + "]", excp);
        }
        return str;
    }
}
