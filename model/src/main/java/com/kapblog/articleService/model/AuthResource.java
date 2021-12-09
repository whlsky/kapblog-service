package com.kapblog.articleService.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 资源表——记录restful形式下，所有的api
 * </p>
 *
 * @author nona9961
 * @since 2021-12-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AuthResource extends Model<AuthResource> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 资源名称
     */
    private String name;

    /**
     * restful路径
     */
    private String path;

    /**
     * restful方法类别
     */
    private String methodType;

    /**
     * 权限类别：1.需要权限；9.无需权限
     */
    private Integer authType;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
