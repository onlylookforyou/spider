package com.gs.spider.mapper;

import com.gs.spider.model.commons.spiderResultData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by czx on 2017/5/8.
 */
public interface SpiderDataMapper {
       void insert(@Param("table") String table, @Param("models") List<spiderResultData> models);
       List<spiderResultData> selectByUrl(@Param("table") String table, @Param("url") String url);
}
