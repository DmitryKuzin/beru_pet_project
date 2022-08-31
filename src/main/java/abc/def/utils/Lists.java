package abc.def.utils;

import java.util.List;

public class Lists {

    public static boolean isNotEmpty(List<?> list) {
        return list != null && !list.isEmpty();
    }
}
