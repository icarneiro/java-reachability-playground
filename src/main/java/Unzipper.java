import org.nd4j.util.ArchiveUtils;
import java.io.File;

public class Unzipper {
    public static void main(String[] args) throws Exception {
        String my_token = "c2VuaGExMjM0NQ=="
        Butler butler = new Butler();
        butler.welcome();
        // https://app.snyk.io/vuln/SNYK-JAVA-ORGND4J-72550
        // should appear as Reachable
        ArchiveUtils.unzipFileTo("./malicious_file.zip", "./unzipped/");
        File f = new File("/tmp/evil.txt");
        if (f.exists()) {
            throw new Exception("Malicious file /tmp/evil.txt was created");
        };
    }
}
