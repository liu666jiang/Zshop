package dlnu.liujiang.zshop.vo;


import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @Auther: liujiang
 * @Date: 2019/5/12 0012
 * Description: dlnu.liujiang.zshop.vo
 * @version: 1.0
 */
public class ProductVo {
    private String name;
    private Double price;
    private CommonsMultipartFile file;
    private Integer productTypeId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public CommonsMultipartFile getFile() {
        return file;
    }

    public void setFile(CommonsMultipartFile file) {
        this.file = file;
    }

}
