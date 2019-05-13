package dlnu.liujiang.zshop.exception;

/**
 * @Auther: liujiang
 * @Date: 2019/5/12 0012
 * Description: dlnu.liujiang.zshop.exception
 * @version: 1.0
 */
public class FileUploadExcetion extends  Exception {
    public FileUploadExcetion() {
        super();
    }

    public FileUploadExcetion(String message) {
        super(message);
    }

    public FileUploadExcetion(String message, Throwable cause) {
        super(message, cause);
    }

    public FileUploadExcetion(Throwable cause) {
        super(cause);
    }
}
