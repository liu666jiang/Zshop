package dlnu.liujiang.zshop.service;

import dlnu.liujiang.zshop.dto.ProductDto;
import dlnu.liujiang.zshop.exception.FileUploadExcetion;
import dlnu.liujiang.zshop.pojo.Product;

import java.util.List;

/**
 * @Auther: liujiang
 * @Date: 2019/5/12 0012
 * Description: dlnu.liujiang.zshop.service.impl
 * @version: 1.0
 */
public interface ProductService {

    /**
     * 查询所有类型信息
     */
    public List<Product> findAll();

    /**
     * 根据id 查询商品
     */

    public Product findById(int id);

    /**
     * 添加商品信息
     */
    public void add(ProductDto productDto) throws FileUploadExcetion;


    /**
     * 根据id修改商品状态
     */
    public void modify(Product product);

    /**
     * 根据id删除商品
     */
    public void deleteById(int id);


}
