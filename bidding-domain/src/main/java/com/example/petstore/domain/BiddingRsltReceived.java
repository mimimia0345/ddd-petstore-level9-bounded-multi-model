package com.example.petstore.domain;

import com.example.petstore.domain.*;
import com.example.petstore.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class BiddingRsltReceived extends AbstractEvent {

    private Long biddingId;
    private Long gameReservationId;
    private Long businessId;
    private String businessName;
    private Long businessPhoneNum;
    private Long biddingAmount;
    private String biddingStatus;

    public BiddingRsltReceived(Bidding aggregate) {
        super(aggregate);
    }

    public BiddingRsltReceived() {
        super();
    }
    // keep

}
