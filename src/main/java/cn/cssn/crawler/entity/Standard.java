package cn.cssn.crawler.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "r_standard")
public class Standard {
    @Id
    private String id; // 5DDA8B9FFD5B18DEE05397BE0A0A95A7

    private String adoptCName; // "振动与冲击传感器校准方法  第16部分：地球重力法校准"
    private String adoptLevel; // "等同"
    private String adoptNo; // "ISO 16063-16:2014"
    private String adoptType; // "ISO"/"无"

    private String ccs; // "J04"

    private String cdCode; // "469"
    private String cdName; // "国家标准化管理委员会"

    private String cName; // "振动与冲击传感器校准方法 第16部分：地球重力法校准"
    private String eName; // "Methods for the calibration of vibration and shock transducers—Part 16: Calibration by Earth's gravitation"

    private String draftStaff; // "曾吾、杨海龙、周伦彬、毕海蛟"
    private String draftUnit; // "中国航空工业集团公司北京长城计量测试技术研究所、苏州集成校准检测认证有限公司、广州动态集成检测认证有限公司"

    private String hasGbf; // "0"

    private String ics; //"17.160";
    private String icsName11; // "17_计量学和测量、物理现象"
    private String icsName1Full; // "17_计量学和测量、物理现象/17.160_振动、冲击和振动测量"

    private String issueAnnNo; // "2018年第2号"

    @Temporal(TemporalType.DATE)
    private Date issueDate; // "2018-02-06",

    @Temporal(TemporalType.DATE)
    private Date actDate; // "2018-02-06"

    private String planCode; // "20170425-T-469"
    private Long projectId; // "105494"
    private Long sortWeight; // 20180812
    private String state; // "现行"

    private String stdCode; // "GB/T 20485.16-2018"
    private String stdCode2; // "GB/T20485.16-2018"
    private String stdCode3; // "GBT 20485.16-2018"
    private String stdCode4; // "GBT20485.16-2018"
    private String stdCode5; // "20485.16-2018"

    private String stdDomains; // "国家标准"
    private String stdNature; // "推荐性"
    private String stdType; // "方法"
    private Date sysInputTime; // "2018-02-07 00:57:50"

    private String tableName; // "BV_GB"
    private String taCode; // "TC53"
    private String taName; // "全国机械振动、冲击与状态监测标准化技术委员会"
    private String tmCode; // "TC53SC3"
    private String tmName; // "全国机械振动、冲击与状态监测标准化技术委员会振动测量仪器的使用和校准分会"
    private String totalRepe; // "GB/T 13823.19-2008" 全部替代标准

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date updateTime;

    public Standard() {
    }

