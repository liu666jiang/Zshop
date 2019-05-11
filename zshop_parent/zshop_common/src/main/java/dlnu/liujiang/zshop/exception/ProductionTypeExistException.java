package dlnu.liujiang.zshop.exception;

/**
 * @Auther: liujiang
 * @Date: 2019/5/7 0007
 * Description: dlnu.liujiang.zshop.exception
 * @version: 1.0
 */
public class ProductionTypeExistException extends Exception {

    public ProductionTypeExistException() {
        super();
    }

    public ProductionTypeExistException(String message) {
        super(message);
    }

    public ProductionTypeExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductionTypeExistException(Throwable cause) {
        super(cause);
    }
}
