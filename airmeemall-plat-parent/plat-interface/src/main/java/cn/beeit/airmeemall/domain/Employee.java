package cn.beeit.airmeemall.domain;/*
 * @Author li zhen qiang
 * @Description: 员工实体类
 * @Date 2019/1/27
 * @Version 1.0
 * @ClassName: Employee
 **/

public class Employee {
    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
