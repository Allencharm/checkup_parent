package com.checkup.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author yjq
 * @since 2021-10-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TMember implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("fileNumber")
    private String filenumber;

    private String name;

    private String sex;

    @TableField("idCard")
    private String idcard;

    @TableField("phoneNumber")
    private String phonenumber;

    @TableField("regTime")
    private LocalDate regtime;

    private String password;

    private String email;

    private LocalDate birthday;

    private String remark;


}
