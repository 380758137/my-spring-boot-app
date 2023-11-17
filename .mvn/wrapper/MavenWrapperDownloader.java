import java.net.*;
import java.io.*;
import java.nio.channels.*;

public class MavenWrapperDownloader {

    private static final String WRAPPER_VERSION = "0.5.6";
    private static final String MAVEN_WRAPPER_JAR = ".mvn/wrapper/maven-wrapper.jar";
    private static final String MAVEN_WRAPPER_PROPERTIES = ".mvn/wrapper/maven-wrapper.properties";
    private static final String DOWNLOAD_URL = "https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/"
            + WRAPPER_VERSION + "/maven-wrapper-" + WRAPPER_VERSION + ".jar";

    public static void main(String args[]) {
        System.out.println("- Downloader started");
        File baseDirectory = new File(args[0]);
        File mavenWrapperJar = new File(baseDirectory, MAVEN_WRAPPER_JAR);
        if (!mavenWrapperJar.exists()) {
            System.out.println("- Downloading from: " + DOWNLOAD_URL);
            try {
                downloadFileFromURL(DOWNLOAD_URL, mavenWrapperJar);
                System.out.println("- Successfully downloaded maven-wrapper.jar");
            } catch (IOException e) {
                System.out.println("- Error downloading maven-wrapper.jar");
                e.printStackTrace();
            }
        }
        System.out.println("- Downloader ended");
    }

    public static void downloadFileFromURL(String urlString, File destination) throws IOException {
        if (System.getProperty("os.name").toLowerCase().contains("win")){
            urlString = urlString.replace("https://", "");
        }
        URL website = new URL(urlString);
        ReadableByteChannel rbc;
        rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream(destination);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
    }

}