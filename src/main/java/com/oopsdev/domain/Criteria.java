package com.oopsdev.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
public class Criteria {

  private int pageNum; //현재 페이지 번호
  private int amount; //페이지당 출력되는 게시글 수
  
  private String type;
  private String keyword;

  public Criteria() {
    this(1, 10);
  }

  public Criteria(int pageNum, int amount) {
    this.pageNum = pageNum;
    this.amount = amount;
  }

  public int getPageStart() {
    return (this.pageNum - 1) * amount;
  }

  public String[] getTypeArr() {
    return type == null? new String[] {}: type.split("");
  }
}
