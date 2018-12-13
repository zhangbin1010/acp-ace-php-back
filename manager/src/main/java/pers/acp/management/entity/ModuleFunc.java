package pers.acp.management.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zhangbin by 2018-1-17 17:15
 * @since JDK 11
 */
@Entity
@Table(name = "t_module_func", indexes = {
        @Index(columnList = "code,appid")
})
public class ModuleFunc {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getModuleid() {
        return moduleid;
    }

    public void setModuleid(String moduleid) {
        this.moduleid = moduleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getIslog() {
        return islog;
    }

    public void setIslog(int islog) {
        this.islog = islog;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "guid")
    @GeneratedValue(generator = "idGenerator")
    @Column(length = 36, nullable = false)
    private String id;

    @Column(length = 36, nullable = false)
    private String appid;

    @Column(length = 36, nullable = false)
    private String moduleid;

    @Column(nullable = false)
    private String name = "";

    @Column(length = 100, nullable = false)
    private String code = "";

    @Column(nullable = false)
    private int islog;

    @Column(nullable = false)
    private int type;

}
