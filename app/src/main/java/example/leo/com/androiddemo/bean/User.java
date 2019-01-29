package example.leo.com.androiddemo.bean;

/**
 * @ProjectName: AndroidDemo
 * @Package: example.leo.com.androiddemo.bean
 * @ClassName: User
 * @Description: 用户实体类
 * @Author: wanglintao
 * @CreateDate: 2019/1/23 15:48
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/1/23 15:48
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class User {
    private String userId;
    private String userName;
    private String userPassword;
    private String idCard;
    private String phoneNum;
    private String birthDate;
    private String registDate;
    private String state;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getRegistDate() {
        return registDate;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
