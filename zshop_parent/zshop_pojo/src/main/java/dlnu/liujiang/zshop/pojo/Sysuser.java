package dlnu.liujiang.zshop.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: liujiang
 * @Date: 2019/5/7 0007
 * Description: dlnu.liujiang.zshop.pojo
 * @version: 1.0
 */
public class Sysuser  implements Serializable {

      private Integer id;
      private String name;
      private String loginname;
      private String password;
      private String phone;
      private String email;
      private Integer is_vaild;
      private Date createDate;
      private Integer role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIs_vaild() {
        return is_vaild;
    }

    public void setIs_vaild(Integer is_vaild) {
        this.is_vaild = is_vaild;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
