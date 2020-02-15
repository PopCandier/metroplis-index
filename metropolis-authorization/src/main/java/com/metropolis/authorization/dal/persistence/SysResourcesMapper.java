package com.metropolis.authorization.dal.persistence;

import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SysResources)表数据库访问层
 *
 * @author Pop
 * @since 2020-02-16 00:01:19
 */
public interface SysResourcesMapper extends BaseMapper<SysResources>{

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysResources queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysResources> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysResources 实例对象
     * @return 对象列表
     */
    List<SysResources> queryAll(SysResources sysResources);

    /**
     * 新增数据
     *
     * @param sysResources 实例对象
     * @return 影响行数
     */
    int insert(SysResources sysResources);

    /**
     * 修改数据
     *
     * @param sysResources 实例对象
     * @return 影响行数
     */
    int update(SysResources sysResources);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}