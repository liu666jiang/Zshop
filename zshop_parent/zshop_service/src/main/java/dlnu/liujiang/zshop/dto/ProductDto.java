package dlnu.liujiang.zshop.dto;


import java.io.InputStream;

/**
 * @Auther: liujiang
 * @Date: 2019/5/12 0012
 * Description: 数据传输对象
 * @version: 1.0
 */
public class ProductDto {
    private Integer id;
    private String name;
    private  Double price;
    //输入流
    private InputStream inputStream;
    private Integer productTypeId;
    //文件名称
    private String fileName;
    //文件上传路径
    private String uploadPath;

    public ProductDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }
}
