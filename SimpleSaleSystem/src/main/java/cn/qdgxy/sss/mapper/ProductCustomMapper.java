package cn.qdgxy.sss.mapper;

import cn.qdgxy.sss.po.ProductCustom;

import java.util.List;

/**
 * 自定义ProductMapper
 * create:2016-11-14 18:08
 *
 * @author 李欣
 * @version 1.0
 */
public interface ProductCustomMapper {

    /**
     * 查找所有商品
     *
     * @return 商品
     */
    List<ProductCustom> findAllProduct();

    /**
     * 按商品ID查找商品和购买信息
     *
     * @param pid 商品ID
     * @return 商品
     */
    ProductCustom findProductAndOrderById(Integer pid);

}
