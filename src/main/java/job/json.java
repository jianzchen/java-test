package job;

import java.util.ArrayList;

/**
 * Created by jianzchen on 2015/4/22.
 */
public class json {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Usage: <job> in.txt out.txt key1 key2 key3");
            System.exit(4);
        }

        String inputPath = args[0];
        String outputPath = args[1];
        ArrayList<String> keys = new ArrayList<String>();
        for (int i = 2; i <= args.length; i++) {
            keys.add(args[i]);
        }

    }
}
