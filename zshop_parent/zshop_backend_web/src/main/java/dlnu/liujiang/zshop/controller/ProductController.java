package dlnu.liujiang.zshop.controller;

import dlnu.liujiang.zshop.dto.ProductDto;
import dlnu.liujiang.zshop.pojo.ProductType;
import dlnu.liujiang.zshop.service.ProductService;
import dlnu.liujiang.zshop.service.ProductTypeService;
import dlnu.liujiang.zshop.vo.ProductVo;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Auther: liujiang
 * @Date: 2019/5/12 0012
 * Description: dlnu.liujiang.zshop.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("backend/product")
public class ProductController {

    @Autowired
    private ProductTypeService productTypeService;
    @Autowired
    private ProductService productService;
   /**
    *查询所有商品类型
    */
   @ModelAttribute("productTypes")
   public List<ProductType> findAll(){
       List<ProductType> productTypes= productTypeService.findAll();
       return productTypes;
   }
    /**
     * 查找所有商品
     */
    @RequestMapping("/findAll")
    public String findAll(Map map){
//       List<Product> product= productService.findAll();
//       map.put("product",product);
        return "productManager";
    }

    @RequestMapping("/add")
    public String add(ProductVo productVo, HttpSession session, Map map){
        System.out.println(1);
        //得到上传文件路径
        String uploadPath=session.getServletContext().getRealPath("/WEB-INF/upload");
        //将vo转换成dto
        try {
            ProductDto productDto=new ProductDto();
            PropertyUtils.copyProperties(productDto,productVo);
            productDto.setInputStream(productVo.getFile().getInputStream());
            productDto.setFileName(productVo.getFile().getOriginalFilename());
            productDto.setUploadPath(uploadPath);
            productService.add(productDto);
            map.put("successMsg","添加成功");
        } catch (Exception e) {
            map.put("successMsg", e.getMessage());

        }
       return "forward:findAll";
    }

}
