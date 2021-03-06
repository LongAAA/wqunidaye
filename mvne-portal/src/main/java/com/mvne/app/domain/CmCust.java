package com.mvne.app.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cm_cust
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class CmCust {
    /**
     * Database Column Remarks:
     *   虚商编码 + int(9)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CUST_ID
     *
     * @mbggenerated
     */
    private String custId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CUST_NAME
     *
     * @mbggenerated
     */
    private String custName;

    /**
     * Database Column Remarks:
     *   01 个人客户 02 单位客户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CUST_TYPE
     *
     * @mbggenerated
     */
    private String custType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CERT_NUM
     *
     * @mbggenerated
     */
    private String certNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CERT_ADDR
     *
     * @mbggenerated
     */
    private String certAddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CERT_ISSUE_DATE
     *
     * @mbggenerated
     */
    private Date certIssueDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CERT_ISSUE_ORG
     *
     * @mbggenerated
     */
    private String certIssueOrg;

    /**
     * Database Column Remarks:
     *   身份证正面
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CERT_FRONT_ID
     *
     * @mbggenerated
     */
    private String certFrontId;

    /**
     * Database Column Remarks:
     *   身份证背面
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CERT_BACK_ID
     *
     * @mbggenerated
     */
    private String certBackId;

    /**
     * Database Column Remarks:
     *   手持身份证图片
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CERT_PERSON_ID
     *
     * @mbggenerated
     */
    private String certPersonId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.BIRTHDAY
     *
     * @mbggenerated
     */
    private Date birthday;

    /**
     * Database Column Remarks:
     *   0：女 1：男 2：未知
     *               
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.SEX
     *
     * @mbggenerated
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.ADDRESS
     *
     * @mbggenerated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.MVNO_ID
     *
     * @mbggenerated
     */
    private String mvnoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CONTACT_NAME
     *
     * @mbggenerated
     */
    private String contactName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CONTACT_TEL
     *
     * @mbggenerated
     */
    private String contactTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CONTACT_ADDR
     *
     * @mbggenerated
     */
    private String contactAddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.EMAIL
     *
     * @mbggenerated
     */
    private String email;

    /**
     * Database Column Remarks:
     *   0：未认证 1：认证成功 2：认证失败
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.VERIFY_FLAG
     *
     * @mbggenerated
     */
    private String verifyFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.STATE_CHG_DATE
     *
     * @mbggenerated
     */
    private Date stateChgDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.CREATE_DATE
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   预留字段
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.OPER_ID
     *
     * @mbggenerated
     */
    private Integer operId;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cm_cust.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CUST_ID
     *
     * @return the value of cm_cust.CUST_ID
     *
     * @mbggenerated
     */
    public String getCustId() {
        return custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CUST_ID
     *
     * @param custId the value for cm_cust.CUST_ID
     *
     * @mbggenerated
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CUST_NAME
     *
     * @return the value of cm_cust.CUST_NAME
     *
     * @mbggenerated
     */
    public String getCustName() {
        return custName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CUST_NAME
     *
     * @param custName the value for cm_cust.CUST_NAME
     *
     * @mbggenerated
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CUST_TYPE
     *
     * @return the value of cm_cust.CUST_TYPE
     *
     * @mbggenerated
     */
    public String getCustType() {
        return custType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CUST_TYPE
     *
     * @param custType the value for cm_cust.CUST_TYPE
     *
     * @mbggenerated
     */
    public void setCustType(String custType) {
        this.custType = custType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CERT_NUM
     *
     * @return the value of cm_cust.CERT_NUM
     *
     * @mbggenerated
     */
    public String getCertNum() {
        return certNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CERT_NUM
     *
     * @param certNum the value for cm_cust.CERT_NUM
     *
     * @mbggenerated
     */
    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CERT_ADDR
     *
     * @return the value of cm_cust.CERT_ADDR
     *
     * @mbggenerated
     */
    public String getCertAddr() {
        return certAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CERT_ADDR
     *
     * @param certAddr the value for cm_cust.CERT_ADDR
     *
     * @mbggenerated
     */
    public void setCertAddr(String certAddr) {
        this.certAddr = certAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CERT_ISSUE_DATE
     *
     * @return the value of cm_cust.CERT_ISSUE_DATE
     *
     * @mbggenerated
     */
    public Date getCertIssueDate() {
        return certIssueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CERT_ISSUE_DATE
     *
     * @param certIssueDate the value for cm_cust.CERT_ISSUE_DATE
     *
     * @mbggenerated
     */
    public void setCertIssueDate(Date certIssueDate) {
        this.certIssueDate = certIssueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CERT_ISSUE_ORG
     *
     * @return the value of cm_cust.CERT_ISSUE_ORG
     *
     * @mbggenerated
     */
    public String getCertIssueOrg() {
        return certIssueOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CERT_ISSUE_ORG
     *
     * @param certIssueOrg the value for cm_cust.CERT_ISSUE_ORG
     *
     * @mbggenerated
     */
    public void setCertIssueOrg(String certIssueOrg) {
        this.certIssueOrg = certIssueOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CERT_FRONT_ID
     *
     * @return the value of cm_cust.CERT_FRONT_ID
     *
     * @mbggenerated
     */
    public String getCertFrontId() {
        return certFrontId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CERT_FRONT_ID
     *
     * @param certFrontId the value for cm_cust.CERT_FRONT_ID
     *
     * @mbggenerated
     */
    public void setCertFrontId(String certFrontId) {
        this.certFrontId = certFrontId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CERT_BACK_ID
     *
     * @return the value of cm_cust.CERT_BACK_ID
     *
     * @mbggenerated
     */
    public String getCertBackId() {
        return certBackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CERT_BACK_ID
     *
     * @param certBackId the value for cm_cust.CERT_BACK_ID
     *
     * @mbggenerated
     */
    public void setCertBackId(String certBackId) {
        this.certBackId = certBackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CERT_PERSON_ID
     *
     * @return the value of cm_cust.CERT_PERSON_ID
     *
     * @mbggenerated
     */
    public String getCertPersonId() {
        return certPersonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CERT_PERSON_ID
     *
     * @param certPersonId the value for cm_cust.CERT_PERSON_ID
     *
     * @mbggenerated
     */
    public void setCertPersonId(String certPersonId) {
        this.certPersonId = certPersonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.BIRTHDAY
     *
     * @return the value of cm_cust.BIRTHDAY
     *
     * @mbggenerated
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.BIRTHDAY
     *
     * @param birthday the value for cm_cust.BIRTHDAY
     *
     * @mbggenerated
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.SEX
     *
     * @return the value of cm_cust.SEX
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.SEX
     *
     * @param sex the value for cm_cust.SEX
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.ADDRESS
     *
     * @return the value of cm_cust.ADDRESS
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.ADDRESS
     *
     * @param address the value for cm_cust.ADDRESS
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.MVNO_ID
     *
     * @return the value of cm_cust.MVNO_ID
     *
     * @mbggenerated
     */
    public String getMvnoId() {
        return mvnoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.MVNO_ID
     *
     * @param mvnoId the value for cm_cust.MVNO_ID
     *
     * @mbggenerated
     */
    public void setMvnoId(String mvnoId) {
        this.mvnoId = mvnoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CONTACT_NAME
     *
     * @return the value of cm_cust.CONTACT_NAME
     *
     * @mbggenerated
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CONTACT_NAME
     *
     * @param contactName the value for cm_cust.CONTACT_NAME
     *
     * @mbggenerated
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CONTACT_TEL
     *
     * @return the value of cm_cust.CONTACT_TEL
     *
     * @mbggenerated
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CONTACT_TEL
     *
     * @param contactTel the value for cm_cust.CONTACT_TEL
     *
     * @mbggenerated
     */
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CONTACT_ADDR
     *
     * @return the value of cm_cust.CONTACT_ADDR
     *
     * @mbggenerated
     */
    public String getContactAddr() {
        return contactAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CONTACT_ADDR
     *
     * @param contactAddr the value for cm_cust.CONTACT_ADDR
     *
     * @mbggenerated
     */
    public void setContactAddr(String contactAddr) {
        this.contactAddr = contactAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.EMAIL
     *
     * @return the value of cm_cust.EMAIL
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.EMAIL
     *
     * @param email the value for cm_cust.EMAIL
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.VERIFY_FLAG
     *
     * @return the value of cm_cust.VERIFY_FLAG
     *
     * @mbggenerated
     */
    public String getVerifyFlag() {
        return verifyFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.VERIFY_FLAG
     *
     * @param verifyFlag the value for cm_cust.VERIFY_FLAG
     *
     * @mbggenerated
     */
    public void setVerifyFlag(String verifyFlag) {
        this.verifyFlag = verifyFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.STATE_CHG_DATE
     *
     * @return the value of cm_cust.STATE_CHG_DATE
     *
     * @mbggenerated
     */
    public Date getStateChgDate() {
        return stateChgDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.STATE_CHG_DATE
     *
     * @param stateChgDate the value for cm_cust.STATE_CHG_DATE
     *
     * @mbggenerated
     */
    public void setStateChgDate(Date stateChgDate) {
        this.stateChgDate = stateChgDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.CREATE_DATE
     *
     * @return the value of cm_cust.CREATE_DATE
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.CREATE_DATE
     *
     * @param createDate the value for cm_cust.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.OPER_ID
     *
     * @return the value of cm_cust.OPER_ID
     *
     * @mbggenerated
     */
    public Integer getOperId() {
        return operId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.OPER_ID
     *
     * @param operId the value for cm_cust.OPER_ID
     *
     * @mbggenerated
     */
    public void setOperId(Integer operId) {
        this.operId = operId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cm_cust.REMARK
     *
     * @return the value of cm_cust.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cm_cust.REMARK
     *
     * @param remark the value for cm_cust.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}