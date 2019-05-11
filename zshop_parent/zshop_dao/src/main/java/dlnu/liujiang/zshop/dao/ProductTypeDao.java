package dlnu.liujiang.zshop.dao;


import dlnu.liujiang.zshop.pojo.ProductType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: liujiang
 * @Date: 2019/5/7 0007
 * Description: dlnu.liujiang.zshop.dao
 * @version: 1.0
 */
public  interface ProductTypeDao {

    /**
     * 查询所有类型信息
     */
  public List<ProductType> selectAll();

    /**
     * 根据id 查询商品类型
     */

    public ProductType selectById(int id);

  /**
   * 根据名称查询商品类型
   */

  public ProductType selectByName(String name);

  /**
     * 添加商品类型信息
     */
  public void insert(@Param("name")String name, @Param("status") int status);

    /**
     * 根据id修改名称
     */
    public void updateName(@Param("id")int id,@Param("name")String name);

    /**
     * 根据id修改商品状态
     */
    public void updateStatus(@Param("id")int id,@Param("status")int status);

    /**
     * 根据id删除商品类型
     */
    public void deleteById(int id);
}
