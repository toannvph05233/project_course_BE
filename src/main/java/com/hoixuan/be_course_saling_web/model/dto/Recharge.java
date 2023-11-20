package com.hoixuan.be_course_saling_web.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recharge {
    double money;
    long idUser;
    long idReq;
}
