package org.publiccms.entities.sys;
// Generated 2016-11-19 15:33:56 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysDeptCategoryId generated by hbm2java
 */
@Embeddable
public class SysDeptCategoryId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "部门", condition = true)
    private int deptId;
    @GeneratorColumn(title = "分类", condition = true)
    private int categoryId;

    public SysDeptCategoryId() {
    }

    public SysDeptCategoryId(int deptId, int categoryId) {
        this.deptId = deptId;
        this.categoryId = categoryId;
    }

    @Column(name = "dept_id", nullable = false)
    public int getDeptId() {
        return this.deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Column(name = "category_id", nullable = false)
    public int getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof SysDeptCategoryId))
            return false;
        SysDeptCategoryId castOther = (SysDeptCategoryId) other;

        return (this.getDeptId() == castOther.getDeptId()) && (this.getCategoryId() == castOther.getCategoryId());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getDeptId();
        result = 37 * result + this.getCategoryId();
        return result;
    }

}
