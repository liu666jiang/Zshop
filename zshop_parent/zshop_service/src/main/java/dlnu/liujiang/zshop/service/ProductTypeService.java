package dlnu.liujiang.zshop.service;

import dlnu.liujiang.zshop.exception.ProductionTypeExistException;
import dlnu.liujiang.zshop.pojo.ProductType;

import java.util.List;

/**
 * @Auther: liujiang
 * @Date: 2019/5/7 0007
 * Description: dlnu.liujiang.zshop
 * @version: 1.0
 */
public interface ProductTypeService {

    /**
     * 查询所有类型信息
     */
    public List<ProductType> findAll();

    /**
     * 根据id 查询商品类型
     */

    public ProductType findById(int id);

    /**
     * 添加商品类型信息
     *
     * 判断类型是否存在，如果存在抛异常，如果不存在添加
     *
     */
    public void add(String name) throws ProductionTypeExistException;

    /**
     * 根据id修改名称
     */
    public void modifyName(int id,String name);

    /**
     * 根据id修改商品状态
     */
    public void modifyStatus(int id);

    /**
     * 根据id删除商品类型
     */
    public void deleteById(int id);

}
