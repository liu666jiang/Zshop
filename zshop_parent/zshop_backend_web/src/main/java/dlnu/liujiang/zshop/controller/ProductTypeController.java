package dlnu.liujiang.zshop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dlnu.liujiang.zshop.Utils.ResponseResult;
import dlnu.liujiang.zshop.constant.PaginationConstant;
import dlnu.liujiang.zshop.constant.ResposeStatusConstant;
import dlnu.liujiang.zshop.exception.ProductionTypeExistException;
import dlnu.liujiang.zshop.pojo.ProductType;
import dlnu.liujiang.zshop.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Auther: liujiang
 * @Date: 2019/5/8 0008
 * Description: dlnu.liujiang.zshop.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/backend/productType")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping("/findAll")
    public String findAll(Integer pageNum,Map map){
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum= PaginationConstant.PAGE_NUM;
        }

        //设置分页
        PageHelper.startPage(pageNum,PaginationConstant.PAGE_SIZE);
        //处理业务
        //将查询到的所有数据进行分页设置，封装PageInfo对象
        List<ProductType> productTypes= productTypeService.findAll();
        PageInfo<ProductType> pageInfo=new PageInfo<>(productTypes);
        map.put("pageInfo",pageInfo);

        return "productTypeManager";
    }
    @RequestMapping("/add")
    @ResponseBody
    public ResponseResult add(String name){
        ResponseResult result=new ResponseResult();
        try {
            result.setStatus(ResposeStatusConstant.RESPONSE_STATUS_SUCCESS);
            result.setMsg("添加成功");
            productTypeService.add(name);

        } catch (ProductionTypeExistException e) {
            //e.printStackTrace();
            result.setStatus(ResposeStatusConstant.RESPONSE_STATUS_FAIL);
            result.setMsg(e.getMessage());
        }
         return result;
    }


    @RequestMapping("findById")
    @ResponseBody
    public ResponseResult findById(int id){
        ProductType productType=productTypeService.findById(id);
        return    ResponseResult.success(productType);
    }
    @RequestMapping("/update")
    @ResponseBody
    public ResponseResult update(int id,String name){
        System.out.println(id+"    "+name);
        ResponseResult result=new ResponseResult();
        productTypeService.modifyName(id,name);
        result.setStatus(ResposeStatusConstant.RESPONSE_STATUS_SUCCESS);
        result.setMsg("修改成功");
        return result;
    }


    @RequestMapping("/removeById")
    @ResponseBody
    public ResponseResult removebyId(Integer id){
        System.out.println(id);
        ResponseResult result=new ResponseResult();
        productTypeService.deleteById(id);
        result.setStatus(ResposeStatusConstant.RESPONSE_STATUS_SUCCESS);
        result.setMsg("删除成功");
        return result;
    }

    @RequestMapping("/modifystayus")
    @ResponseBody
    public ResponseResult modifystayus(Integer id){
        ResponseResult result=new ResponseResult();
        productTypeService.modifyStatus(id);
        result.setStatus(ResposeStatusConstant.RESPONSE_STATUS_SUCCESS);
        result.setMsg("删除成功");
        return result;
    }
}
