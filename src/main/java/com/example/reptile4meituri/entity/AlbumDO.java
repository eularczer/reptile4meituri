package com.example.reptile4meituri.entity;

import com.example.reptile4meituri.enums.InstitutionTypeEnum;

import javax.persistence.*;

/**
 * 美图日-相册实体类
 * eg.https://ii.hywly.com/a/1/27691/2.jpg
 *
 * @author zhangyiyang
 * @since 2019-06-15
 */
@Entity
@Table(name = "tbl_meituri_album")
public class AlbumDO {

    /**
     * ID 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * 编号
     * eg.27691
     */
    @Column(name = "number")
    private Integer number;

    /**
     * 总数
     * eg.58（0~58）
     */
    @Column(name = "total")
    private Integer total;

    /**
     * 标题（文件夹名的一部分）
     * eg.杨晨晨sugar《蕾丝控福利》 [语画界XIAOYU] Vol.051 写真集
     */
    @Column(name = "title")
    private String title;

    /**
     * 所属机构
     *
     * @see InstitutionTypeEnum
     */
    @Column(name = "institution_type")
    private Integer institutionType;


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(Integer institutionType) {
        this.institutionType = institutionType;
    }
}