    public Standard(String id, String adoptCName, String adoptLevel, String adoptNo, String adoptType, String ccs, String cdCode, String cdName, String cName, String eName, String draftStaff, String draftUnit, String hasGbf, String ics, String icsName11, String icsName1Full, String issueAnnNo, Date issueDate, Date actDate, String planCode, Long projectId, Long sortWeight, String state, String stdCode, String stdCode2, String stdCode3, String stdCode4, String stdCode5, String stdDomains, String stdNature, String stdType, Date sysInputTime, String tableName, String taCode, String taName, String tmCode, String tmName, String totalRepe, Date createTime, Date updateTime) {
        this.id = id;
        this.adoptCName = adoptCName;
        this.adoptLevel = adoptLevel;
        this.adoptNo = adoptNo;
        this.adoptType = adoptType;
        this.ccs = ccs;
        this.cdCode = cdCode;
        this.cdName = cdName;
        this.cName = cName;
        this.eName = eName;
        this.draftStaff = draftStaff;
        this.draftUnit = draftUnit;
        this.hasGbf = hasGbf;
        this.ics = ics;
        this.icsName11 = icsName11;
        this.icsName1Full = icsName1Full;
        this.issueAnnNo = issueAnnNo;
        this.issueDate = issueDate;
        this.actDate = actDate;
        this.planCode = planCode;
        this.projectId = projectId;
        this.sortWeight = sortWeight;
        this.state = state;
        this.stdCode = stdCode;
        this.stdCode2 = stdCode2;
        this.stdCode3 = stdCode3;
        this.stdCode4 = stdCode4;
        this.stdCode5 = stdCode5;
        this.stdDomains = stdDomains;
        this.stdNature = stdNature;
        this.stdType = stdType;
        this.sysInputTime = sysInputTime;
        this.tableName = tableName;
        this.taCode = taCode;
        this.taName = taName;
        this.tmCode = tmCode;
        this.tmName = tmName;
        this.totalRepe = totalRepe;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdoptCName() {
        return adoptCName;
    }

    public void setAdoptCName(String adoptCName) {
        this.adoptCName = adoptCName;
    }

    public String getAdoptLevel() {
        return adoptLevel;
    }

    public void setAdoptLevel(String adoptLevel) {
        this.adoptLevel = adoptLevel;
    }

    public String getAdoptNo() {
        return adoptNo;
    }

    public void setAdoptNo(String adoptNo) {
        this.adoptNo = adoptNo;
    }

    public String getAdoptType() {
        return adoptType;
    }

    public void setAdoptType(String adoptType) {
        this.adoptType = adoptType;
    }

    public String getCcs() {
        return ccs;
    }

    public void setCcs(String ccs) {
        this.ccs = ccs;
    }

    public String getCdCode() {
        return cdCode;
    }

    public void setCdCode(String cdCode) {
        this.cdCode = cdCode;
    }

    public String getCdName() {
        return cdName;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getDraftStaff() {
        return draftStaff;
    }

    public void setDraftStaff(String draftStaff) {
        this.draftStaff = draftStaff;
    }

    public String getDraftUnit() {
        return draftUnit;
    }

    public void setDraftUnit(String draftUnit) {
        this.draftUnit = draftUnit;
    }

    public String getHasGbf() {
        return hasGbf;
    }

    public void setHasGbf(String hasGbf) {
        this.hasGbf = hasGbf;
    }

    public String getIcs() {
        return ics;
    }

    public void setIcs(String ics) {
        this.ics = ics;
    }

    public String getIcsName11() {
        return icsName11;
    }

    public void setIcsName11(String icsName11) {
        this.icsName11 = icsName11;
    }

    public String getIcsName1Full() {
        return icsName1Full;
    }

    public void setIcsName1Full(String icsName1Full) {
        this.icsName1Full = icsName1Full;
    }

    public String getIssueAnnNo() {
        return issueAnnNo;
    }

    public void setIssueAnnNo(String issueAnnNo) {
        this.issueAnnNo = issueAnnNo;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getActDate() {
        return actDate;
    }

    public void setActDate(Date actDate) {
        this.actDate = actDate;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getSortWeight() {
        return sortWeight;
    }

    public void setSortWeight(Long sortWeight) {
        this.sortWeight = sortWeight;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStdCode() {
        return stdCode;
    }

    public void setStdCode(String stdCode) {
        this.stdCode = stdCode;
    }

    public String getStdCode2() {
        return stdCode2;
    }

    public void setStdCode2(String stdCode2) {
        this.stdCode2 = stdCode2;
    }

    public String getStdCode3() {
        return stdCode3;
    }

    public void setStdCode3(String stdCode3) {
        this.stdCode3 = stdCode3;
    }

    public String getStdCode4() {
        return stdCode4;
    }

    public void setStdCode4(String stdCode4) {
        this.stdCode4 = stdCode4;
    }

    public String getStdCode5() {
        return stdCode5;
    }

    public void setStdCode5(String stdCode5) {
        this.stdCode5 = stdCode5;
    }

    public String getStdDomains() {
        return stdDomains;
    }

    public void setStdDomains(String stdDomains) {
        this.stdDomains = stdDomains;
    }

    public String getStdNature() {
        return stdNature;
    }

    public void setStdNature(String stdNature) {
        this.stdNature = stdNature;
    }

    public String getStdType() {
        return stdType;
    }

    public void setStdType(String stdType) {
        this.stdType = stdType;
    }

    public Date getSysInputTime() {
        return sysInputTime;
    }

    public void setSysInputTime(Date sysInputTime) {
        this.sysInputTime = sysInputTime;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTaCode() {
        return taCode;
    }

    public void setTaCode(String taCode) {
        this.taCode = taCode;
    }

    public String getTaName() {
        return taName;
    }

    public void setTaName(String taName) {
        this.taName = taName;
    }

    public String getTmCode() {
        return tmCode;
    }

    public void setTmCode(String tmCode) {
        this.tmCode = tmCode;
    }

    public String getTmName() {
        return tmName;
    }

    public void setTmName(String tmName) {
        this.tmName = tmName;
    }

    public String getTotalRepe() {
        return totalRepe;
    }

    public void setTotalRepe(String totalRepe) {
        this.totalRepe = totalRepe;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Standard{" +
                "id='" + id + '\'' +
                ", adoptCName='" + adoptCName + '\'' +
                ", adoptLevel='" + adoptLevel + '\'' +
                ", adoptNo='" + adoptNo + '\'' +
                ", adoptType='" + adoptType + '\'' +
                ", ccs='" + ccs + '\'' +
                ", cdCode='" + cdCode + '\'' +
                ", cdName='" + cdName + '\'' +
                ", cName='" + cName + '\'' +
                ", eName='" + eName + '\'' +
                ", draftStaff='" + draftStaff + '\'' +
                ", draftUnit='" + draftUnit + '\'' +
                ", hasGbf='" + hasGbf + '\'' +
                ", ics='" + ics + '\'' +
                ", icsName11='" + icsName11 + '\'' +
                ", icsName1Full='" + icsName1Full + '\'' +
                ", issueAnnNo='" + issueAnnNo + '\'' +
                ", issueDate=" + issueDate +
                ", actDate=" + actDate +
                ", planCode='" + planCode + '\'' +
                ", projectId=" + projectId +
                ", sortWeight=" + sortWeight +
                ", state='" + state + '\'' +
                ", stdCode='" + stdCode + '\'' +
                ", stdCode2='" + stdCode2 + '\'' +
                ", stdCode3='" + stdCode3 + '\'' +
                ", stdCode4='" + stdCode4 + '\'' +
                ", stdCode5='" + stdCode5 + '\'' +
                ", stdDomains='" + stdDomains + '\'' +
                ", stdNature='" + stdNature + '\'' +
                ", stdType='" + stdType + '\'' +
                ", sysInputTime=" + sysInputTime +
                ", tableName='" + tableName + '\'' +
                ", taCode='" + taCode + '\'' +
                ", taName='" + taName + '\'' +
                ", tmCode='" + tmCode + '\'' +
                ", tmName='" + tmName + '\'' +
                ", totalRepe='" + totalRepe + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
