package dlnu.liujiang.zshop.service.impl;

import dlnu.liujiang.zshop.constant.ProductTypeConstant;
import dlnu.liujiang.zshop.dao.ProductTypeDao;
import dlnu.liujiang.zshop.exception.ProductionTypeExistException;
import dlnu.liujiang.zshop.pojo.ProductType;
import dlnu.liujiang.zshop.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @Auther: liujiang
 * @Date: 2019/5/7 0007
 * Description: dlnu.liujiang.zshop.service.impl
 * @version: 1.0
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeDao productTypeDao;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<ProductType> findAll() {
        return productTypeDao.selectAll();
    }
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public ProductType findById(int id) {
        return productTypeDao.selectById(id);
    }

    @Override
    public void add(String name) throws ProductionTypeExistException {
        /**
         * 判断类型是否存在，如果存在抛异常，如果不存在添加
         */
        ProductType productType = productTypeDao.selectByName(name);
        if(productType!=null){

            throw  new ProductionTypeExistException("商品类型已存在");

        }
        productTypeDao.insert(name, ProductTypeConstant.PRODUCT_TYPE_ENABLE);
    }

    @Override
    public void modifyName(int id, String name) {
        productTypeDao.updateName(id, name);
    }

    @Override
    public void modifyStatus(int id) {
        ProductType productType=findById(id);
        int status = productType.getStatus();
        if(status==ProductTypeConstant.PRODUCT_TYPE_ENABLE){
             status=ProductTypeConstant.PRODUCT_TYPE_DISABLE;
        }else{
            status=ProductTypeConstant.PRODUCT_TYPE_ENABLE;
        }
        productTypeDao.updateStatus(id,status);
    }

    @Override
    public void deleteById(int id) {
        productTypeDao.deleteById(id);
    }
}
