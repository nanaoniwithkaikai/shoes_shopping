package com.onuo.goods.dao;

import com.onuo.common.util.CommonMapper;
import org.junit.Test;

public class ShoesImgMapperTest {
    ShoesImgMapper mapper= (ShoesImgMapper) CommonMapper.getInstance().getMapper(ShoesImgMapper.class);

    /**
     * 查询指定鞋子的所有图片
     */
    @Test
    public void queryAllImgByShooesId(){
        mapper.queryAllImgByShooesId("1001");
    }
}
