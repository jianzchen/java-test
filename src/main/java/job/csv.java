package job;


import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.nio.charset.Charset;

/**
 * Created by jianzchen on 2015/4/22.
 */
public class csv {
    public static void main(String[] args){
        try {
            /*CSV READER*/
            CsvReader r = new CsvReader(args[0],',',Charset.forName("utf-8"));
            r.setEscapeMode(1);
            r.setSkipEmptyRecords(true);
            r.setDelimiter(',');
            r.setRecordDelimiter('\n');
            r.setTrimWhitespace(true);
            r.setCaptureRawRecord(true);
            //r.readHeaders();
            r.setHeaders(new String[]{"id","name"});
            int i = 0;
            while (r.readRecord()) {
                System.out.println("第"+i+"行："+r.getRawRecord());
                System.out.println("id："+r.get("id"));
                System.out.println("name："+r.get("name"));
                System.out.println("");
            }

            /*CSV WRITER*/
            CsvWriter w = new CsvWriter(args[1],',', Charset.forName("GBK"));
            String[] contents = {"99","new"};
            w.writeRecord(contents);
            w.flush();
            w.close();
        } catch (Exception e) {e.printStackTrace();}
    }
}
