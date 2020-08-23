package hu.ash.contractregistry.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.EqualsAndHashCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Data
@Accessors(chain = true)
@EqualsAndHashCode( callSuper = true, onlyExplicitlyIncluded = true )
@JsonInclude
public class PaymentType extends ActiveModel {

    private static final long serialVersionUID = 1740912094840494770L;

    @JsonInclude(Include.NON_NULL)
    private String name;

}