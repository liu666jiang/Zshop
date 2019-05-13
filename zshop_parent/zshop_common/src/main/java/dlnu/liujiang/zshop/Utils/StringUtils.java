package dlnu.liujiang.zshop.Utils;

import java.util.UUID;

/**
 * @Auther: liujiang
 * @Date: 2019/5/12 0012
 * Description: dlnu.liujiang.zshop.Utils
 * @version: 1.0
 */
public class StringUtils {

    public  static String renameName(String filename){
        int dotindex=filename.lastIndexOf(".");
        String suffix=filename.substring(dotindex);
        return UUID.randomUUID().toString()+suffix;

    }

}
