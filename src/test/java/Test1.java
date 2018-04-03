import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class Test1 {

    @Test
    public void test1() {
        String s
            = "\"result\":{\"data\":[\"FINST-ED76OKBRMYD0SZWVKV0IEP1OD40163TBI28QCJ0\","
            + "\"FINST-MJYJBTNVIB0SYYXOVI1YU2C6LJVN38XWM4QCJ0\"],\"totalCount\":2,\"currentPage\":1},\"success\":true";
        String ss = "$.result.totalCount>0";
        // Pattern p = Pattern.compile("([\\w.$]+)(>)([\\w.]+)");
        Pattern p = Pattern.compile("([\\w.$]+)");
        Matcher m = p.matcher(ss);
        StringBuffer sb = new StringBuffer();
        String[] es = new String[3];
        int i = 0;
        int start = 0;
        int end = 0;
        while (m.find()) {
            // System.out.println(m.groupCount());
            // System.out.println(m.group(1));
            // System.out.println(m.group(2));
            // System.out.println(m.group(3));
            System.out.println(m.group());
            es[i] = m.group();
            if (i == 0) {
                start = m.end();
            } else if (i == 1) {
                end = m.start();
            }

            i++;
        }
        System.out.println(start);
        System.out.println(end);
        System.out.println(ss.substring(start, end));

    }

}
