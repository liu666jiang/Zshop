package dlnu.liujiang.zshop.service.impl;

import dlnu.liujiang.zshop.Utils.StringUtils;
import dlnu.liujiang.zshop.dao.ProductDao;
import dlnu.liujiang.zshop.dto.ProductDto;
import dlnu.liujiang.zshop.exception.FileUploadExcetion;
import dlnu.liujiang.zshop.pojo.Product;
import dlnu.liujiang.zshop.pojo.ProductType;
import dlnu.liujiang.zshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StreamUtils;
import org.apache.commons.beanutils.PropertyUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @Auther: liujiang
 * @Date: 2019/5/12 0012
 * Description: dlnu.liujiang.zshop.service.impl
 * @version: 1.0
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class ProductImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Product> findAll() {
        return productDao.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Product findById(int id) {
        return productDao.selectById(id);
    }

    @Override
    public void add(ProductDto productdto) throws FileUploadExcetion {
       //上传文件
     String filename =StringUtils.renameName(productdto.getFileName());
     String filePath=productdto.getUploadPath()+"/"+filename;
        try {
            StreamUtils.copy(productdto.getInputStream(),new FileOutputStream(filePath));
        } catch (IOException e) {
           throw new FileUploadExcetion("文件上传异常"+e.getMessage());
        }

        //保存到数据库
        //将DTO转化成Product
        Product product=new Product();
        try {
            PropertyUtils.copyProperties(product,productdto);
            product.setImage(filePath);
            ProductType productType=new ProductType();
            productType.setId(productdto.getProductTypeId());
            product.setProductType(productType);
            productDao.insert(product);
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modify(Product product) {

    }

    @Override
    public void deleteById(int id) {

    }
}
