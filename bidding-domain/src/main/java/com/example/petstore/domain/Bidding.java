package biddinglv.domain;

import biddinglv.ReservationApplication;
import biddinglv.domain.BiddingAttended;
import biddinglv.domain.BiddingRequestReceived;
import biddinglv.domain.BiddingRsltReceived;
import biddinglv.domain.BiddingRsltRequested;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Bidding_table")
@Data
public class Bidding {

    private Long biddingId;

    private Long gameReservationId;

    private Long businessId;

    private String businessName;

    private Long businessPhoneNum;

    private Long biddingAmount;

    private String biddingStatus;

    @PostPersist
    public void onPostPersist() {
        BiddingAttended biddingAttended = new BiddingAttended(this);
        biddingAttended.publishAfterCommit();

        BiddingRsltRequested biddingRsltRequested = new BiddingRsltRequested(
            this
        );
        biddingRsltRequested.publishAfterCommit();

        BiddingRequestReceived biddingRequestReceived = new BiddingRequestReceived(
            this
        );
        biddingRequestReceived.publishAfterCommit();

        BiddingRsltReceived biddingRsltReceived = new BiddingRsltReceived(this);
        biddingRsltReceived.publishAfterCommit();
    }

    public static BiddingRepository repository() {
        BiddingRepository biddingRepository = ReservationApplication.applicationContext.getBean(
            BiddingRepository.class
        );
        return biddingRepository;
    }
}
