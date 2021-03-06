package com.muses.taoshop.manager.service;

import com.muses.taoshop.manager.entity.SysRole;

import java.util.List;
import java.util.Set;

/**
 * <pre>
 *  角色业务接口
 * </pre>
 *
 * @author nicky
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期: 2018.10.21 21:57    修改内容:
 * </pre>
 */
public interface ISysRoleService {
    /**
     * 获取所有用户角色
     * @return
     */
    Set<SysRole> getUserRoles(int userId);
}
