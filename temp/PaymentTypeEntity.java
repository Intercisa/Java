package hu.ash.contractregistry.entity;

import hu.ash.contractregistry.entity.base.GenericEntity;
import hu.ash.contractregistry.entity.base.HasExpiration;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "PaymentType")
@Table(name = "asn_payment_type")
@Data
@EqualsAndHashCode(callSuper = true , onlyExplicitlyIncluded = true )
public class PaymentTypeEntity extends GenericEntity implements HasExpiration {

    @Column
    private String name;
    @Column
    @Temporal( TemporalType.TIMESTAMP)
    private Date expiration;

}
