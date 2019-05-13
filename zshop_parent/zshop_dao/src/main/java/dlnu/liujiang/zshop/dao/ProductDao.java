package dlnu.liujiang.zshop.dao;

import dlnu.liujiang.zshop.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: liujiang
 * @Date: 2019/5/12 0012
 * Description: dlnu.liujiang.zshop.dao
 * @version: 1.0
 */
public interface ProductDao {

    /**
     * 查询所有类型信息
     */
    public List<Product> selectAll();

    /**
     * 根据id 查询商品
     */

    public Product selectById(int id);

    /**
     * 添加商品信息
     */
    public void insert(Product product);


    /**
     * 根据id修改商品状态
     */
    public void update(Product product);

    /**
     * 根据id删除商品
     */
    public void deleteById(int id);




}
