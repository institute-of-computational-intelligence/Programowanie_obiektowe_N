package lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

// Nie da się robić "top-level" klas statycznych - whaaat
public class  MyUtilities {
    public static class DateFormatter{
         public static String FormatDate(String pattern, Date date) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                return simpleDateFormat.format(date);
        }
    }
}
