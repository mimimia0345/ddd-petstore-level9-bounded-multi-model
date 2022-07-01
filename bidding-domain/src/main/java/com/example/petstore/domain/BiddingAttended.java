package biddinglv.domain;

import biddinglv.domain.*;
import biddinglv.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class BiddingAttended extends AbstractEvent {

    private Long biddingId;
    private Long gameReservationId;
    private Long businessId;
    private String businessName;
    private Long businessPhoneNum;
    private Long biddingAmount;
    private String biddingStatus;

    public BiddingAttended(Bidding aggregate) {
        super(aggregate);
    }

    public BiddingAttended() {
        super();
    }
    // keep

}
