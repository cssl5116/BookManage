package com.book.www.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("BookManage")
@Data
public class Bookmanage implements Serializable {
  @TableId(type = IdType.AUTO)
  private Integer bId;

  private String bName;

  private String bAuthor;

  private Date bTime;
  /**
   * 选择所属分类:
   * 0、计算机/软件
   * 1、小说/文摘
   * 2、杂项
   */
  private Integer bType;
}
