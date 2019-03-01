package com.lanou.pojo;


public class Girl {

  private long gId;
  private String gName;
  private long gAge;


  public long getGId() {
    return gId;
  }

  public void setGId(long gId) {
    this.gId = gId;
  }


  public String getGName() {
    return gName;
  }

  public void setGName(String gName) {
    this.gName = gName;
  }


  public long getGAge() {
    return gAge;
  }

  public void setGAge(long gAge) {
    this.gAge = gAge;
  }

  @Override
  public String toString() {
    return "Girl{" +
            "gId=" + gId +
            ", gName='" + gName + '\'' +
            ", gAge=" + gAge +
            '}';
  }
}
