package com.tvo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author thanglt on 8/5/2020
 * @version 1.0
 */
@Entity
@Table(name = "COUPON_OBJECT_USER")
@Data
public class CouponObjectUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_COUPON_OBJECT_USER")
    @SequenceGenerator(sequenceName = "COUPON_OBJECT_USER_SEQ", allocationSize = 1, name = "ID_COUPON_OBJECT_USER")
    @Column(name = "ID")
    private Long id;

    @Column(name = "QR_COUPON_ID")
    private Long qrCouponId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_CIF")
    private String userCif;

    @Column(name = "CREATED_AT")
    private Date createdAt;

    @Column(name = "CREATED_BY")
    private String createdBy;

}
