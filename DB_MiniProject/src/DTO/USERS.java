package DTO;

import java.util.Date;

public class USERS {
    private String userID;
    private String password;
    private String userName;
    private String tel;
    private Date regdate;
    private String rentalYN;
    private int delayCount;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getRentalYN() {
        return rentalYN;
    }

    public void setRentalYN(String rentalYN) {
        this.rentalYN = rentalYN;
    }

    public int getDelayCount() {
        return delayCount;
    }

    public void setDelayCount(int delayCount) {
        this.delayCount = delayCount;
    }
}
